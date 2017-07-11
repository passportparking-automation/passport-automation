package Tests;

import org.testng.annotations.*;

import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.EmailVerPage.EmailVerPage;
import Pages.EmailVerPage.EmailVerPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Pages.ZonePage.ZonePage;
import Pages.ZonePage.ZonePageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class ActiveSessionPageTests extends TestBase{
	private LandingPage landingPage;
	private LoginPage loginPage;
	private SignUpPage signUpPage;
	private EmailVerPage emailVerPage;
	private CodeVerificationPage codeVerificationPage;
	private  PINPage pINPage;
	private ZonePage zonePage;
	private VehiclesPage vehiclesPage;
	
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
			
			landingPage.clickPayToPark();
			loginPage.clickLoginButtonAndAcceptTerms();
			signUpPage.signUpThroughEmail();
			emailVerPage.ValidEmailTest();
			codeVerificationPage.VerCodeTest();
			pINPage.SendCorrectPINTest();
			zonePage.goToDieselZone1();
			vehiclesPage.clickAddV();
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void NonDieselOlderThan2015Test() throws InterruptedException{
		vehiclesPage.clickAddV();
		
	}
	/*
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
		
	}
	@Test
	public void NoGuruRecordTest() throws InterruptedException{
		
	}
	*/

}
