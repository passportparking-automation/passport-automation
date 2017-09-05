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

	@Override
	public void CheckUpdateToVehiclePage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NavTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navToUpdateDeleteVehicleDetialPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickTestVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickNonDieselOlderThan2015TestVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickNonDieselYoungerThan2015TestVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickNonDiesel2015TestVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickDiesel2015TestVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickDieselYoungThan2015TestVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickDieselOlderThan2015TestVehicle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickNoGuruRecordVehicle() {
		// TODO Auto-generated method stub
		
	}

}
