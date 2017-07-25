package Pages.ResetPINPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class ResetPINPageAndroid extends BasePage implements ResetPINPage{
	@FindBy (id="id_lw_reset_button")
	public MobileElement resetPin;

	public ResetPINPageAndroid(AppiumDriver driver) {super(driver);}

	public void CheckResetPINPageForExceptions() {
		resetPin.click();
		popUp.isDisplayed();
	}

}
