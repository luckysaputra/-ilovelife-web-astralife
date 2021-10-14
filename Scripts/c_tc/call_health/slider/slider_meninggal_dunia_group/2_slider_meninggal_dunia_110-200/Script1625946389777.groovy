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
import option.ManageData as Path


slider_meninggal_dunia_con = slider_meninggal_dunia
println(slider_meninggal_dunia_con)
String slider_meninggal_dunia_fin =""

if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp110.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "90"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp120.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "100"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp130.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "110"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp140.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "120"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp150.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "130"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp160.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "140"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp170.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "150"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp180.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "160"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp190.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "170"}
else if(WebUI.verifyMatch(slider_meninggal_dunia_con, "Rp200.000.000", false, FailureHandling.OPTIONAL)==true){slider_meninggal_dunia_fin = "180"}

slider_meninggal_dunia_con = slider_meninggal_dunia_fin
println(slider_meninggal_dunia_con)
//con
WebUI.scrollToElement(Path.SLIDER_MANFAAT_MENINGGAL_DUNIA_SCRN2, 0)
String myStringa = slider_meninggal_dunia_con;
int vara = Integer.parseInt(myStringa)
WebUI.dragAndDropByOffset(Path.SLIDER_MANFAAT_MENINGGAL_DUNIA_SCRN2, vara, 0, FailureHandling.OPTIONAL)