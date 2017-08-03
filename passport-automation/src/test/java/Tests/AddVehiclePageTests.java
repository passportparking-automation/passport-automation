package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageAndroid;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class AddVehiclePageTests extends TestBase {
	
	private LandingPage landingPage;
	private AddVehiclePage addVehiclePage;
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
			addVehiclePage = new AddVehiclePageAndroid(driver);
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
	
	@Test
	public void AddVehicleTest(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.SendCorrectPINTest();
		
		landingPage.navigateToVehiclesPage();
		vehiclesPage.CheckVehiclesPageForExceptions();
		addVehiclePage.AddVehicleTest();
		vehiclesPage.CheckUpdateToVehiclePage();
	}
	
}
