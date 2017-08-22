package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
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
import Pages.PINPage.PINPageIOS;
import Pages.ProfilePage.ProfilePage;
import Pages.ProfilePage.ProfilePageAndroid;
import Pages.ProfilePage.ProfilePageIOS;
import Pages.UpdateProfPage.UpdateProfPage;
import Pages.UpdateProfPage.UpdateProfPageAndroid;
import Pages.YourCardsPage.YourCardsPage;
import Pages.YourCardsPage.YourCardsPageAndroid;
import Pages.YourCardsPage.YourCardsPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class YourCardsPageTests extends TestBase {
	public YourCardsPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);
	
	private LandingPage landingPage;
	private ProfilePage profilePage;
	private YourCardsPage yourCardsPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;

	@BeforeTest
	public void setUpPage() throws Exception {
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
			landingPage = new LandingPageIOS(driver);
			profilePage = new ProfilePageIOS(driver);
			yourCardsPage = new YourCardsPageIOS(driver);
			logInPage = new LoginPageIOS(driver);
			mobileVerPage = new MobileVerPageIOS(driver);
			codeVerificationPage = new CodeVerificationPageIOS(driver);
			pinPage = new PINPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	@Test 
	public void CheckYCPageForExceptions(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest(mobileNumber);
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.SendCorrectPINTest();
		landingPage.navigateToYourCardsPage();
		yourCardsPage.CheckYCPageForExceptions();
		yourCardsPage.NavToPayDetailsPage();
		
	}

}
