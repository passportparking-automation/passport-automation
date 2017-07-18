package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.SignUpPage.SignUpPage;
import Pages.SignUpPage.SignUpPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class SignUpPageTests extends TestBase {
	
	private LandingPage landingPage;
	private SignUpPage signUpPage; 
	
@BeforeTest
//@Override
public void setUpPage() {
	switch(TestBase.executionOS) {
	case ANDROID:
		landingPage = new LandingPageAndroid(driver);
		signUpPage = new SignUpPageAndroid(driver);
		
		break;
	case IOS:
		//landingpage = new LandingPageIOS(driver);
		
		break;
	default:
		break;
	}
}	

@Test
public void CheckSigninPageForExceptions() throws InterruptedException{
	landingPage.clickPayToPark();
	Thread.sleep(5000);
	signUpPage.CheckSigninPageForExceptions();
}

@Test (priority=1)
public void DeclineTermsTest(){
	signUpPage.DeclineTermsTest();
}

@Test(priority=2)
public void AcceptTermsTest(){
	signUpPage.AcceptTermsTest();
}


}
