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
	
	@FindBy(id="forgot_password")
	public MobileElement forgotPasswordButton;
	
	@FindBy(id="create_account_button")
	public MobileElement createAccountButton;
	
	@FindBy(id="text_input_password_toggle")
	public MobileElement textInputPasswordToggle;
	
	public SignInPageAndroid(AppiumDriver driver) {super(driver);}

	public void CheckSigninPageForExceptions() {
		brandImage.isDisplayed();
		emailTextbox.isDisplayed();
		passwordTextbox.isDisplayed();
		loginButton.isDisplayed();
		rememberSwitch.isDisplayed();
		forgotPasswordButton.isDisplayed();
		createAccountButton.isDisplayed();
		textInputPasswordToggle.isDisplayed();
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
	}

	public void FailedLoginTest() {
		emailTextbox.sendKeys("badstring");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		passwordTextbox.sendKeys("abc123!@#");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		loginButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("ScreenShot"+System.currentTimeMillis());	
	}

	public void NavigateForgotPassword() {
		forgotPasswordButton.click();
		actionBar.isDisplayed();
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
		backImageButton.click();
	}
	
	public void NavigateCreateAccount() {
		createAccountButton.click();
		actionBar.isDisplayed();
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
		backImageButton.click();
		
	}
	
	public void SuccesfulLoginTest(){
		BasePage.sleep(3000);
		//emailTextbox.clear();
		emailTextbox.sendKeys("Jkoch@quilmont.com");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		//passwordTextbox.clear();
		passwordTextbox.sendKeys("Password123!");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		loginButton.click();
		tabTickets.isDisplayed();
		tabAccount.isDisplayed();
		tabMore.isDisplayed();
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
	}

	public void navigateToCreateAccountPage() {
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
		createAccountButton.click();
	}

	public void navigateToForgotPasswordPage() {
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
		forgotPasswordButton.click();
	}
}
