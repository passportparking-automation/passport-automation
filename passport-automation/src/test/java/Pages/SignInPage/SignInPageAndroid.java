package Pages.SignInPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignInPageAndroid extends BasePage implements SignInPage{

	@FindBy(id="brandImage")
	public MobileElement brandImage;
	
	@FindBy(id="email")
	public MobileElement emailTextbox;
	
	@FindBy(id="password")
	public MobileElement passwordTextbox;
	
	@FindBy(id="login_button")
	public MobileElement loginButton;
	
	@FindBy(id="rememberSwitch")
	public MobileElement rememberSwitch;
	
	@FindBy(id="forgot_Password")
	public MobileElement forgotPassword;
	
	@FindBy(id="create_account_button")
	public MobileElement createAccountButton;
	
	@FindBy(id="text_input_password_toggle")
	public MobileElement textInputPasswordToggle;
	
	
	public SignInPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckSigninPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FailedLoginTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NavigateForgotPassword() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NavigateCreateAccount() {
		// TODO Auto-generated method stub
		
	}

}
