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

//to find specifi PR number
//set up data binding
def data = findTestData('Data Files/Purchase Request') //Purchase Request is the file name

//open browser, navigate to url, sign in ect
WebUI.openBrowser('')

WebUI.navigateToUrl('https://petronas-rel.outsystemsenterprise.com/MyProcure/')

WebUI.click(findTestObject('Object Repository/Select PR/div_Use another account'))

WebUI.setText(findTestObject('Object Repository/Select PR/input_Sign in_loginfmt'), 'ABE.POPS@stag.petronas.com')

WebUI.click(findTestObject('Object Repository/Select PR/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Select PR/input_Enter password_passwd'), 'yebeLcKw/xsGMzLcgVEATVnIes9q4cAM')

WebUI.click(findTestObject('Object Repository/Select PR/input_Sign in_idSIButton9'))

//WebUI.click(findTestObject('Object Repository/Select PR/dropdown icon'))

WebUI.click(findTestObject('Object Repository/Select PR/Marketplace from sidemenu'))
WebUI.click(findTestObject('Object Repository/Select PR/Marketplace title'))

//iterate over purchase request numbers
//for (int i = 1; i < data.getRowNumbers(); i++) {if i have multiple pr, i need to u for loop and letak click f(x) yg click checkbox n source at matke dlm for loop}
//find the pr and assign to variable (checkbox_PurchaseRequest)
def checkbox_PurchaseRequest = findTestData('Data Files/Purchase Request').getValue(1, 1)

//Locate the checkbox corresponding to the PR number and click the checkbox

WebUI.click(findTestObject('Object Repository/Select PR/checkbox_PurchaseRequest', [('Param') : checkbox_PurchaseRequest]))

//WebUI.click(findTestObject('Object Repository/Select PR/checkbox_PurchaseRequest'))

//click source at marketplace
WebUI.click(findTestObject('Object Repository/Select PR/span_Source at Marketplace'))

WebUI.closeBrowser()

