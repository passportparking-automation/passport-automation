package Tests.EasyPayMiami;

import org.testng.annotations.*;

import Pages.SignInPage.SignInPage;
import Pages.SignInPage.SignInPageAndroid;
import Tests.TestBase;

public class SignInPageTests extends TestBase {
	
	private SignInPage signInPage;

	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS){
		case ANDROID:
			signInPage = new SignInPageAndroid(driver);
			break;

		case IOS:
			
			break;
		
		default:
			break;
		}	
	}
	@Test
	public void SignInPageTestMethods(){
		signInPage.CheckSigninPageForExceptions();
		signInPage.FailedLoginTest();
		signInPage.NavigateForgotPassword();
		signInPage.CheckSigninPageForExceptions();
		signInPage.NavigateCreateAccount();
		signInPage.CheckSigninPageForExceptions();
		signInPage.SuccesfulLoginTest();
	}
}
