package Pages.LoginPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LoginPageAndroid extends BasePage implements LoginPage {

	@FindBy (id = "logInButton")
	public MobileElement loginButton;
	
	@FindBy (id = "signUpButton")
	public MobileElement signUpButton;
	
	@FindBy (id ="loginTypeHeader")
	public MobileElement loginTypeHeader;
	
	@FindBy (xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]")
	public MobileElement termsPopUp;
		
	public LoginPageAndroid(AppiumDriver driver) {super(driver);}

	public void clickLoginButtonAndAcceptTerms() {
		loginButton.click();
		takeScreenshot("login");
		acceptButton.click();
		takeScreenshot("login2");
	}

	public void goToSignUp() {
		signUpButton.click();
		
	}

	@Override
	public void CheckLoginPageForExceptions() {
		loginButton.click();
		acceptButton.click();
		backButton.click();
	
	}
	
	
	public void AssureTermsAreAcceptedTest(){
		signUpButton.click();
		if(termsPopUp.isDisplayed()){
			assertTrue(false);
			}else{
				assertTrue(true);
			}
		}
	
	public void TermsDisplayedTest(){
		loginButton.click();
		if(popUp.isDisplayed()){
		acceptButton.click();
		}
		}
	
	
	
	
	}
	



