package Pages.LandingPage;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import Pages.BasePage;

public class LandingPageAndroid extends BasePage implements LandingPage {
	
	/*Sign Up Button*/
	@AndroidFindBy(id = "com.passportparking.mobile:id/signUpButton")
	private MobileElement signUpButton;
	
	/*Login Button*/
	@AndroidFindBy(id = "com.passportparking.mobile:id/logInButton")
	private WebElement logInButton;
	
	/*Terms And Condition Link*/
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Terms & Conditions']")
	private MobileElement termsAndConditionsLink;
	
	/*Privacy Policy Link*/
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Privacy Policy']")
	private MobileElement privacyPolicyLink;
	
	/*Accept button*/
	@AndroidFindBy(id = "com.passportparking.mobile:id/btnOk")
	private MobileElement acceptButton;

	/*Decline button*/
	@AndroidFindBy(id = "com.passportparking.mobile:id/btnCancel")
	private MobileElement declineButton;

	public LandingPageAndroid(AppiumDriver driver) {
		super(driver);
	}

	public void checkTermsAndCondtionsLinkClick() {
		/*termsAndConditionsLink.isDisplayed();
		termsAndConditionsLink.click();
		
		takeScreenshot("ss1");
		driver.navigate().back();
		takeScreenshot("ss2");*/
	}

	public void checkPrivacyPolicyLinkClick() {
		/*privacyPolicyLink.isDisplayed();
		privacyPolicyLink.click();
		
		takeScreenshot("ss3");
		driver.navigate().back();
		takeScreenshot("ss4");*/
	}

	public void checkSignUpClickExpectTNC() {
		signUpButton.isDisplayed();
		signUpButton.click();
	
		takeScreenshot("ss5");
		
	}
	
	public void checkDeclineClick() {
		declineButton.isDisplayed();
		declineButton.click();
		
		takeScreenshot("ss8");
		logInButton.isDisplayed();
		
	}

	public void checkLoginInClickExpectTNC() {
		logInButton.isDisplayed();
		logInButton.click();
		
	}

	public void checkSignUpClickExpectLoginSelection() {
		signUpButton.isDisplayed();
		signUpButton.click();
		
		BasePage.sleep(3000);
		driver.navigate().back();
	}

	public void checkLoginClickExpectLoginSelection() {
		logInButton.isDisplayed();
		signUpButton.click();
		
		
	}

	public void checkAcceptClickExpectLoginSelection() {
		acceptButton.isDisplayed();
		acceptButton.click();
		
		BasePage.sleep(3000);
		driver.navigate().back();
	}
}
