package Tests.AbstractBaseTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Pages.BasePage;
import driver.deviceAndroid;
import driver.deviceIOS;

public abstract class TestBase {
	private final static String TEST_URL = "https://parker.ppprk.com/park";
	private final static String URL_STRING = "http://127.0.0.1:4723/wd/hub";
	private static int TIMEOUT = 30;
	
	public static AppiumDriver<MobileElement> driver;
	static WebDriverWait wait;
	
	/* Depending upon which platform is to tested, tester need to change 
	 * the OS value either to: ANDROID, IOS or WEB
	 */ 	
	public static OS executionOS = OS.IOS;
	
	public enum OS {
		ANDROID,
		IOS,
		WEBANDROID,
		WEBIOS
	}
	
	@BeforeTest
    public abstract void setUpPage();
	
    @BeforeSuite
	public static void initAppium() throws MalformedURLException {

		URL url = new URL(URL_STRING);
		
		switch (executionOS) {
		case ANDROID:
			
			File appAndroid = getAndroidAppFile();
			System.out.println(appAndroid.getName());
			
			DesiredCapabilities capabilitiesAndroid = new DesiredCapabilities();
			capabilitiesAndroid.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceAndroid.platformName);
			capabilitiesAndroid.setCapability(MobileCapabilityType.DEVICE_NAME, "NotUsed");
			capabilitiesAndroid.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			capabilitiesAndroid.setCapability(MobileCapabilityType.APP, appAndroid);
			capabilitiesAndroid.setCapability("appPackage", deviceAndroid.appPackage);
			driver = new AppiumDriver<MobileElement>(url, capabilitiesAndroid);
			wait = new WebDriverWait(driver, 80);
			break;

		case IOS:
			
			File appIOS = getIOSAppFile();
			System.out.println(appIOS.getName());
			
			DesiredCapabilities capabilitiesIOS = new DesiredCapabilities();
			capabilitiesIOS.setCapability(MobileCapabilityType.PLATFORM_NAME, deviceIOS.platformName);
			capabilitiesIOS.setCapability(MobileCapabilityType.DEVICE_NAME, deviceIOS.deviceName);
			capabilitiesIOS.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
			capabilitiesIOS.setCapability(MobileCapabilityType.AUTOMATION_NAME,deviceIOS.automationName);
			capabilitiesIOS.setCapability("useNewWDA", "true");
			capabilitiesIOS.setCapability(MobileCapabilityType.UDID, deviceIOS.udid);
			capabilitiesIOS.setCapability(MobileCapabilityType.APP, appIOS);
			driver = new AppiumDriver<MobileElement>(url, capabilitiesIOS);
			wait = new WebDriverWait(driver, 80);
			break;
			
		case WEBANDROID:
			DesiredCapabilities capabilitiesWebAndroid = new DesiredCapabilities();
			capabilitiesWebAndroid.setCapability(MobileCapabilityType.BROWSER_NAME, deviceAndroid.browserNameChrome);
			capabilitiesWebAndroid.setCapability(MobileCapabilityType.DEVICE_NAME, deviceAndroid.deviceName);
			capabilitiesWebAndroid.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilitiesWebAndroid.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
			driver = new AppiumDriver<MobileElement>(url, capabilitiesWebAndroid);
			driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);

			BasePage.sleep(5000);
			driver.get(TEST_URL);
			BasePage.sleep(5000);

			break;
			
		case WEBIOS:
			DesiredCapabilities capabilitiesWebIOS = new DesiredCapabilities();
			capabilitiesWebIOS.setCapability(MobileCapabilityType.BROWSER_NAME, deviceIOS.browserNameSafari);
			capabilitiesWebIOS.setCapability(MobileCapabilityType.DEVICE_NAME, deviceIOS.deviceName);
			capabilitiesWebIOS.setCapability(MobileCapabilityType.PLATFORM_NAME,deviceIOS.platformName);
			capabilitiesWebIOS.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "10");
			capabilitiesWebIOS.setCapability(MobileCapabilityType.AUTOMATION_NAME, deviceIOS.automationName);
			capabilitiesWebIOS.setCapability(MobileCapabilityType.UDID, deviceIOS.udid);
			driver = new AppiumDriver<MobileElement>(url, capabilitiesWebIOS);

			BasePage.sleep(5000);
			driver.get(TEST_URL);
			BasePage.sleep(5000);
			
			break;
		}
	}
    
    @AfterSuite
    public void tearDownAppium() {
		if (driver != null) {
            driver.quit();
        }
	}
    
	public static File getAndroidAppFile() {
		File appDir = new File(deviceAndroid.appDir);
		return new File(appDir, deviceAndroid.appName);
	}
	
	public static File getIOSAppFile() {
		File appDir = new File(deviceIOS.appDir);
		return new File(appDir, deviceIOS.appName);
	}
	
    @AfterClass
    public void restartApp() {
    }
	
}
