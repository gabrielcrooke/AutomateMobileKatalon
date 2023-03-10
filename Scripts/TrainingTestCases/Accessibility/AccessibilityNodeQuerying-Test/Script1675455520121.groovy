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

Mobile.startApplication('/Users/gabrielcrooke/Desktop/APK/APIDemos.apk', true)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/Accessibility1'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/AccessibilityNodeQuerying'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/DoLaundryCheckBox'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/TakeOutTrashCheckBox'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/NapCheckBox'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/DoTaxesCheckBoxOk'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/TakeOutTrashCheckBox'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/TeaWithAuntSharonCheckBoxOk'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/SettingBtn'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/ColorTheme'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/ClockBack'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/ActivateUseClockBack'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/DenyClockBack'), 0)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/BackClockback'), 0)

Mobile.waitForElementPresent(findTestObject('AccessibilityNodeQuerying/BackClockback'), 10)

Mobile.tap(findTestObject('AccessibilityNodeQuerying/BackClockback'), 0)

Mobile.pressBack()

Mobile.closeApplication()

