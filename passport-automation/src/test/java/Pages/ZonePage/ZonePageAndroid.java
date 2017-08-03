package Pages.ZonePage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ZonePageAndroid extends BasePage implements ZonePage{
	@FindBy(id ="zoneTextBox")
	public MobileElement zoneTextBox;
	
	@FindBy(id ="id_continue_button")
	public MobileElement continueButton;
	
	public ZonePageAndroid(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void goToDieselZone1() {
		zoneTextBox.sendKeys("6861");
		takeScreenshot("desielScreenshot1");
		continueButton.click();
	}


	@Override
	public void CheckZoneForExceptions() {
		// TODO Auto-generated method stub
		
	}

}
