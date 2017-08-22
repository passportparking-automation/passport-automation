package Pages.ZonePage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class ZonePageIOS extends BasePage implements ZonePage {

	@FindBy(name = "enterZoneInput")
	public MobileElement zoneInputBox;
	
	@FindBy(name ="continueButton")
	public MobileElement continueButton;
	
	@FindBy(name = "Cancel")
	private MobileElement cancelButtonDieselPopUp;
	
	@FindBy(name = "Continue")
	private MobileElement continueButtonDieselPopUp;
	
	public ZonePageIOS(AppiumDriver driver) throws Exception {super(driver);}
	
	public void goToDieselZone1() {
		zoneInputBox.sendKeys("6861");
		takeScreenshot("desielScreenshot1");
		continueButton.click();
	}
	
	public void clickContinueButtonDieselPopUp() {
		continueButtonDieselPopUp.isDisplayed();
		takeScreenshot("desielScreenshot2");
		continueButtonDieselPopUp.click();
	}

	public void CheckZoneForExceptions() {
		// TODO Auto-generated method stub
		
	}
}
