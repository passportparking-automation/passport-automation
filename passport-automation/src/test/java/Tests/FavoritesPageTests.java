package Tests;


import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import Pages.FavoritesPage.FavoritesPage;
import Pages.FavoritesPage.FavoritesPageAndroid;
import Pages.FavoritesPage.FavoritesPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class FavoritesPageTests extends TestBase {
	
	public FavoritesPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	private LandingPage landingPage;
	private FavoritesPage favoritesPage;
	
	@FindBy(name = "Don’t Allow")
	private static MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private static MobileElement allowButton;
	
	@FindBy(name = "OK")
	private static MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private static MobileElement okButtonBuddyBuild;
	
	@BeforeTest
	@Override
	public void setUpPage() throws Exception {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			favoritesPage = new FavoritesPageAndroid(driver);
			
			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			favoritesPage = new FavoritesPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void FavoritesTest(){	
		landingPage.navigateToFav();
		favoritesPage.FavoritesTest(); 
	}
}
