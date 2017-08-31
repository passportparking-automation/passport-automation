package Tests;

import java.io.BufferedReader;
import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.FindParkingPage.FindParkingPage;
import Pages.FindParkingPage.FindParkingPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class LandingPageTests extends TestBase {
	
	private LandingPage landingPage;
	private FindParkingPage findParkingPage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			findParkingPage = new FindParkingPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}

	@Test
	public void LandingPageTest() throws InterruptedException{
		//landingPage.SwipeRightTest();
		//landingPage.CheckMenuOptionsForExceptions();
		//landingPage.SwipeLeftTest();
		landingPage.CheckLandingPageForExceptions();
		landingPage.EnterLocationOrPayToParkCodeTest();
		
		
	}
	
}
