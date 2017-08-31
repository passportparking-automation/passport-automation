package Pages.UpdateVehiclePage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UpdateVehiclePageAndroid extends BasePage implements UpdateVehiclePage {
	@FindBy(id="vehicleFriendlyNameBox")
	public MobileElement vehicleFriendlyNameTextBox;
	
	@FindBy(id="updateVehicleBtn")
	public MobileElement updateVehicleButton;
	
	public UpdateVehiclePageAndroid(AppiumDriver driver) {super(driver);	}

	public void NavTest() {
		takeScreenshot("navTestforUpdateV");
		vehicleFriendlyNameTextBox.isDisplayed();
		updateVehicleButton.isDisplayed();
		takeScreenshot("navTestforUpdateV2");
		backButton.click();
	}

	public void VFriendTest() {
		vehicleFriendlyNameTextBox.sendKeys("Vehicle Friendly Name");
		updateVehicleButton.click();
		popUp.isDisplayed();
		declineButton.click();
		updateVehicleButton.click();
		popUp.isDisplayed();
		acceptButton.click();
		backButton.click();
	}

}
