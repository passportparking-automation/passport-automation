package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageAndroid;
import Pages.AddVehiclePage.AddVehiclePageIOS;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.CodeVerificationPage.CodeVerificationPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class AddVehiclePageTests extends TestBase {
	
	public AddVehiclePageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);

	private LandingPage landingPage;
	private AddVehiclePage addVehiclePage;
	private VehiclesPage vehiclesPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;
	
	@FindBy(name = "Don’t Allow")
	private static MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private static MobileElement allowButton;
	
	@FindBy(name = "OK")
	private static MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private static MobileElement okButtonBuddyBuild;
	 
	@BeforeTest
	public void setUpPage() throws Exception {
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
			landingPage = new LandingPageIOS(driver);
			addVehiclePage = new AddVehiclePageIOS(driver);
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
	
	@Test
	public void AddVehicleTest(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest(mobileNumber);
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.SendCorrectPINTest();
		
		landingPage.navigateToVehiclesPage();
		vehiclesPage.CheckVehiclesPageForExceptions();
		addVehiclePage.AddVehicleTest();
		vehiclesPage.CheckUpdateToVehiclePage();
	}
	
}
