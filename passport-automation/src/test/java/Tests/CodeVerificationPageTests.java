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

import Tests.AbstractBaseTests.TestBase;

public class CodeVerificationPageTests extends TestBase{
	private LandingPage landingPage;
	private MobileVerPage mobileVerPage;
	private LoginPage logInPage;
	private PINPage pinPage;
	private CodeVerificationPage codeVerificationPage;
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			logInPage = new LoginPageAndroid(driver);
			pinPage = new PINPageAndroid(driver);
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
	public void NavBackandBlankInputkTests(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.CheckCodeVerForExceptions();
		codeVerificationPage.EmptyVerTest();
		codeVerificationPage.NavBackTest();
		mobileVerPage.CheckMobileVerPageForExceptions();
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test
	public void ValidInputTests(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.CheckSecureLoginForExceptions();
		driver.navigate().back();
	}
	@Override
	public void exitCriteria() {
		// TODO Auto-generated method stub
		
	}
}
