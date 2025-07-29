package general

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class login {
	@Keyword
	def valid_login () {
		WebUI.openBrowser('')

		WebUI.navigateToUrl(GlobalVariable.baseUrl)

		WebUI.maximizeWindow()

		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Login/field_username'), GlobalVariable.standard_user)

		WebUI.setText(findTestObject('Login/field_password'), GlobalVariable.password)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Login/button_login'))

		WebUI.verifyTextPresent('Swag Labs', false)

		WebUI.takeFullPageScreenshot()

	}
	@Keyword
	def username_not_regist() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl(GlobalVariable.baseUrl)
		
		WebUI.takeFullPageScreenshot()
		
		WebUI.setText(findTestObject('Login/field_username'), 'standart')
		
		WebUI.setText(findTestObject('Login/field_password'), 'secret')
		
		WebUI.takeFullPageScreenshot()
		
		WebUI.click(findTestObject('Login/button_login'))
		
		WebUI.verifyElementText(findTestObject('Login/assertion/h3_Epic sadface Username and password do not match any user in this service'),
			'Epic sadface: Username and password do not match any user in this service')
		
		WebUI.takeFullPageScreenshot()
		
	}
}
