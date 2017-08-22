package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.FAQPage.*;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class FAQPageTests extends TestBase {
	
	public FAQPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private LandingPage landingPage;
	private FAQPage faqPage;
	
	@FindBy(name = "Don’t Allow")
	private static MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private static MobileElement allowButton;
	
	@FindBy(name = "OK")
	private static MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private static MobileElement okButtonBuddyBuild;
	
	@BeforeTest
	public void setUpPage() throws Exception {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			faqPage = new FAQPageAndroid(driver);
			
			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			faqPage = new FAQPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test 
	public void FAQNavTest() throws InterruptedException{
		landingPage.navigateToAbout();
		BasePage.sleep(5000);
		faqPage.FAQNavTest(); 
	}
}