package Tests.EasyPayMiami;

import org.testng.annotations.*;

import Pages.CreateAccountPage.CreateAccountPage;
import Pages.CreateAccountPage.CreateAccountPageAndroid;
import Pages.ForgotPasswordPage.ForgotPasswordPage;
import Pages.ForgotPasswordPage.ForgotPasswordPageAndroid;
import Pages.SignInPage.SignInPage;
import Pages.SignInPage.SignInPageAndroid;
import Tests.TestBase;

public class ForgotPasswordPageTests extends TestBase{

	private SignInPage signInPage;
	private ForgotPasswordPage forgotPasswordPage;

	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS){
		case ANDROID:
			signInPage = new SignInPageAndroid(driver);
			forgotPasswordPage = new ForgotPasswordPageAndroid(driver);
			break;

		case IOS:
			
			break;
		
		default:
			break;
		}	
	}
	@Test
	public void ForgotPasswordPageTestMethods(){
		signInPage.navigateToForgotPasswordPage();
		forgotPasswordPage.NoDataTest();
		signInPage.navigateToForgotPasswordPage();
		forgotPasswordPage.BadEmailTest();
		signInPage.navigateToForgotPasswordPage();
		forgotPasswordPage.NonvalidEmailTest();
		signInPage.navigateToForgotPasswordPage();
		forgotPasswordPage.CheckSecurityQuestionsForExcpetions();
		//forgotPasswordPage.NoAnswerTest();
		forgotPasswordPage.WrongAnswerTest();
		forgotPasswordPage.CorrectAnswerTest();
	}
	
}
