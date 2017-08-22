package Tests;

import io.appium.java_client.MobileElement;

import java.io.BufferedReader;
import java.util.Scanner;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.FindParkingPage.FindParkingPage;
import Pages.FindParkingPage.FindParkingPageAndroid;
import Pages.FindParkingPage.FindParkingPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class LandingPageTests extends TestBase {
	
	public LandingPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private LandingPage landingPage;
	private FindParkingPage findParkingPage;
	
	@BeforeTest
	@Override
	public void setUpPage() throws Exception {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			findParkingPage = new FindParkingPageAndroid(driver);
			
			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			findParkingPage = new FindParkingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void CheckMenuOptionsForExceptions() throws InterruptedException{
		landingPage.CheckMenuOptionsForExceptions();
	}
	
	@Test
	public void checkLandingPageForExceptions() throws InterruptedException{
		landingPage.CheckLandingPageForExceptions();
	}
	
	/*@Test
	public void EnterLocationOrPayToParkCodeTest() throws InterruptedException{
		landingPage.EnterLocationOrPayToParkCodeTest();
		findParkingPage.CheckFindParkingForExceptions();
		findParkingPage.navToLanding();
	}
	*/
	@Test
	public void LandingPageSwipeTest(){
		landingPage.SwipeRightTest();
		landingPage.CheckMenuOptionsForExceptions();
		landingPage.SwipeLeftTest();
		landingPage.CheckLandingPageForExceptions();
		 
	}
	
}
