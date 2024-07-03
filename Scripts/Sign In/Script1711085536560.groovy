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

WebUI.navigateToUrl('https://login.microsoftonline.com/fa6434db-4921-4ae3-8a0c-60977ad6c33c/saml2?SAMLRequest=lZJfa8IwFMW%2fSsl72zSpbQ0qyGQguD%2fo3MNeJKbpDLRJl3s79Nuvdo7NF2Gv997fORzOnYBsataKeYcHu9YfnQYMjk1tQXxvpqTzVjgJBoSVjQaBSmzmDyvBIipa79ApV5O%2fzG1EAmiPxlkSLBdTYsodMrobJbnkVVGxMmMpH48kZ3xU5OWeqpxVakyCV%2b2hp6akF%2blRgE4vLaC02I8o4yHNQ0ZfKBejVKQ0YkmRJIy%2fkWDRZzJW4kAfEFsQcVy7d2OjxijvwFXobG2sjpRr4kpmKU%2fLfZiOWRKmUvOwkFSFGR3nuSwzxbmKh6AkmP%2bEuXMWukb7jfafRuntevVr1Wr0zkoIva4j1yGcAHUD2qL2rTfwbbvtlSDebJ4iCe2RzCaDhRiC%2btlZ639Sk%2fhKYHIp%2brEvZLl4drVRp%2bDe%2bUbi7b7OE1OG1XAq2nMLvadFEsSzi8f1%2b8y%2bAA%3d%3d&RelayState=https%3a%2f%2fpetronas-rel.outsystemsenterprise.com%2fMyProcure%2f')

WebUI.click(findTestObject('Object Repository/Sign In/div_Pick an account                        _b90e21'))

WebUI.click(findTestObject('Object Repository/Sign In/img_Connected to Windows_tile-img'))

WebUI.setText(findTestObject('Object Repository/Sign In/input_Sign in_loginfmt'), 'BES.POPS@stag.petronas.com')

WebUI.click(findTestObject('Object Repository/Sign In/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Sign In/input_Enter password_passwd'), 'yebeLcKw/xuwU7INusqD8t2ecJ4zggGE')

WebUI.click(findTestObject('Object Repository/Sign In/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Sign In/span_BES POPS'))

WebUI.click(findTestObject('Object Repository/Sign In/img'))

WebUI.click(findTestObject('Object Repository/Sign In/small_BES.POPSstag.petronas.com'))

WebUI.click(findTestObject('Object Repository/Sign In/div_You signed out of your account         _e1ff12'))

WebUI.click(findTestObject('Object Repository/Sign In/div_You signed out of your account         _e1ff12'))

WebUI.closeBrowser()

