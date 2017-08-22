package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.*;

import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.LoginPage.LoginPageIOS;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class LoginPageTests extends TestBase {
	
	public LoginPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	private LandingPage landingPage;
	private LoginPage loginPage; 

	@FindBy(name = "Don’t Allow")
	private static MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private static MobileElement allowButton;
	
	@FindBy(name = "OK")
	private static MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private static MobileElement okButtonBuddyBuild;
	
@BeforeTest
//@Override
public void setUpPage() throws Exception {
	switch(TestBase.executionOS) {
	case ANDROID:
		landingPage = new LandingPageAndroid(driver);
		loginPage = new LoginPageAndroid(driver);
		
		break;
	case IOS:
		landingPage = new LandingPageIOS(driver);
		loginPage = new LoginPageIOS(driver);
		
		break;
	default:
		break;
	}
}	

@Test
 public void CheckLoginPageForExceptions(){
	landingPage.clickPayToPark();
	loginPage.CheckLoginPageForExceptions();
}


@Test
public void AssureTermsAreAcceptedTest(){
	landingPage.clickPayToPark();
	loginPage.AssureTermsAreAcceptedTest();
}
}
