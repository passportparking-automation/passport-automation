package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.MobileVerPage.MobileVerPageIOS;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Pages.SignUpPage.SignUpPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class SignUpPageTests extends TestBase {
	public SignUpPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	private LandingPage landingPage;
	private SignUpPage signUpPage;
	private MobileVerPage mobileVerPage;
	
	@BeforeTest
	// @Override
	public void setUpPage() throws Exception {
		switch (TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			signUpPage = new SignUpPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);

			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			signUpPage = new SignUpPageIOS(driver);
			mobileVerPage = new MobileVerPageIOS(driver);

			break;
		default:
			break;
		}
	}
	@Test
	public void CheckSigninPageForExceptions() throws InterruptedException {
		landingPage.clickPayToPark();
		BasePage.sleep(5000);
		signUpPage.CheckSigninPageForExceptions();
		signUpPage.navToLanding();
		
	}
	@Test
	public void DeclineAndAcceptTermsTest() {
		landingPage.clickPayToPark();
		signUpPage.DeclineTermsTest();
		signUpPage.AcceptTermsTest();
		mobileVerPage.CheckMobileVerPageForExceptions();
		mobileVerPage.navToLanding();
	}
}