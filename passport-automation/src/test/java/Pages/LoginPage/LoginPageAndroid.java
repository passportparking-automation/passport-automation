package Pages.LoginPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPageAndroid extends BasePage implements LoginPage {

	@FindBy (id = "logInButton")
	public MobileElement loginButton;
	
	@FindBy (id = "signUpButton")
	public MobileElement signUpButton;
	
	@FindBy (id ="loginTypeHeader")
	public MobileElement loginTypeHeader;
		
	public LoginPageAndroid(AppiumDriver driver) {super(driver);}

	public void clickLoginButtonAndAcceptTerms() {
		loginButton.click();
		takeScreenshot("login");
		acceptButton.click();
		takeScreenshot("login2");
	}

	public void goToSignUp() {
		signUpButton.click();
		
	}

	@Override
	public void CheckLoginPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

}
