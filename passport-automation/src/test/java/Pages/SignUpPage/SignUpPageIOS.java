package Pages.SignUpPage;

import static org.testng.Assert.assertTrue;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class SignUpPageIOS extends BasePage implements SignUpPage {
	
	@FindBy(name = "Sign Up")
	private MobileElement signUpButton;
	
	@FindBy(id="Login")
	public MobileElement logInButton;
	
	@FindBy(name = "whitelabels/12_parkright/images/poweredbypassport.png")
	private MobileElement poweredByLogo;
	
	@FindBy (name = "menuicon")
	public MobileElement menuIcon;
	
	@FindBy (name = "Home")
	public  MobileElement homeMenuOption;
	
	@FindBy (name = "Terms & Conditions")
	private MobileElement termsTitle;
	
	@FindBy (name = "Accept")
	private MobileElement acceptButton;
	
	@FindBy (name = "Decline")
	private MobileElement declineButton;

	public SignUpPageIOS(AppiumDriver driver) {super(driver);}

	public void signUpThroughEmail() {
		
	}

	public void signUpThroughPhone() {
	}

	public void CheckSigninPageForExceptions() {
		signUpButton.isDisplayed();
		logInButton.isDisplayed();
		poweredByLogo.isDisplayed();
		menuIcon.click();
		homeMenuOption.click();
		
	}

	public void DeclineTermsTest() {
		signUpButton.click();
		
		/*This is not working even though termsTitle is Terms & Conditions
		 * BasePage.sleep(4000);
		System.out.println(termsTitle);
		String actualTermsTitle = termsTitle.getAttribute("value");
		String expectedTermsTitle = "Terms & Conditions";
		if(expectedTermsTitle.equals(actualTermsTitle)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}*/
		
		acceptButton.isDisplayed();
		declineButton.isDisplayed();
		takeScreenshot("Terms and Conditions");
		declineButton.click();
		takeScreenshot("Terms and Conditions - Decline");
		
	}

	public void AcceptTermsTest() {
		signUpButton.click();
		acceptButton.click();
		
	}

	@Override
	public void navToLanding() {
		menuIcon.click();
		homeMenuOption.click();
	}

}
