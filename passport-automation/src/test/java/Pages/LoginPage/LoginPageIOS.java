package Pages.LoginPage;

import static org.testng.Assert.assertTrue;

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
	
	@FindBy (name = "Home")
	public  MobileElement homeMenuOption;
	
	@FindBy (name = "menuicon")
	public MobileElement menuIcon;
	
	public LoginPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
	}

	public void clickLoginButtonAndAcceptTerms() {
		loginButton.click();
		takeScreenshot("login");
		acceptButton.click();
		takeScreenshot("login2");
		
	}

	public void TermsDisplayedTest() {
		loginButton.click();
		try {
			acceptButton.click();
		} catch (Exception e) {
			System.out.println("Terms message did not appear");
		}
		
	}

	public void CheckLoginPageForExceptions() {
		loginButton.click();
		try {
			acceptButton.click();
		} catch (Exception e) {
			System.out.println("Terms message did not appear");
		}
		backButton.click();
		
	}

	public void AssureTermsAreAcceptedTest() {
		handlingIosNotificatioPopUp();
		signUpButton.click();
		declineButton.click();
		menuIcon.click();
		homeMenuOption.click();
	}

	public void goToSignUp() {
		// TODO Auto-generated method stub
		
	}
}
