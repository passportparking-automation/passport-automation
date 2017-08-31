package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LengthOfStayPage.LengthOfStayPage;
import Pages.LengthOfStayPage.LengthOfStayPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;
import Pages.PayToParkPage.PayToParkPage;
import Pages.PayToParkPage.PayToParkPageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class LengthOfStayPageTests extends TestBase{
	private LengthOfStayPage lengthOfStayPage;
	private LandingPage landingPage;
	private PayToParkPage payToParkPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;
	private VehiclesPage vehiclesPage;
	
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			payToParkPage = new PayToParkPageAndroid(driver);
			logInPage = new LoginPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			codeVerificationPage = new CodeVerificationPageAndroid(driver);
			pinPage = new PINPageAndroid(driver);
			lengthOfStayPage = new LengthOfStayPageAndroid(driver);
			vehiclesPage = new VehiclesPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	@Test 
	public void CheckLengthOfStayForExceptions(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.SendCorrectPINTest();
		BasePage.sleep(5000);
		payToParkPage.CorrectZoneNavTest();
		vehiclesPage.clickTestVehicle();
		lengthOfStayPage.CheckLOSForExceptions();
	}

}
