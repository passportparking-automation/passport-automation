package Pages.VehiclesPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class VehiclesPageAndroid extends BasePage implements  VehiclesPage{
	@FindBy (id= "id_add_vehicle_button")
	public MobileElement addVehicleButton;
	
	@FindBy(id="zoneInfo")
	public MobileElement zoneInfo;
	
	@FindBy(id="zoneTextBox")
	public MobileElement zoneTextBox;
	
	@FindBy(id="id_continue_button")
	public MobileElement continueButton;
	
	@FindBy (id="backImageView")
	public MobileElement backButton;
	
	@FindBy (id="saveVehicleButton")
	public MobileElement saveButton;
	
	@FindBy(id="vehicleListItem_1")
	public MobileElement mainTestVehicle;
	
	@FindBy(id="vehicleListItem_2")
	public MobileElement NonDieselOlderThan2015TestVehicle;
	
	@FindBy(id="vehicleListItem_3")
	public MobileElement NonDieselYoungerThan2015TestVehicle;
	
	@FindBy(id="vehicleListItem_4")
	public MobileElement NonDiesel2015TestVehicle;
	
	@FindBy(id="vehicleListItem_5")
	public MobileElement Diesel2015TestVehicle;
	
	@FindBy(id="vehicleListItem_6")
	public MobileElement DieselYoungThan2015TestVehicle;
	
	@FindBy(id="vehicleListItem_7")
	public MobileElement DieselOlderThan2015TestVehicle;
	
	@FindBy(id="vehicleListItem_8")
	public MobileElement NoGuruRecordVehicle;
	
	@FindBy(id="vehicleListItem_9")
	public MobileElement testVehicleToBeDeleted;
	

	
	public VehiclesPageAndroid(AppiumDriver driver) {	super(driver);}


	public void CheckVehiclesPageForExceptions() {
		addVehicleButton.isDisplayed();
	}


	public void navToLanding() {
		
			if(header.getText().equals("Enter Location")){
			driver.navigate().back();
		}else {
			if (header.getText().equals("Add Vehicle")){
				driver.navigate().back();
				driver.navigate().back();
				driver.navigate().back();
			}
			else{
				driver.navigate().back();
				driver.navigate().back();
			}
		}

	}
	
	public void clickAddV(){
		addVehicleButton.click();
		assertEquals(header.getText(), "Add Vehicle");
		
	}
	public void clickTestVehicle(){
		takeScreenshot("addV");
		mainTestVehicle.click();
		
	}
	
	public void NavTest(){
		clickAddV();
		backButton.click();
		Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        //Finding endy coordinate which is at top side of screen.
        int endy = (int) (size.height * 0.30);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        TouchAction swipe = new TouchAction(driver).press(startx, starty).waitAction().moveTo(startx,endy).release();
        swipe.perform();
		addVehicleButton.click();
		saveButton.click();
		assertEquals(popUpTitle.getText(),"Invalid VRM");
		takeScreenshot("invalidVRMPopUp");
		acceptButton.click();

		
	}
	public void CheckUpdateToVehiclePage(){
		mainTestVehicle.isDisplayed();
		takeScreenshot("UpdatedVPage");
	}

	public void navToUpdateDeleteVehicleDetialPage() {
		testVehicleToBeDeleted.click();
		
	}
	
	public void clickNonDieselOlderThan2015TestVehicle() {
		NonDieselOlderThan2015TestVehicle.click();
		
	}
	
	public void clickNonDieselYoungerThan2015TestVehicle() {
		NonDieselYoungerThan2015TestVehicle.click();
		
	}

	
	public void clickNonDiesel2015TestVehicle() {
		NonDiesel2015TestVehicle.click();
		
	}

	public void clickDiesel2015TestVehicle() {
		Diesel2015TestVehicle.click();
		
	}

	public void clickDieselYoungThan2015TestVehicle() {
		DieselYoungThan2015TestVehicle.click();
		
	}

	public void clickDieselOlderThan2015TestVehicle() {
		DieselOlderThan2015TestVehicle.click();
		
	}

	public void clickNoGuruRecordVehicle() {
		NoGuruRecordVehicle.click();		
	}

}
