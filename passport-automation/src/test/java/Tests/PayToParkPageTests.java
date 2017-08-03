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
import Pages.PayToParkPage.PayToParkPage;
import Pages.PayToParkPage.PayToParkPageAndroid;
import Pages.ProfilePage.ProfilePage;
import Pages.ProfilePage.ProfilePageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class PayToParkPageTests extends TestBase {
	
	private LandingPage landingPage;
	private PayToParkPage payToParkPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;
	
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
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	@Test 
	public void EmptyAndFalseZoneTest(){
		landingPage.login();
		landingPage.clickPayToPark();
		payToParkPage.EmptyAndFalseZoneTest();
		payToParkPage.navToLanding();
		landingPage.CheckLandingPageForExceptions();
		landingPage.logout();
	}
	
	@Test 
	public void CorrectZoneNavTest(){
		landingPage.login();
		landingPage.clickPayToPark();
		payToParkPage.CorrectZoneNavTest();
		payToParkPage.navToLanding();
		landingPage.CheckLandingPageForExceptions();
		landingPage.logout();
	}

}
