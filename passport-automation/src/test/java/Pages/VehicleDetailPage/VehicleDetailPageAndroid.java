package Pages.VehicleDetailPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VehicleDetailPageAndroid extends BasePage implements VehicleDetailPage {
	@FindBy(id="updateVehicleBtn")
	public MobileElement updateVehicleButton;
	
	@FindBy(id="deleteVehicleBtn")
	public MobileElement deleteVehicleButton;
	
	@FindBy(id="id_privacy_link_msg")
	public MobileElement privPolLink;
	
	
	public VehicleDetailPageAndroid(AppiumDriver driver) {super(driver);}
	
	public void NavTest() {
		updateVehicleButton.isDisplayed();
		deleteVehicleButton.isDisplayed();
		privPolLink.isDisplayed();
		takeScreenshot("VDP");
		backButton.click();
	}

	public void PrivacyNavTest() {
		privPolLink.click();
		takeScreenshot("privTestVD");
		backButton.click();
	}
	
	public void NavToUpdate() {
		updateVehicleButton.click();
		takeScreenshot("updateVTest");
	}

	
	public void DeleteTest() {
		deleteVehicleButton.click();
		popUp.isDisplayed();
		takeScreenshot("dtest");
		declineButton.click();
		updateVehicleButton.isDisplayed();
		deleteVehicleButton.click();
		acceptButton.click();
		takeScreenshot("vshouldbegone");
		
	}

}
