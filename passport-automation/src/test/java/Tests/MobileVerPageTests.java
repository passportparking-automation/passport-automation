package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class MobileVerPageTests extends TestBase{
	private LandingPage landingPage;
	private MobileVerPage mobileVerPage;
	private LoginPage logInPage;
	private SignUpPage signUpPage;
	private CodeVerificationPage codeVerificationPage;
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			logInPage = new LoginPageAndroid(driver);
			signUpPage = new SignUpPageAndroid(driver);
			codeVerificationPage = new CodeVerificationPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
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
		driver.navigate().back();
	}
	
	@Test
	public void InputTests(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.BlankNumberProvidedTest();
		mobileVerPage.ShortNumberProivdedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.CheckCodeVerForExceptions();
		driver.navigate().back();
		driver.navigate().back();
	}

	@Override
	public void exitCriteria() {
		// TODO Auto-generated method stub
		
	}
}
