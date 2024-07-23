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

WebUI.callTestCase(findTestCase('Login'), [('email') : 'mufadhalh@gmail.com', ('password') : 'b9s6kak0gCR+TplIL06fnQ=='], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AddItem/search_form'))

WebUI.setText(findTestObject('AddItem/search_form'), search)

WebUI.click(findTestObject('AddItem/search_icon'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('AddItem/item'))

WebUI.click(findTestObject('AddItem/beliSekarang'))

WebUI.click(findTestObject('AddItem/beliSekarang_confirm'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('AddItem/button_lanjut'))

WebUI.verifyElementText(findTestObject('AddItem/verify_pembayaran'), verify)

WebUI.takeFullPageScreenshot()

