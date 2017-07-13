package Pages.EmailVerPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class EmailVerPageIOS extends BasePage implements EmailVerPage {
	
	@FindBy (name = "emailInput")
	public MobileElement emailInputBox;
	
	@FindBy (name = "Send Code")
	public MobileElement sendCodeButton;
	
	@FindBy (name = "Yes")
	private MobileElement acceptButton;

	public EmailVerPageIOS(AppiumDriver driver) {super(driver);}

	public void ValidEmailTest() {
		emailInputBox.sendKeys("automaton+01@gopassport.com");
		takeScreenshot("validEmail");
		sendCodeButton.click();
		takeScreenshot("verifyEmailMessage");
		//Verify notification message
		acceptButton.click();
	}

}
