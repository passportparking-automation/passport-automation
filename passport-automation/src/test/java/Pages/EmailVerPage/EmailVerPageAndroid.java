package Pages.EmailVerPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EmailVerPageAndroid extends BasePage implements EmailVerPage{
	
	@FindBy (id = "emailTextBox")
	public MobileElement emailInputBox;
	
	@FindBy (id = "id_evw_send_button")
	public MobileElement sendCodeButton;
	

	public EmailVerPageAndroid(AppiumDriver driver) {super(driver);}

	public void ValidEmailTest() {
		emailInputBox.sendKeys("automaton+00@gopassport.com");
		takeScreenshot("validEmail");
		sendCodeButton.click();
		takeScreenshot("verifyEmailMessage");
		//Verify notification message
		acceptButton.click();
	}

}
