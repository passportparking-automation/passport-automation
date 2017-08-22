package Pages.VehiclesPage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class VehiclesPageIOS extends BasePage implements VehiclesPage {

	@FindBy (name = "addVehicleButton")
	public MobileElement addVehicleButton;
	
	@FindBy(name = "enterZoneInput")
	public MobileElement zoneTextBox;
	
	@FindBy (name = "id_continue_button")
	private MobileElement continueButton;
	
	@FindBy (name = "back")
	private MobileElement backButton;
	
	public VehiclesPageIOS(AppiumDriver driver) throws Exception {super(driver);}

	public void clickAddV() {
		/*List<MobileElement> addVehicleButton = driver.findElements(By.className("XCUIElementTypeButton"));
		addVehicleButton.get(1).click();*/
		addVehicleButton.click();

	}

	public void CheckVehiclesPageForExceptions() {
		addVehicleButton.isDisplayed();
		takeScreenshot("AddVehicle");
	}

	public void navToLanding() {
		// TODO Auto-generated method stub
		
	}

	public void CheckUpdateToVehiclePage() {
		takeScreenshot("VPage");
		
	}

	public void AddVTest() {
		// TODO Auto-generated method stub
		
	}

	public void NavTest() {
		// TODO Auto-generated method stub
		
	}
}
