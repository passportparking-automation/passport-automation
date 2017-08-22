package Tests;

import io.appium.java_client.MobileElement;

import org.apache.poi.hpsf.ReadingNotSupportedException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import Pages.BasePage;
import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageAndroid;
import Pages.AddVehiclePage.AddVehiclePageIOS;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.CodeVerificationPage.CodeVerificationPageIOS;
import Pages.EmailVerPage.EmailVerPage;
import Pages.EmailVerPage.EmailVerPageAndroid;
import Pages.EmailVerPage.EmailVerPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Pages.LengthOfStayPage.LengthOfStayPage;
import Pages.LengthOfStayPage.LengthOfStayPageAndroid;
import Pages.LengthOfStayPage.LengthOfStayPageIOS;
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
import Pages.PayMethodPage.PayMethodPage;
import Pages.PayMethodPage.PayMethodPageAndroid;
import Pages.PayMethodPage.PayMethodPageIOS;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Pages.SignUpPage.SignUpPageIOS;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Pages.VehiclesPage.VehiclesPageIOS;
import Pages.YourCardsPage.YourCardsPage;
import Pages.YourCardsPage.YourCardsPageAndroid;
import Pages.YourCardsPage.YourCardsPageIOS;
import Pages.ZonePage.ZonePage;
import Pages.ZonePage.ZonePageAndroid;
import Pages.ZonePage.ZonePageIOS;
import Tests.AbstractBaseTests.TestBase;

public class ActiveSessionPageTests extends TestBase{
	
	public ActiveSessionPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

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
	private PayDetailsPage payDetailsPage;
	
	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);
	
	@BeforeTest
	@Override
	public void setUpPage() throws Exception {
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
			payDetailsPage = new PayDetailsPageAndroid(driver);
			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			loginPage = new LoginPageIOS(driver);
			signUpPage = new SignUpPageIOS(driver);
			emailVerPage = new EmailVerPageIOS(driver);
			codeVerificationPage= new CodeVerificationPageIOS(driver);
			pINPage = new PINPageIOS(driver);
			zonePage = new ZonePageIOS(driver);
			vehiclesPage = new VehiclesPageIOS(driver);
			mobileVerPage = new MobileVerPageIOS(driver);
			addVehiclePage= new AddVehiclePageIOS(driver);
			losPage= new LengthOfStayPageIOS(driver);
			yourCardsPage = new YourCardsPageIOS(driver);
			payMethodPage = new PayMethodPageIOS(driver);
			payDetailsPage = new PayDetailsPageIOS(driver); 
			
			break;
		default:
			break;
		}
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
		
	}*/
	@Test
	public void DieselYoungerThan2015Test() throws InterruptedException{
		landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest(mobileNumber);
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		vehiclesPage.CheckVehiclesPageForExceptions();
		vehiclesPage.clickAddV();
		addVehiclePage.addDieselOlderThan2015();
		losPage.clickMaxStayButton();
		try{
			yourCardsPage.clickTestCreditCard();
		}
		catch (Throwable e) {
			System.out.println("Your Cards page was not displayed");
		}
		try{
			payDetailsPage.FillOutForm();
		}
		catch (Throwable e) {
			System.out.println("Add Payment Details page not displayed");
		}
		payMethodPage.CheckPayMethodForExceptions();
		payMethodPage.declinePayment();
		
	}
	/*@Test
	public void NoGuruRecordTest() throws InterruptedException{
		 
	}
	*/

}
