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
import Pages.PayDetailsPage.PayDetailsPage;
import Pages.PayDetailsPage.PayDetailsPageAndroid;
import Pages.ResetPINPage.ResetPINPage;
import Pages.ResetPINPage.ResetPINPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class ResetPINPageTests extends TestBase {
	
	private LandingPage landingPage;
	private ResetPINPage resetPINPage;
	private PINPage pinPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private PayDetailsPage payDetailsPage;
	private CodeVerificationPage codeVerificationPage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			resetPINPage = new ResetPINPageAndroid(driver);
			pinPage = new PINPageAndroid(driver);
			logInPage = new LoginPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			payDetailsPage = new PayDetailsPageAndroid(driver);
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
	public void ResetPINPageTest(){	
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		try{
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		}
		catch (Throwable e) {
			System.out.println("Mobile Verification page was not displayed");
		}
		pinPage.navToReset();
		payDetailsPage.FillOutForm();
		resetPINPage.ResetPINPageTest();
	}
}
