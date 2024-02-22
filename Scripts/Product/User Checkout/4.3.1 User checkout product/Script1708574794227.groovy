import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login/1.1.1 - User login with standar_user'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product/addtocart'))

WebUI.click(findTestObject('Product/cart icon'))

WebUI.click(findTestObject('Product/btn-checkout'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementText(findTestObject('Product/assertion/span_Checkout Your Information'), 'Checkout: Your Information')

WebUI.setText(findTestObject('Product/firstname'), GlobalVariable.firstname)

WebUI.setText(findTestObject('Product/lastname'), GlobalVariable.lastname)

WebUI.setText(findTestObject('Product/postcal code'), GlobalVariable.PostcalCode)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Product/btn-continue'))

WebUI.verifyElementText(findTestObject('Product/assertion/span_Checkout Overview'), 'Checkout: Overview')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Product/assertion/button_Finish'))

WebUI.takeFullPageScreenshot()

WebUI.verifyElementText(findTestObject('Product/assertion/h2_Thank you for your order'), 'Thank you for your order!')

WebUI.takeFullPageScreenshot()

WebUI.closeBrowser()

