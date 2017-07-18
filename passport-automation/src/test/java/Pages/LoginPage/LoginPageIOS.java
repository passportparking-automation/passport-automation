package Pages.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class LoginPageIOS extends BasePage implements LoginPage {

	@FindBy(name = "Don’t Allow")
	private MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private MobileElement allowButton;
	
	@FindBy(name = "OK")
	private MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private MobileElement okButtonBuddyBuild;
	
	@FindBy(name = "Sign Up")
	private MobileElement signUpButton;
	
	@FindBy(name = "Login")
	private MobileElement loginButton;

	@FindBy(name = "Terms & Conditions")
	private MobileElement tAndCButton;
	
	@FindBy(name = "Privacy Policy")
	private MobileElement privacyPolicyButton;
	
	@FindBy(name = "back")
	private MobileElement backButton;
	
	@FindBy(name = "Decline")
	private MobileElement declineButton;
	
	@FindBy(name = "Accept")
	private MobileElement acceptButton;
	
	public LoginPageIOS(AppiumDriver driver) {
		super(driver);
	}

	public void checkSignUpClickExpectTNC() {
		signUpButton.isDisplayed();
		signUpButton.click();
		
		takeScreenshot("ss5");
		declineButton.isDisplayed();
		
	}

	public void checkLoginInClickExpectTNC() {
		loginButton.isDisplayed();
		loginButton.click();
		
		takeScreenshot("ss6");
		acceptButton.isDisplayed();
	
	}

	public void checkSignUpClickExpectLoginSelection() {
		signUpButton.isDisplayed();
		signUpButton.click();
		
		takeScreenshot("ss9");
		backButton.click();
	}

	public void checkLoginClickExpectLoginSelection() {
		loginButton.isDisplayed();
		loginButton.click();
		
		takeScreenshot("ss9");
	}

	public void checkDeclineClick() {
		declineButton.isDisplayed();
		declineButton.click();
		
		takeScreenshot("ss7");
	}

	public void checkAcceptClickExpectLoginSelection() {
		acceptButton.isDisplayed();
		acceptButton.click();
		
		takeScreenshot("ss8");
		backButton.click();
	}

	@Override
	public void clickLoginButtonAndAcceptTerms() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goToSignUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckLoginPageForExceptions() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void AssureTermsAreAcceptedTest() {
		// TODO Auto-generated method stub
		
	}

}
