package Tests;

import io.appium.java_client.MobileElement;

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
import Pages.PayDetailsPage.PayDetailsPage;
import Pages.PayDetailsPage.PayDetailsPageAndroid;
import Pages.PayDetailsPage.PayDetailsPageIOS;
import Pages.ResetPINPage.ResetPINPage;
import Pages.ResetPINPage.ResetPINPageAndroid;
import Pages.ResetPINPage.ResetPINPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class ResetPINPageTests extends TestBase {
	
	public ResetPINPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);

	private LandingPage landingPage;
	private ResetPINPage resetPINPage;
	private PINPage pinPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private PayDetailsPage payDetailsPage;
	private CodeVerificationPage codeVerificationPage;
	
	@BeforeTest
	@Override
	public void setUpPage() throws Exception {
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
			landingPage = new LandingPageIOS(driver);
			resetPINPage = new ResetPINPageIOS(driver);
			pinPage = new PINPageIOS(driver);
			logInPage = new LoginPageIOS(driver);
			mobileVerPage = new MobileVerPageIOS(driver);
			payDetailsPage = new PayDetailsPageIOS(driver);
			codeVerificationPage = new CodeVerificationPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void ResetPINPageTest(){	
		landingPage.clickPayToPark();
		BasePage.sleep(5000);
		logInPage.TermsDisplayedTest();
		try{
		mobileVerPage.ValidMobileTest(mobileNumber);
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
