package Pages.VehiclesPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VehiclesPageAndroid extends BasePage implements  VehiclesPage{
	@FindBy (id= "id_add_vehicle_button")
	public MobileElement addVehicleButton;
	
	@FindBy(id="zoneInfo")
	public MobileElement zoneInfo;
	
	public VehiclesPageAndroid(AppiumDriver driver) {	super(driver);}

	@Override
	public void clickAddV() {
		addVehicleButton.click();
		

	}


	public void CheckVehiclesPageForExceptions() {
		addVehicleButton.isDisplayed();
		zoneInfo.isDisplayed();
		BasePage.sleep(2000);
		takeScreenshot("AddVehicle");
	}

	public void navToLanding() {
		menuImage.click();
		homeMenuOption.click();
	}
	public void CheckUpdateToVehiclePage(){
		takeScreenshot("VPage");
	}
}
