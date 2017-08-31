package Pages.OptionsPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class OptionsPageAndroid extends BasePage implements OptionsPage{
	@FindBy(id="applicationRemindersToggleSetting")
	public MobileElement reminderLabel;
	
	@FindBy(id="reminderSoundToggleSetting")
	public MobileElement reminderSoundLabel;
	
	@FindBy(id="emailReceiptToggleSetting")
	public MobileElement emailReciptLabel;
	
	
	public OptionsPageAndroid(AppiumDriver driver) {super(driver);}

	public void CheckOptionsForExceptions() {
		reminderLabel.isDisplayed();
		reminderSoundLabel.isDisplayed();
		emailReciptLabel.isDisplayed();
		takeScreenshot("optionsSS");
	}

}
