package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.FavoritesPage.FavoritesPage;
import Pages.FavoritesPage.FavoritesPageAndroid;
import Pages.FindParkingPage.FindParkingPage;
import Pages.FindParkingPage.FindParkingPageAndroid;
import Pages.FindParkingPage.FindParkingPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class FindParkingPageTests extends TestBase {

	public FindParkingPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private LandingPage landingPage;
	private FindParkingPage findParkingPage;

	@FindBy(name = "Don’t Allow")
	private static MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private static MobileElement allowButton;
	
	@FindBy(name = "OK")
	private static MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private static MobileElement okButtonBuddyBuild;

	@BeforeTest
	// @Override
	public void setUpPage() throws Exception {
		switch (TestBase.executionOS) {
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
	public void CheckFindParkingForExceptions() {
		landingPage.navigateToFindLocation();
		findParkingPage.CheckFindParkingForExceptions();
		findParkingPage.navToLanding();
	}

	@Test
	public void FindParkingNavTest() {
		landingPage.navigateToFindLocation();
		findParkingPage.FindParkingNavTest();
		landingPage.CheckLandingPageForExceptions();
	}

	@Test
	public void ZoneTest() {
		landingPage.navigateToFindLocation();
		findParkingPage.ZoneTest();
		findParkingPage.CheckFindParkingForExceptions();
		findParkingPage.navToLanding();
	}

	@Test
	public void ZoneTest2() {
		landingPage.navigateToFindLocation();
		findParkingPage.ZoneTest2();
		findParkingPage.navToLanding();
	}

	@Test
	public void NumericValueZoneTest() {
		landingPage.navigateToFindLocation();
		findParkingPage.NumericValueZoneTest();
		findParkingPage.navToLanding();
	}
	
	/*@Test
	public void TextValueZoneTest() {
		landingPage.navigateToFindLocation();
		findParkingPage.TextValueZoneTest();
		findParkingPage.navToLanding();
	}
	
	@Test
	public void ZoneIconTest() {
		landingPage.navigateToFindLocation();
		findParkingPage.ZoneIconTest();
		findParkingPage.navToLanding(); 
	}*/

}