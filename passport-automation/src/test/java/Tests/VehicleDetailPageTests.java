package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageAndroid;
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
import Pages.UpdateVehiclePage.UpdateVehiclePage;
import Pages.UpdateVehiclePage.UpdateVehiclePageAndroid;
import Pages.VehicleDetailPage.VehicleDetailPage;
import Pages.VehicleDetailPage.VehicleDetailPageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class VehicleDetailPageTests extends TestBase{
	private VehicleDetailPage vehicleDetailPage;
	private LandingPage landingPage;
	private AddVehiclePage addVehiclePage;
	private VehiclesPage vehiclesPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;
	private UpdateVehiclePage updateVehiclePage;
	 
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			vehicleDetailPage = new VehicleDetailPageAndroid(driver);
			landingPage = new LandingPageAndroid(driver);
			addVehiclePage = new AddVehiclePageAndroid(driver);
			vehiclesPage = new VehiclesPageAndroid(driver);
			logInPage = new LoginPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			codeVerificationPage = new CodeVerificationPageAndroid(driver);
			pinPage = new PINPageAndroid(driver);
			updateVehiclePage = new UpdateVehiclePageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void CheckVehicleDetailPageForExceptions(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.SendCorrectPINTest();
		BasePage.sleep(3000);
		pinPage.navToLanding();
		landingPage.navigateToVehiclesPage();
		vehiclesPage.clickTestVehicle();
		vehicleDetailPage.NavTest();
		vehiclesPage.CheckVehiclesPageForExceptions();
		vehiclesPage.clickTestVehicle();
		vehicleDetailPage.PrivacyNavTest();
		vehicleDetailPage.NavToUpdate();
		updateVehiclePage.NavTest();
		
	}

}
