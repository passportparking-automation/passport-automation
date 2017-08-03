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
import Pages.ProfilePage.ProfilePage;
import Pages.ProfilePage.ProfilePageAndroid;
import Pages.UpdateProfPage.UpdateProfPage;
import Pages.UpdateProfPage.UpdateProfPageAndroid;
import Pages.YourCardsPage.YourCardsPage;
import Pages.YourCardsPage.YourCardsPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class YourCardsPageTests extends TestBase {
	private LandingPage landingPage;
	private ProfilePage profilePage;
	private YourCardsPage yourCardsPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;
	
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			profilePage = new ProfilePageAndroid(driver);
			yourCardsPage = new YourCardsPageAndroid(driver);
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
	public void CheckYCPageForExceptions(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.SendCorrectPINTest();
		landingPage.navigateToYourCardsPage();
		yourCardsPage.CheckYCPageForExceptions();
		yourCardsPage.NavToPayDetailsPage();
		
	}

}
