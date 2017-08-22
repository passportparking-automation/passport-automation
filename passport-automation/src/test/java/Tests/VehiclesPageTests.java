package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.CodeVerificationPage.CodeVerificationPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.LoginPage.LoginPageIOS;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.MobileVerPage.MobileVerPageIOS;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;
import Pages.PINPage.PINPageIOS;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Pages.VehiclesPage.VehiclesPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class VehiclesPageTests  extends TestBase {
		
		public VehiclesPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);
	
	private LandingPage landingPage;
	private VehiclesPage vehiclesPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;
	
		
	@BeforeTest
	public void setUpPage() throws Exception {
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
			landingPage = new LandingPageIOS(driver);
			vehiclesPage = new VehiclesPageIOS(driver);
			logInPage = new LoginPageIOS(driver);
			mobileVerPage = new MobileVerPageIOS(driver);
			codeVerificationPage = new CodeVerificationPageIOS(driver);
			pinPage = new PINPageIOS(driver);
				
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
			logInPage.TermsDisplayedTest();
			mobileVerPage.ValidMobileTest(mobileNumber);
			codeVerificationPage.SendCorrectCodeTest();
			pinPage.SendCorrectPINTest();
			landingPage.navigateToVehiclesPage();
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


