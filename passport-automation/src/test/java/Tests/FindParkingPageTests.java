package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FavoritesPage.FavoritesPage;
import Pages.FavoritesPage.FavoritesPageAndroid;
import Pages.FindParkingPage.FindParkingPage;
import Pages.FindParkingPage.FindParkingPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class FindParkingPageTests extends TestBase {

	private LandingPage landingPage;
	private FindParkingPage findParkingPage;

	@BeforeTest
	// @Override
	public void setUpPage() {
		switch (TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			findParkingPage = new FindParkingPageAndroid(driver);

			break;
		case IOS:
			// landingpage = new LandingPageIOS(driver);

			break;
		default:
			break;
		}
	}

	@Test
	public void CheckFindParkingForExceptions() throws InterruptedException {

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
	public void ZoneTest() throws InterruptedException {
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