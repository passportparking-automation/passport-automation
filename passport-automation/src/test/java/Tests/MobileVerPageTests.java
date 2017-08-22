package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Pages.SignUpPage.SignUpPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class MobileVerPageTests extends TestBase{
	public MobileVerPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);
	
	private LandingPage landingPage;
	private MobileVerPage mobileVerPage;
	private LoginPage logInPage;
	private SignUpPage signUpPage;
	private CodeVerificationPage codeVerificationPage;

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
			mobileVerPage = new MobileVerPageAndroid(driver);
			logInPage = new LoginPageAndroid(driver);
			signUpPage = new SignUpPageAndroid(driver);
			codeVerificationPage = new CodeVerificationPageAndroid(driver);
			
			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			mobileVerPage = new MobileVerPageIOS(driver);
			logInPage = new LoginPageIOS(driver);
			signUpPage = new SignUpPageIOS(driver);
			codeVerificationPage = new CodeVerificationPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test 
	public void CheckMobileVerPageForExceptions() throws InterruptedException{
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.CheckMobileVerPageForExceptions();
		mobileVerPage.NavBackToLoginTest();
		signUpPage.CheckSigninPageForExceptions();
		signUpPage.navToLanding();
	}
	
	@Test
	public void InputTests(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.BlankNumberProvidedTest();
		mobileVerPage.ShortNumberProivdedTest();
		mobileVerPage.ValidMobileTest(mobileNumber);
		codeVerificationPage.CheckCodeVerForExceptions();
		codeVerificationPage.navToLanding();
	}
}
