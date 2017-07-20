package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class MobileVerPageTests extends TestBase{
	private LandingPage landingPage;
	private MobileVerPage mobileVerPage;
	private LoginPage logInPage;
	private SignUpPage signUpPage;
	
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			logInPage = new LoginPageAndroid(driver);
			signUpPage = new SignUpPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test 
	public void CheckMobileVerPageForExceptions(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.CheckMobileVerPageForExceptions();
		driver.navigate().back();
		driver.navigate().back();
}
	@Test
	public void NavBackToLoginTest(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.NavBackToLoginTest();
		signUpPage.CheckSigninPageForExceptions();
		
	}
}
