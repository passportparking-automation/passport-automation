package Pages.SignUpPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignUpPageAndroid extends BasePage implements SignUpPage{
	
	@FindBy(id="emailButton")
	public MobileElement emailButton;
	
	@FindBy(id="phoneButton")
	public MobileElement phoneButton;

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
		// TODO Auto-generated method stub
		
	}

}
