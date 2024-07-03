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

WebUI.navigateToUrl('https://petronas-rel.outsystemsenterprise.com/MyProcure/')

WebUI.click(findTestObject('Object Repository/Approval approve the SC/div_Use another account'))

WebUI.setText(findTestObject('Object Repository/Approval approve the SC/input_Sign in_loginfmt'), 'TED.POPS@stag.petronas.com')

WebUI.click(findTestObject('Object Repository/Approval approve the SC/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Approval approve the SC/input_Enter password_passwd'), 'yebeLcKw/xs88mh0ojTNbQ==')

WebUI.click(findTestObject('Object Repository/Approval approve the SC/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Approval approve the SC/i_DAN POPS_icon fa fa-bell fa-1x'))

WebUI.click(findTestObject('Object Repository/Approval approve the SC/span_DAN POPS'))

WebUI.click(findTestObject('Object Repository/Approval approve the SC/span_has requested for your approval for'))

WebUI.click(findTestObject('Object Repository/Approval approve the SC/span_Pending approval'))

WebUI.click(findTestObject('Object Repository/Approval approve the SC/button_Approve'))

WebUI.setText(findTestObject('Object Repository/Approval approve the SC/textarea_Remarks_b7-b15-b1-TextArea_Value'), 'p')

WebUI.setText(findTestObject('Object Repository/Approval approve the SC/textarea_p'), 'pa')

WebUI.setText(findTestObject('Object Repository/Approval approve the SC/textarea_pa'), 'pas')

WebUI.setText(findTestObject('Object Repository/Approval approve the SC/textarea_pas'), 'pass')

WebUI.click(findTestObject('Object Repository/Approval approve the SC/button_Submit'))

WebUI.click(findTestObject('Object Repository/Approval approve the SC/button_Save'))

WebUI.click(findTestObject('Object Repository/Approval approve the SC/span_Approved'))

WebUI.closeBrowser()

