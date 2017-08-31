package Pages.SignUpPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignUpPageAndroid extends BasePage implements SignUpPage{
	
	@FindBy(id="emailButton")
	public MobileElement emailButton;
	
	@FindBy(id="phoneButton")
	public MobileElement phoneButton;
	
	@FindBy (id = "signUpButton")
	public MobileElement signUpButton;
	
	@FindBy (id = "logInButton")
	public MobileElement logInButton;
	
	@FindBy (id = "poweredByLogo")
	public MobileElement poweredByLogo;
	
	@FindBy (id = "title")
	public MobileElement termsTitle;
	
	@FindBy (id= "pDialogExternalLink_1")
	public MobileElement privacyPolExternalLink;
	
	@FindBy (id= "pDialogExternalLink_2")
	public MobileElement termsandConExternalLink;
	
	@FindBy (id="id_ws_terms")
	public MobileElement termsandConInternalLink;
	
	@FindBy (id="id_sm_privacy_policy")
	public MobileElement privacyPolInternalLink;
	
	
	public SignUpPageAndroid(AppiumDriver driver) {super(driver);}

	public void signUpThroughEmail() {
		emailButton.click();
		takeScreenshot("pressEmail");
		
	}

	public void signUpThroughPhone() {
		phoneButton.click();
		takeScreenshot("pressPhone");
	}
	public void CheckSigninPageForExceptions() {
	signUpButton.isDisplayed();
	logInButton.isDisplayed();
	poweredByLogo.isDisplayed();
	termsandConInternalLink.isDisplayed();
	privacyPolInternalLink.isDisplayed();
	}
	
	public void DeclineTermsTest(){
		signUpButton.click();
		popUp.isDisplayed();
		termsandConExternalLink.isDisplayed();
		privacyPolExternalLink.isDisplayed();
		String actualTermsTitle = termsTitle.getText();
		String expectedTermsTitle = "Terms & Conditions";
		if(expectedTermsTitle.equals(actualTermsTitle)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		acceptButton.isDisplayed();
		declineButton.isDisplayed();
		takeScreenshot("Terms and Conditions");
		declineButton.click();
		takeScreenshot("Terms and Conditions - Decline");
		CheckSigninPageForExceptions();
	
	}
	
	public void AcceptTermsTest(){	
		signUpButton.click();
		acceptButton.click();
		
	}
	
	public void navToLanding(){
		driver.navigate().back();
	}

	public void TermsandConTest() {
		termsandConInternalLink.click();
		takeScreenshot("tcInternal");
		backButton.click();
		signUpButton.click();
		termsandConExternalLink.click();
		takeScreenshot("TandC");
		driver.navigate().back();
		popUp.isDisplayed();
		declineButton.click();
	}

	
	public void PrivacyPolTest() {
		privacyPolInternalLink.click();
		takeScreenshot("ppInternal");
		backButton.click();
		signUpButton.click();
		privacyPolExternalLink.click();
		takeScreenshot("PandP");
		driver.navigate().back();
		popUp.isDisplayed();
		declineButton.click();
		
	}

}
