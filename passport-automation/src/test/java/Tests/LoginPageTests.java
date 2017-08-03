package Tests;

import org.testng.annotations.*;
import org.testng.annotations.Test;

import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class LoginPageTests extends TestBase {
	
	private LandingPage landingPage;
	private LoginPage loginPage; 
	
@BeforeTest
//@Override
public void setUpPage() {
	switch(TestBase.executionOS) {
	case ANDROID:
		landingPage = new LandingPageAndroid(driver);
		loginPage = new LoginPageAndroid(driver);
		
		break;
	case IOS:
		//landingpage = new LandingPageIOS(driver);
		
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
	loginPage.AssureTermsAreAcceptedTest();
}



}
