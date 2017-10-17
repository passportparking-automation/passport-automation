package Tests.EasyPayMiami;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CreateAccountPage.CreateAccountPage;
import Pages.CreateAccountPage.CreateAccountPageAndroid;
import Pages.SignInPage.SignInPage;
import Pages.SignInPage.SignInPageAndroid;
import Tests.TestBase;

public class CreateAccountPageTests extends TestBase {
	private SignInPage signInPage;
	private CreateAccountPage createAccountPage;

	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS){
		case ANDROID:
			signInPage = new SignInPageAndroid(driver);
			createAccountPage = new CreateAccountPageAndroid(driver);
			break;

		case IOS:
			
			break;
		
		default:
			break;
		}	
	}
	@Test
	public void CreateAccountPageTestMethods(){
		signInPage.navigateToCreateAccountPage();
		createAccountPage.CheckCreateAccountPageForExceptions();
		signInPage.navigateToCreateAccountPage();
		createAccountPage.AlreadyRegisteredTest();
		signInPage.navigateToCreateAccountPage();
		createAccountPage.BadEmailStringTest();
		signInPage.navigateToCreateAccountPage();
		createAccountPage.WrongPasswordTest();
		//signInPage.navigateToCreateAccountPage();
		//createAccountPage.SuccessfulAccountCreationTest();
		
	}
	

}
