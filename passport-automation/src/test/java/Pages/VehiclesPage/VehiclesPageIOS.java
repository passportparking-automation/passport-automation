package Pages.VehiclesPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class VehiclesPageIOS extends BasePage implements VehiclesPage {

	@FindBy (name = "addVehicleButton")
	public MobileElement addVehicleButton;
	
	public VehiclesPageIOS(AppiumDriver driver) {super(driver);}

	public void clickAddV() {
		addVehicleButton.click();

}

	@Override
	public void CheckVehiclesPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navToLanding() {
		// TODO Auto-generated method stub
		
	}
}
