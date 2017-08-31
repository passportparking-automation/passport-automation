package Pages.ActiveSessionPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ActiveSessionPageAndroid extends BasePage implements ActiveSessionPage {
	@FindBy(id="overlay_header")
	public MobileElement overlayTitle;
	
	@FindBy(id="overlay_description")
	public MobileElement overlayDdescription;
	
	@FindBy(id="overlay_tap_to_close")
	public MobileElement tapToClose;
	
	@FindBy(id="overlay_options")
	public MobileElement overlayOptions;
	
	@FindBy(id="timerView")
	public MobileElement countDown;
	
	@FindBy(id="zoneInfoButton_simple_icon")
	public MobileElement zoneInfoButton;
	
	@FindBy(id="btnExtendParking_simple")
	public MobileElement extendButton;
	
	
	public ActiveSessionPageAndroid(AppiumDriver driver) { super(driver); }

	public void CheckActiveSessionPageForExceptions() {
		overlayTitle.isDisplayed();
		overlayDdescription.isDisplayed();
		tapToClose.isDisplayed();
		overlayOptions.isDisplayed();
		takeScreenshot("overlay");
		tapToClose.click();
		//assertEquals(header.getText(), "Active Session");
		countDown.isDisplayed();
		//zoneInfo.isDisplayed();
		//sessionInfo.isDisplayed();
		zoneInfoButton.isDisplayed();
		takeScreenshot("activeSession1");
		zoneInfoButton.click();
		popUp.isDisplayed();
		takeScreenshot("zoneInfoSS");
		acceptButton.click();
		extendButton.click();
		popUp.isDisplayed();
		acceptButton.click();
	}

}
