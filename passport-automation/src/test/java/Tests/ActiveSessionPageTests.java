package Tests;

import org.testng.annotations.*;

import Pages.ActiveSessionPage.ActiveSessionPage;
import Pages.ActiveSessionPage.ActiveSessionPageAndroid;
import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageAndroid;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.EmailVerPage.EmailVerPage;
import Pages.EmailVerPage.EmailVerPageAndroid;
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
import Pages.PayMethodPage.PayMethodPage;
import Pages.PayMethodPage.PayMethodPageAndroid;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Pages.YourCardsPage.YourCardsPage;
import Pages.YourCardsPage.YourCardsPageAndroid;
import Pages.ZonePage.ZonePage;
import Pages.ZonePage.ZonePageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class ActiveSessionPageTests extends TestBase{
	private LandingPage landingPage;
	private LoginPage loginPage;
	private SignUpPage signUpPage;
	private EmailVerPage emailVerPage;
	private CodeVerificationPage codeVerificationPage;
	private MobileVerPage mobileVerPage;
	private  PINPage pINPage;
	private ZonePage zonePage;
	private VehiclesPage vehiclesPage;
	private AddVehiclePage addVehiclePage;
	private LengthOfStayPage losPage;
	private YourCardsPage yourCardsPage;
	private PayMethodPage payMethodPage;
	private ActiveSessionPage activeSessionPage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			loginPage = new LoginPageAndroid(driver);
			signUpPage = new SignUpPageAndroid(driver);
			emailVerPage = new EmailVerPageAndroid(driver);
			codeVerificationPage= new CodeVerificationPageAndroid(driver);
			pINPage = new PINPageAndroid(driver);
			zonePage = new ZonePageAndroid(driver);
			vehiclesPage = new VehiclesPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			addVehiclePage= new AddVehiclePageAndroid(driver);
			losPage= new LengthOfStayPageAndroid(driver);
			yourCardsPage = new YourCardsPageAndroid(driver);
			payMethodPage = new PayMethodPageAndroid(driver);
			activeSessionPage = new ActiveSessionPageAndroid(driver);
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void CheckActiveSessionPageForExceptions(){
		landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		vehiclesPage.CheckVehiclesPageForExceptions();
		vehiclesPage.clickTestVehicle();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.acceptPayment();
		activeSessionPage.CheckActiveSessionPageForExceptions();
	}
	
	/*@Test
	public void NonDieselOlderThan2015Test() throws InterruptedException{

	}
	
	@Test
	public void NonDieselYoungerThan2015Test() throws InterruptedException{
		
	}
	@Test
	public void NonDiesel2015Test() throws InterruptedException{
		
	}
	@Test
	public void Diesel2015Test() throws InterruptedException{
		
	}
	@Test
	public void DieselOlderThan2015Test() throws InterruptedException{
		
	}
	@Test
	public void DieselYoungerThan2015Test() throws InterruptedException{
		landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		vehiclesPage.CheckVehiclesPageForExceptions();
		vehiclesPage.clickAddV();
		addVehiclePage.addDieselOlderThan2015();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.CheckPayMethodForExceptions();
		payMethodPage.declinePayment();
		
	}
	@Test
	public void NoGuruRecordTest() throws InterruptedException{
		 
	}
	*/

}
