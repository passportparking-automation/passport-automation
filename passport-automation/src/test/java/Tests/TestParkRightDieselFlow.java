package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageIOS;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageIOS;
import Pages.EmailVerPage.EmailVerPage;
import Pages.EmailVerPage.EmailVerPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageIOS;
import Pages.LengthOfStayPage.LengthOfStayPage;
import Pages.LengthOfStayPage.LengthOfStayPageIOS;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageIOS;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageIOS;
import Pages.PayMethodPage.PayMethodPage;
import Pages.PayMethodPage.PayMethodPageIOS;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageIOS;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageIOS;
import Pages.ZonePage.ZonePage;
import Pages.ZonePage.ZonePageIOS;
import Tests.AbstractBaseTests.TestBase;

public class TestParkRightDieselFlow extends TestBase {
	
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
	private EmailVerPage emailVerPage;
	private CodeVerificationPage codeVerificationPage;
	private PINPage pINPage;
	private ZonePage zonePage;
	private VehiclesPage vehiclesPage;
	private AddVehiclePage addVehiclePage;
	private LengthOfStayPage lengthOfStayPage;
	private PayMethodPage paymentMethodPage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			
			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			loginPage = new LoginPageIOS(driver);
			signUpPage = new SignUpPageIOS(driver);
			emailVerPage = new EmailVerPageIOS(driver);
			codeVerificationPage= new CodeVerificationPageIOS(driver);
			pINPage = new PINPageIOS(driver);
			zonePage = new ZonePageIOS(driver);
			vehiclesPage = new Pages.VehiclesPage.VehiclesPageIOS(driver);
			addVehiclePage = new AddVehiclePageIOS(driver);
			lengthOfStayPage = new LengthOfStayPageIOS(driver);
			paymentMethodPage = new PayMethodPageIOS(driver);
			
			break;
		}
	}
	/*
	@Test(priority = 1)
	public void Test() {
		
		landingPage.checkAllowButtonClick();
		landingPage.checkOkButtonClick();
		landingPage.CheckPayToParkButtonClick();

		loginPage.checkSignUpClickExpectTNC();
		loginPage.checkDeclineClick();
		loginPage.checkLoginInClickExpectTNC();
		loginPage.checkAcceptClickExpectLoginSelection();
		loginPage.checkSignUpClickExpectLoginSelection();
		loginPage.checkLoginClickExpectLoginSelection();
				
		signUpPage.signUpThroughEmail();
		emailVerPage.ValidEmailTest();
		codeVerificationPage.VerCodeTest();
		pINPage.SendCorrectPINTest();
		zonePage.goToDieselZone1();
		zonePage.clickContinueButtonDieselPopUp();
		vehiclesPage.clickAddV();

		//Verification of tax not levied on Non Diesel vehicle younger Than 2015
		addVehiclePage.addNonDieselYoungerThan2015();
		lengthOfStayPage.clickMaxStayButton();
		paymentMethodPage.clickTestCreditCard();
		paymentMethodPage.clickNoButton();
		lengthOfStayPage.clickBackButton();
		vehiclesPage.clickAddV();
		
		//Verification of tax not levied on Non Diesel vehicle Older Than 2015
		addVehiclePage.addNonDieselOlderThan2015();
		lengthOfStayPage.clickMaxStayButton();
		paymentMethodPage.clickTestCreditCard();
		paymentMethodPage.clickNoButton();
		lengthOfStayPage.clickBackButton();
		vehiclesPage.clickAddV();
		
		//Verification of tax not levied on Non Diesel vehicle of year 2015
		addVehiclePage.addNonDiesel2015();
		lengthOfStayPage.clickMaxStayButton();
		paymentMethodPage.clickTestCreditCard();
		paymentMethodPage.clickNoButton();
		lengthOfStayPage.clickBackButton();
		vehiclesPage.clickAddV();
		
		//Verification of tax not levied on Diesel vehicle younger than 2015
		addVehiclePage.addDieselYoungerThan2015();
		lengthOfStayPage.clickMaxStayButton();
		paymentMethodPage.clickTestCreditCard();
		paymentMethodPage.clickNoButton();
		lengthOfStayPage.clickBackButton();
		vehiclesPage.clickAddV();
		
		//Verification of tax levied on Diesel vehicle older than 2015
		addVehiclePage.addDieselOlderThan2015();
		lengthOfStayPage.clickMaxStayButton();
		paymentMethodPage.clickTestCreditCard();
		paymentMethodPage.clickNoButton();
		lengthOfStayPage.clickBackButton();
		vehiclesPage.clickAddV();

		//Verification of tax not levied on Diesel vehicle of year 2015
		addVehiclePage.addDiesel2015();
		lengthOfStayPage.clickMaxStayButton();
		paymentMethodPage.clickTestCreditCard();
		paymentMethodPage.clickNoButton();
		lengthOfStayPage.clickBackButton();
		vehiclesPage.clickAddV();
		
		//Verification of tax not on vehicle which is not there in auto guru data
		addVehiclePage.NoGuruRecord();
		lengthOfStayPage.clickMaxStayButton();
		paymentMethodPage.clickTestCreditCard();
		paymentMethodPage.clickNoButton();
		lengthOfStayPage.clickBackButton();

	}*/
}
