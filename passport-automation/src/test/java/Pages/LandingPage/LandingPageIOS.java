package Pages.LandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class LandingPageIOS extends BasePage implements LandingPage {

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
	
	@FindBy(name = "backicon")
	private MobileElement backiconButton;
	
	@FindBy(name = "Decline")
	private MobileElement declineButton;
	
	@FindBy(name = "Accept")
	private MobileElement acceptButton;
	
	public LandingPageIOS(AppiumDriver driver) {
		super(driver);
	}

	public void checkTermsAndCondtionsLinkClick() {
		if(!driver.findElements(By.name("OK")).isEmpty()){
			OkButtonNotification.isDisplayed();
			dontAllowButton.isDisplayed();
			OkButtonNotification.click();
		} else {
			allowButton.isDisplayed();
			dontAllowButton.isDisplayed();
			allowButton.click();
		}
		
		okButtonBuddyBuild.isDisplayed();
		okButtonBuddyBuild.click();

		tAndCButton.isDisplayed();
		tAndCButton.click();
		
		takeScreenshot("ss1");
		backiconButton.isDisplayed();
		backiconButton.click();
		takeScreenshot("ss2");
		
	}

	public void checkPrivacyPolicyLinkClick() {
		privacyPolicyButton.isDisplayed();
		privacyPolicyButton.click();
		
		takeScreenshot("ss3");
		backiconButton.isDisplayed();
		backiconButton.click();
		takeScreenshot("ss4");
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
		backiconButton.click();
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
		backiconButton.click();
	}

}
