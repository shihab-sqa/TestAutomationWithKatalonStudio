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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://practicetestautomation.com/practice-test-login/')

WebUI.click(findTestObject('Object Repository/Page_Test Login  Practice Test Automation/a_Contact'))

WebUI.click(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/button_Submit'))

WebUI.click(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields0first'), 
    'wewe')

WebUI.click(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields0first'))

WebUI.setText(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/input_First_wpformsfields0last'), 
    'wewe')

WebUI.setText(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields1'), 
    '')

WebUI.click(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/label_This field is required'))

WebUI.setText(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields1'), 
    'wewe')

WebUI.setText(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/textarea__wpformsfields2'), 
    'wewewe')

WebUI.click(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/div_If you have questions, suggestions, or _1fdbbf'))

WebUI.click(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/button_Submit'))

WebUI.setText(findTestObject('Object Repository/Page_Contact  Practice Test Automation  Sel_b632b1/input__wpformsfields1'), 
    'wewe@gmail.com')

