package Pages.SignUpPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class SignUpPageIOS extends BasePage implements SignUpPage {
	
	@FindBy(name = "E-mail")
	private MobileElement emailButton;
	
	@FindBy(id="phoneButton")
	public MobileElement phoneButton;

	public SignUpPageIOS(AppiumDriver driver) {super(driver);}

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

	@Override
	public void DeclineTermsTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AcceptTermsTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navToLanding() {
		menuIcon.click();
		homeMenuOption.click();
	}

}
