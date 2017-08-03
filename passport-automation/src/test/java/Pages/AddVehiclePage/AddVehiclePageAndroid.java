package Pages.AddVehiclePage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AddVehiclePageAndroid extends BasePage implements AddVehiclePage{	
	@FindBy(id = "lpnBox")
	public MobileElement VRMInputBox;
	
	@FindBy(id = "vehicleFriendlyName")
	public MobileElement nickNameInputBox;
	
	@FindBy(id = "saveVehicleButton")
	public MobileElement saveVButton;
	
	@FindBy (id="viewHeader")
	public MobileElement header;
	
	@FindBy (id= "id_add_vehicle_button")
	public MobileElement addVehicleButton;
	
	@FindBy (id="lpnBox")
	public MobileElement vrmInput;
	
	@FindBy (id ="backImageView")
	public MobileElement backButton;

	

	public AddVehiclePageAndroid(AppiumDriver driver) {super(driver);	}

	public void addNonDieselYoungerThan2015() {
		VRMInputBox.sendKeys("DF59HZX");
		takeScreenshot("dTest2");
		nickNameInputBox.sendKeys("DF59HZX");
		takeScreenshot("dTest3");
		saveVButton.click();
		takeScreenshot("dTest4");	
	}

	public void addNonDieselOlderThan2015() {
		VRMInputBox.sendKeys("MJI9302");
		takeScreenshot("dTest21");
		nickNameInputBox.sendKeys("MJI9302");
		takeScreenshot("dTest31");
		saveVButton.click();
		takeScreenshot("dTest41");	
	}


	public void addNonDiesel2015() {
		VRMInputBox.sendKeys("RK65AWJ");
		takeScreenshot("dTest22");
		nickNameInputBox.sendKeys("RK65AWJ");
		takeScreenshot("dTest32");
		saveVButton.click();
		takeScreenshot("dTest42");		
	}


	public void addDieselOlderThan2015() {
		VRMInputBox.sendKeys("DE06YJB");
		takeScreenshot("dTest23");
		nickNameInputBox.sendKeys("DE06YJB");
		takeScreenshot("dTest33");
		saveVButton.click();
		takeScreenshot("dTest43");
	}

	public void addDieselYoungerThan2015() {
		VRMInputBox.sendKeys("LV66TXZ");
		takeScreenshot("dTest24");
		nickNameInputBox.sendKeys("LV66TXZ");
		takeScreenshot("dTest34");
		saveVButton.click();
		takeScreenshot("dTest44");
	}

	public void addDiesel2015() {
		VRMInputBox.sendKeys("T888SAP");
		takeScreenshot("dTest25");
		nickNameInputBox.sendKeys("T888SAP");
		takeScreenshot("dTest35");
		saveVButton.click();
		takeScreenshot("dTest45");
	}

	public void NoGuruRecord() {
		VRMInputBox.sendKeys("AAAAAAA");
		takeScreenshot("dTest25");
		nickNameInputBox.sendKeys("AAAAAAA");
		takeScreenshot("dTest35");
		saveVButton.click();
		takeScreenshot("dTest45");
		 
	}

	public void AddVehicleTest() {
		backButton.click();
		assertEquals(header.getText(), "Vehicles");
		addVehicleButton.click();
		saveVButton.click();
		assertEquals(popUpTitle.getText(), "Invalid VRM");
		takeScreenshot("InvalidVRM");
		acceptButton.click();
		vrmInput.sendKeys("Test");
		saveVButton.click();
		assertEquals(header.getText(), "Vehicles");
	}
	
	public void CheckUpdateToVehiclePage(){
		
		
	}

}
