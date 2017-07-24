package Tests;


import org.testng.annotations.*;

import Pages.FavoritesPage.FavoritesPage;
import Pages.FavoritesPage.FavoritesPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class FavoritesPageTests extends TestBase {
	
	private LandingPage landingPage;
	private FavoritesPage favoritesPage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			favoritesPage = new FavoritesPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
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

	@Override
	public void exitCriteria() {
		// TODO Auto-generated method stub
		
	}
		
		
	

}
