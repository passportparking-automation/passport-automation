package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.ExcelReading;
import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageAndroid;
import Pages.AddVehiclePage.AddVehiclePageIOS;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.CodeVerificationPage.CodeVerificationPageIOS;
import Pages.EmailVerPage.EmailVerPage;
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
import Pages.ZonePage.ZonePage;
import Pages.ZonePage.ZonePageAndroid;
import Pages.ZonePage.ZonePageIOS;
import Tests.AbstractBaseTests.TestBase;

public class TestParkRightDieselFlow extends TestBase {
	
	public TestParkRightDieselFlow() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);

	@FindBy (name = "DE06YJB - DE06YJB")
	private MobileElement lpn1;
	
	@FindBy (name = "DF59HZX - DF59HZX")
	private MobileElement lpn2;
	
	@FindBy (name = "MJI9302 - MJI9302")
	private MobileElement lpn3;
	
	@FindBy (name = "RK65AWJ - RK65AWJ")
	private MobileElement lpn4;
	
	@FindBy (name = "LV66TXZ - LV66TXZ")
	private MobileElement lpn5;
	
	@FindBy (name = "T888SAP - T888SAP")
	private MobileElement lpn6;
	
	@FindBy (name = "AAAAAAA - AAAAAAA")
	private MobileElement lpn7;

	private LandingPage landingPage;
	private LoginPage loginPage;
	private SignUpPage signUpPage;
	private MobileVerPage mobileVerPage;
	private CodeVerificationPage codeVerificationPage;
	private  PINPage pINPage;
	private ZonePage zonePage;
	private VehiclesPage vehiclesPage;
	private AddVehiclePage addVehiclePage;
	private LengthOfStayPage lengthOfStayPage;
	private PayMethodPage paymentMethodPage;
	private PayDetailsPage payDetailsPage;
	
	@BeforeTest
	@Override
	public void setUpPage() throws Exception {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			loginPage = new LoginPageAndroid(driver);
			signUpPage = new SignUpPageAndroid(driver);
			mobileVerPage = new MobileVerPageAndroid(driver);
			codeVerificationPage= new CodeVerificationPageAndroid(driver);
			pINPage = new PINPageAndroid(driver);
			zonePage = new ZonePageAndroid(driver);
			vehiclesPage = new VehiclesPageAndroid(driver);
			addVehiclePage = new AddVehiclePageAndroid(driver);
			lengthOfStayPage = new LengthOfStayPageAndroid(driver);
			paymentMethodPage = new PayMethodPageAndroid(driver);
			payDetailsPage = new PayDetailsPageAndroid(driver);
			
			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			loginPage = new LoginPageIOS(driver);
			signUpPage = new SignUpPageIOS(driver);
			mobileVerPage = new MobileVerPageIOS(driver);
			codeVerificationPage= new CodeVerificationPageIOS(driver);
			pINPage = new PINPageIOS(driver);
			zonePage = new ZonePageIOS(driver);
			vehiclesPage = new VehiclesPageIOS(driver);
			addVehiclePage = new AddVehiclePageIOS(driver);
			lengthOfStayPage = new LengthOfStayPageIOS(driver);
			paymentMethodPage = new PayMethodPageIOS(driver);
			payDetailsPage = new PayDetailsPageIOS(driver);
			break;
		}
	}
	
	@Test
	public void addNonDieselYoungerThan2015Test() throws Exception {
		landingPage.clickPayToPark();
		loginPage.clickLoginButtonAndAcceptTerms();
		mobileVerPage.ValidMobileTest(mobileNumber);
		codeVerificationPage.SendCorrectCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		landingPage.SwipeDownTest();
		vehiclesPage.clickAddV();

		//Verification of tax not levied on Non Diesel vehicle younger Than 2015
		addVehiclePage.addNonDieselYoungerThan2015();
		lengthOfStayPage.clickMaxStayButton();
		try {
			paymentMethodPage.clickTestCreditCard();
		} catch(Exception e) {
			System.out.println("Credit card is not present");
		}
		
		try {
			payDetailsPage.FillOutForm();
		} catch(Exception e) {
			System.out.println("Add Payment Details page is not displayed");
		}
		paymentMethodPage.acceptPayment();
		lengthOfStayPage.clickBackButton();
		landingPage.SwipeDownTest();
		vehiclesPage.clickAddV();
		
		//Verification of tax not levied on Non Diesel vehicle Older Than 2015
		addVehiclePage.addNonDieselOlderThan2015();
		lengthOfStayPage.clickMaxStayButton();
		try {
			paymentMethodPage.clickTestCreditCard();
		} catch(Exception e) {
			System.out.println("Credit card page is not present");
		}
		paymentMethodPage.declinePayment();
		lengthOfStayPage.clickBackButton();
		landingPage.SwipeDownTest();
		vehiclesPage.clickAddV();
		
		//Verification of tax not levied on Non Diesel vehicle of year 2015
		addVehiclePage.addNonDiesel2015();
		lengthOfStayPage.clickMaxStayButton();
		try {
			paymentMethodPage.clickTestCreditCard();
		} catch(Exception e) {
			System.out.println("Credit card is not present");
		}
		paymentMethodPage.declinePayment();
		lengthOfStayPage.clickBackButton();
		landingPage.SwipeDownTest();
		vehiclesPage.clickAddV();
		
		//Verification of tax not levied on Diesel vehicle younger than 2015
		addVehiclePage.addDieselYoungerThan2015();
		lengthOfStayPage.clickMaxStayButton();
		try {
			paymentMethodPage.clickTestCreditCard();
		} catch(Exception e) {
			System.out.println("Credit card is not present");
		}
		paymentMethodPage.declinePayment();
		lengthOfStayPage.clickBackButton();
		landingPage.SwipeDownTest();
		vehiclesPage.clickAddV();
		
		//Verification of tax levied on Diesel vehicle older than 2015
		addVehiclePage.addDieselOlderThan2015();
		lengthOfStayPage.clickMaxStayButton();
		try {
			paymentMethodPage.clickTestCreditCard();
		} catch(Exception e) {
			System.out.println("Credit card is not present");
		}
		paymentMethodPage.declinePayment();
		lengthOfStayPage.clickBackButton();
		landingPage.SwipeDownTest();
		vehiclesPage.clickAddV();

		//Verification of tax not levied on Diesel vehicle of year 2015
		addVehiclePage.addDiesel2015();
		lengthOfStayPage.clickMaxStayButton();
		try {
			paymentMethodPage.clickTestCreditCard();
		} catch(Exception e) {
			System.out.println("Credit card is not present");
		}
		paymentMethodPage.declinePayment();
		lengthOfStayPage.clickBackButton();
		landingPage.SwipeDownTest();
		vehiclesPage.clickAddV();
		
		//Verification of tax not on vehicle which is not there in auto guru data
		addVehiclePage.NoGuruRecord();
		lengthOfStayPage.clickMaxStayButton();
		try {
			paymentMethodPage.clickTestCreditCard();
		} catch(Exception e) {
			System.out.println("Credit card is not present");
		}
		paymentMethodPage.declinePayment();
		lengthOfStayPage.clickBackButton();

	}
}
