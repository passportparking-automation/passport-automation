package Tests;

import org.testng.annotations.Test;

import Pages.BasePage;

public class ParkRightTestCase1 {
	
	ActiveSessionPageTests activeSessionPageTests = new ActiveSessionPageTests();
	AddVehiclePageTests addVehiclePageTests = new AddVehiclePageTests();
	CodeVerificationPageTests codeVerificationPageTests = new CodeVerificationPageTests();
	FAQPageTests fAQPageTests = new FAQPageTests();
	FavoritesPageTests favoritesPageTests = new FavoritesPageTests();
	FindParkingPageTests findParkingPageTests = new FindParkingPageTests();
	HelpPageTests helpPageTests = new HelpPageTests();
	LandingPageTests landingPageTests = new LandingPageTests();
	LoginPageTests loginPageTests = new LoginPageTests();
	MobileVerPageTests mobileVerPageTests = new MobileVerPageTests();
	PayDetailsPageTests payDetailsPageTests = new PayDetailsPageTests();
	PINPageTests pINPageTests = new PINPageTests();
	ProfilePageTests profilePageTests = new ProfilePageTests();
	ResetPINPageTests resetPINPageTests = new ResetPINPageTests();
	SendBugReportPageTests sendBugReportPageTests = new SendBugReportPageTests();
	SignUpPageTests signUpPageTests = new SignUpPageTests();
	TestParkRightDieselFlow testParkRightDieselFlow = new TestParkRightDieselFlow();
	UpdateProfPageTests updateProfPageTests = new UpdateProfPageTests();
	VehiclesPageTests vehiclesPageTests = new VehiclesPageTests();
	YourCardsPageTests yourCardsPageTests = new YourCardsPageTests();
	
	public ParkRightTestCase1() throws Exception {
		super();
	}
	
	@Test
	public void TestCase1() throws Exception {
		BasePage.handlingIosNotificatioPopUp();
		landingPageTests.CheckMenuOptionsForExceptions();
		landingPageTests.checkLandingPageForExceptions();
	}

}
