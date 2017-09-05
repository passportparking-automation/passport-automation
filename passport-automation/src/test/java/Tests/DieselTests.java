package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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

public class DieselTests extends TestBase{
	private TestBase testBase;
	
	private LandingPage landingPage;
	private LoginPage loginPage;
	private SignUpPage signUpPage;

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
	public void A_NonDieselOlderThan2015Test() throws InterruptedException{
		landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		//vehiclesPage.CheckVehiclesPageForExceptions();
		vehiclesPage.clickAddV();
		addVehiclePage.addNonDieselOlderThan2015();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.checkPopForTax_NonDieselOlderThan2015();
		payMethodPage.declinePayment();
	}
	
	@Test
	public void B_NonDieselYoungerThan2015Test() throws InterruptedException{
		/*landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		//vehiclesPage.CheckVehiclesPageForExceptions();*/
		vehiclesPage.clickAddV();
		addVehiclePage.addNonDieselYoungerThan2015();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.checkPopForTax_NonDieselYoungerThan2015();
		payMethodPage.declinePayment();
	}
	@Test
	public void C_NonDiesel2015Test() throws InterruptedException{
		/*landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		//vehiclesPage.CheckVehiclesPageForExceptions();*/
		vehiclesPage.clickAddV();
		addVehiclePage.addNonDiesel2015();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.checkPopForTax_NonDiesel2015();
		payMethodPage.declinePayment();
	}
	@Test
	public void D_Diesel2015Test() throws InterruptedException{
		/*landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		//vehiclesPage.CheckVehiclesPageForExceptions();*/
		vehiclesPage.clickAddV();
		addVehiclePage.addDiesel2015();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.checkPopForTax_Diesel2015();
		payMethodPage.declinePayment();
	}
	@Test
	public void E_DieselOlderThan2015Test() throws InterruptedException{
		/*landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		//vehiclesPage.CheckVehiclesPageForExceptions();*/
		vehiclesPage.clickAddV();
		addVehiclePage.addDieselOlderThan2015();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.checkPopForTax_DieselOlderThan2015();
		payMethodPage.declinePayment();
	}
	@Test
	public void F_DieselYoungerThan2015Test() throws InterruptedException{
		/*landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		//vehiclesPage.CheckVehiclesPageForExceptions();*/
		vehiclesPage.clickAddV();
		addVehiclePage.addDieselYoungerThan2015();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.checkPopForTax_DieselYoungerThan2015();
		payMethodPage.declinePayment();
		
	}
	@Test
	public void G_NoGuruRecordTest() throws InterruptedException{
		/*landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest();
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		//vehiclesPage.CheckVehiclesPageForExceptions();*/
		vehiclesPage.clickAddV();
		addVehiclePage.NoGuruRecord();
		losPage.clickMaxStayButton();
		yourCardsPage.clickTestCreditCard();
		payMethodPage.checkPopForTax_NoGuruRecord();
		payMethodPage.declinePayment();
	}
	
	

}
