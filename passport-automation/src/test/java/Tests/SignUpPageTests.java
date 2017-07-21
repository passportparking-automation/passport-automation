package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class SignUpPageTests extends TestBase {
	private LandingPage landingPage;
	private SignUpPage signUpPage;
	private MobileVerPage mobileVerPage;
	
	@BeforeTest
	// @Override
	public void setUpPage() {
		switch (TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			signUpPage = new SignUpPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);

			break;
		case IOS:
			// landingpage = new LandingPageIOS(driver);

			break;
		default:
			break;
		}
	}
	@Test
	public void CheckSigninPageForExceptions() throws InterruptedException {
		landingPage.clickPayToPark();
		Thread.sleep(5000);
		signUpPage.CheckSigninPageForExceptions();
		driver.navigate().back();
	}
	@Test
	public void DeclineAndAcceptTermsTest() {
		landingPage.clickPayToPark();
		signUpPage.DeclineTermsTest();
		signUpPage.AcceptTermsTest();
		mobileVerPage.CheckMobileVerPageForExceptions();
		driver.navigate().back();
		driver.navigate().back();
	}
}