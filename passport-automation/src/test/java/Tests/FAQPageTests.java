package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FAQPage.*;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class FAQPageTests extends TestBase {
	
	private LandingPage landingPage;
	private FAQPage faqPage;
	
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			faqPage = new FAQPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test 
	public void FAQNavTest() throws InterruptedException{
		Thread.sleep(7000);
		landingPage.navigateToAbout();
		Thread.sleep(7000);
		faqPage.FAQNavTest();
	}

	@Override
	public void exitCriteria() {
		// TODO Auto-generated method stub
		
	}
}