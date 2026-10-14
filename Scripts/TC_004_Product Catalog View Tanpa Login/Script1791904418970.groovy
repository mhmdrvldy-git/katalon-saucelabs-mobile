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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration

// Load APK menggunakan dynamic/project-relative path
String apk = new File(RunConfiguration.getProjectDir(), 'Data/APK/APK-sauce-labs-stg.2.7.1.apk').absolutePath

Mobile.startApplication(apk, false, FailureHandling.STOP_ON_FAILURE)

// Tanpa melakukan login, coba verifikasi apakah teks katalog produk terlihat
boolean isCatalogVisible = Mobile.verifyElementNotVisible(findTestObject('Products-Page/txt-products'), 5, FailureHandling.OPTIONAL)

// Assertion untuk memastikan elemen katalog benar-benar tidak tampil
assert isCatalogVisible : "Negative Test Failed: Halaman katalog produk seharusnya tersembunyi sebelum pengguna melakukan login."

Mobile.closeApplication()