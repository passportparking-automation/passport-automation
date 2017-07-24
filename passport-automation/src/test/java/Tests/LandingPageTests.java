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
	public void CheckMenuOptionsForExceptions() throws InterruptedException{
		Thread.sleep(5000);
		landingPage.CheckMenuOptionsForExceptions();
	}
	@Test
	public void checkLandingPageForExceptions() throws InterruptedException{
		Thread.sleep(5000);
		landingPage.CheckLandingPageForExceptions();
	}
	@Test
	public void EnterLocationOrPayToParkCodeTest() throws InterruptedException{
		Thread.sleep(5000);
		landingPage.EnterLocationOrPayToParkCodeTest();
		findParkingPage.CheckFindParkingForExceptions();
		driver.navigate().back();
	}/*
	@Test
	public void LandingPageScrollTest(){
		landingPage.SwipeLeftTest();
		landingPage.CheckLandingPageForExceptions();
		landingPage.SwipeRightTest();
		landingPage.CheckLandingPageForExceptions();
		landingPage.SwipeDownTest();
		landingPage.CheckLandingPageForExceptions();
		landingPage.SwipeUpTest();
		landingPage.CheckLandingPageForExceptions();
	}*/
}
