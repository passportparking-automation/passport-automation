package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LengthOfStayPage.LengthOfStayPage;
import Pages.LengthOfStayPage.LengthOfStayPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;
import Pages.PayDetailsPage.PayDetailsPage;
import Pages.PayDetailsPage.PayDetailsPageAndroid;
import Pages.PayMethodPage.PayMethodPage;
import Pages.PayMethodPage.PayMethodPageAndroid;
import Pages.PayToParkPage.PayToParkPage;
import Pages.PayToParkPage.PayToParkPageAndroid;
import Pages.ProfilePage.ProfilePage;
import Pages.ProfilePage.ProfilePageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Pages.YourCardsPage.YourCardsPage;
import Pages.YourCardsPage.YourCardsPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class PayMethodPageTests extends TestBase{
	private LandingPage landingPage;
	private ProfilePage profilePage;
	private YourCardsPage yourCardsPage;
	private LoginPage logInPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pinPage;
	private PayDetailsPage payDetailsPage;
	private PayToParkPage payToParkPage;
	private LengthOfStayPage lengthOfStayPage;
	private PayMethodPage payMethodPage;
	private VehiclesPage vehiclesPage;
	
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
			payDetailsPage = new PayDetailsPageAndroid(driver);
			payToParkPage = new PayToParkPageAndroid(driver);
			lengthOfStayPage = new LengthOfStayPageAndroid(driver);
			payMethodPage = new PayMethodPageAndroid(driver);
			vehiclesPage = new VehiclesPageAndroid (driver);
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test 
	public void CheckPayMethodPageForExceptions(){
		landingPage.clickPayToPark();
		logInPage.TermsDisplayedTest();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pinPage.SendCorrectPINTest();
		BasePage.sleep(5000);
		payToParkPage.CorrectZoneNavTest();
		vehiclesPage.clickTestVehicle();
		lengthOfStayPage.clickMaxStayButton();
		try{
			payDetailsPage.FillOutForm();
		
		} catch (Exception e) {
			System.out.println("Test card has already been created"); 
		}
		yourCardsPage.CheckYCPageForExceptions();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.CheckPayMethodForExceptions();
		payMethodPage.declinePayment();
		lengthOfStayPage.CheckLOSForExceptions();
	}
}
