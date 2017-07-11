package Tests;

import java.io.BufferedReader;
import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class LandingPageTests extends TestBase {
	
	private LandingPage landingPage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void checkLandingPageForExceptions() throws InterruptedException{
		Thread.sleep(5000);
		landingPage.CheckLandingPageForExceptions();
		landingPage.CheckMenuOptionsForExceptions();
	}
	
}
