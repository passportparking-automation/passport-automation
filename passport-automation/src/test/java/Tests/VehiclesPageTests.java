package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class VehiclesPageTests  extends TestBase {
		
		private LandingPage landingPage;
		private VehiclesPage vehiclesPage;
		private LoginPage logInPage;
		private MobileVerPage mobileVerPage;
		private CodeVerificationPage codeVerificationPage;
		private PINPage pinPage;
		@BeforeTest
		public void setUpPage() {
			switch(TestBase.executionOS) {
			case ANDROID:
				landingPage = new LandingPageAndroid(driver);
				vehiclesPage = new VehiclesPageAndroid(driver);
				logInPage = new LoginPageAndroid(driver);
				mobileVerPage = new MobileVerPageAndroid(driver);
				codeVerificationPage = new CodeVerificationPageAndroid(driver);
				pinPage = new PINPageAndroid(driver);
				
				break;
			case IOS:
				//landingpage = new LandingPageIOS(driver);
				
				break;
			default:
				break;
			}
		}
		
		/*@Test
		public void CheckVehiclesPageForExceptions(){
			landingPage.login();
			landingPage.clickPayToPark();
			vehiclesPage.CheckVehiclesPageForExceptions();	
			vehiclesPage.navToLanding();
			landingPage.logout();
		}*/
		
		@Test
		public void AddVTest(){
			landingPage.login();
			landingPage.clickPayToPark();
			vehiclesPage.AddVTest();	
			vehiclesPage.navToLanding();
			landingPage.logout();
		}
		
		/*@Test
		public void NavTest(){
			landingPage.login();
			landingPage.clickPayToPark();
			vehiclesPage.NavTest();	
			vehiclesPage.navToLanding();
			landingPage.logout();
		}*/
		
}


