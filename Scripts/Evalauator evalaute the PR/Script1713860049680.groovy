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

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/div_Use another account'))

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/input_Sign in_loginfmt'), 'LIZ.POPS@stag.petronas.com')

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Evalautor evalaute the PR/input_Enter password_passwd'), 'yebeLcKw/xuwU7INusqD8t2ecJ4zggGE')

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/i_DAN POPS_icon fa fa-bell fa-1x'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/span_DAN POPS'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/span_has requested for your evaluation for'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/span_SC2404000857'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Start Evaluation'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Recommended by buyer_btn myprocure-b_bfb2f9'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Recommended by buyer_btn myprocure-b_bfb2f9'))

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_Remarks_b58-b9-b2-TextArea_Value'), 'r')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_r'), 're')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_re'), 'rej')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_rej'), 'reje')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_reje'), 'rejec')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_rejec'), 'reject')

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Submit (1)'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/div_Accepted'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/span_reject'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Done'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/i_Delivery Insights_icon text-light-blue-gr_c57189'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Complete Evaluation'))

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_Remark_b7-b16-b2-TextArea_Value'), 'c')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_c'), 'co')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_co'), 'com')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_com'), 'coml')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_coml'), 'com')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_com'), 'comp')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_comp'), 'compl')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_compl'), 'comple')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_comple'), 'complet')

WebUI.setText(findTestObject('Object Repository/Evalautor evalaute the PR/textarea_complet'), 'complete')

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/button_Submit'))

WebUI.click(findTestObject('Object Repository/Evalautor evalaute the PR/div_HomeShopping CartSC2404000857Shopping C_99aabf'))

WebUI.closeBrowser()

