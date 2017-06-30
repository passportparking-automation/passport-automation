package Pages.LandingPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cucumber.api.java.lu.a;
import io.appium.java_client.AppiumDriver;
import Pages.BasePage;

public class LandingPageWebAndroid extends BasePage implements LandingPage {

	public LandingPageWebAndroid(AppiumDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "registerBtn")
	private WebElement registerBtn;

	@FindBy(id = "signinBtn")
	private WebElement signinBtn;

	@FindBy(id = "acceptTermsConditionsBtn")
	private WebElement acceptTermsConditionsBtn;

	@FindBy(id = "declineTermsConditionsBtn")
	private WebElement declineTermsConditionsBtn;
	
	@FindBy(id = "verify_sms")
	private WebElement verifysms;

	public void checkSignUpClickExpectTNC() {
		registerBtn.isDisplayed();
		takeScreenshot("ss1");
		
		registerBtn.click();
		
		takeScreenshot("ss2");
		declineTermsConditionsBtn.isDisplayed();
	}

	public void checkLoginInClickExpectTNC() {
		signinBtn.isDisplayed();
		signinBtn.click();
		
		takeScreenshot("ss3");
		acceptTermsConditionsBtn.isDisplayed();
	}

	public void checkTermsAndCondtionsLinkClick() {
		//Does nothing now
	}

	public void checkPrivacyPolicyLinkClick() {
		//Does nothing now		
	}

	public void checkSignUpClickExpectLoginSelection() {
		registerBtn.isDisplayed();
		registerBtn.click();
		
		takeScreenshot("ss6");
		acceptTermsConditionsBtn.isDisplayed();
		acceptTermsConditionsBtn.click();
		
		takeScreenshot("ss7");
		verifysms.isDisplayed();
		driver.navigate().back();
		acceptTermsConditionsBtn.isDisplayed();
	}

	public void checkLoginClickExpectLoginSelection() {
		signinBtn.isDisplayed();
		signinBtn.click();
		
		takeScreenshot("ss8");
		acceptTermsConditionsBtn.isDisplayed();
		acceptTermsConditionsBtn.click();
		takeScreenshot("ss9");
		
		verifysms.isDisplayed();
	}

	public void checkDeclineClick() {
		declineTermsConditionsBtn.isDisplayed();
		declineTermsConditionsBtn.click();
		
		takeScreenshot("ss3");
		
		signinBtn.isDisplayed();
	}

	public void checkAcceptClickExpectLoginSelection() {
		acceptTermsConditionsBtn.isDisplayed();
		acceptTermsConditionsBtn.click();
		
		verifysms.isDisplayed();
		takeScreenshot("ss5");
		
		driver.navigate().back();
		declineTermsConditionsBtn.isDisplayed();
		
	}
}
