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

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/div_Use another account'))

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Sign in_loginfmt'), 'DAN.POPS@stag.petronas.com')

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/input_Sign in_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Enter password_passwd'), 'yebeLcKw/xuwU7INusqD8t2ecJ4zggGE')

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/input_Sign in_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/i_LIZ POPS_icon fa fa-bell fa-1x'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/span_LIZ POPS'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/span_has completed the evaluation for'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/span_SC2404000857'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/button_View details'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/i_Delivery Insights_icon text-light-blue-gr_c57189'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/button_Send for Approval'))

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_Award justification_b19-TextArea_Value'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_a'), 'aw')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_aw'), 'awa')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_awa'), 'awar')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_awar'), 'award')

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/button_Send for Approval'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/div_Add user'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/div_Choose user'))

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search'), 'T')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1'), 'TE')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2'), 
    'TED')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2_3'), 
    'TED ')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2_3_4'), 
    'TED P')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2_3_4_5'), 
    'TED PO')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2_3_4_5_6'), 
    'TED POp')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2_3_4_5_6_7'), 
    'TED PO')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2_3_4_5_6'), 
    'TED POP')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/input_Choose user_b7-b6-b4-Input_Search_1_2_3_4_5_6_7_8'), 
    'TED POPS')

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/span_TED POPS'))

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_Remarks_b7-b6-b1-TextArea_Value'), 'P')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_P'), 'Pl')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_Pl'), 'Ple')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_Ple'), 'Plea')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_Plea'), 'Pleas')

WebUI.setText(findTestObject('Object Repository/Buyer send SC for Appoval/textarea_Pleas'), 'Please')

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/button_Submit'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Buyer send SC for Appoval/span_Pending approval'))

WebUI.closeBrowser()

