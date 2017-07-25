package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;
import Pages.ResetPINPage.ResetPINPage;
import Pages.ResetPINPage.ResetPINPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class ResetPINPageTests extends TestBase {
	
	private LandingPage landingPage;
	private ResetPINPage resetPinPage;
	private PINPage pinPage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			resetPinPage = new ResetPINPageAndroid(driver);
			pinPage = new PINPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void CheckResetPINPageForExceptions(){	
		landingPage.clickPayToPark();
		pinPage.SendCorrectPINTest();
	
	}
}
