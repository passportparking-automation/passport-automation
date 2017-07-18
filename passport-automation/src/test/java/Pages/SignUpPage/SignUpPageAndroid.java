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
	
	
	@FindBy (xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]")
	public MobileElement termsPopUp;
	
	

	public SignUpPageAndroid(AppiumDriver driver) {super(driver);}

	public void signUpThroughEmail() {
		emailButton.click();
		takeScreenshot("pressEmail");
		
	}

	public void signUpThroughPhone() {
		phoneButton.click();
		takeScreenshot("pressPhone");
	}

	@Override
	public void CheckSigninPageForExceptions() {
	signUpButton.isDisplayed();
	logInButton.isDisplayed();
	poweredByLogo.isDisplayed();
		
	}
	
	public void DeclineTermsTest(){
		signUpButton.click();
		termsPopUp.isDisplayed();
		
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
		driver.navigate().back();
		driver.navigate().back();
		
		
	}

}
