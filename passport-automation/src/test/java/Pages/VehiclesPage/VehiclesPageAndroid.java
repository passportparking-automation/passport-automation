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
	
	@FindBy (id="viewHeader")
	public MobileElement header;
	
	@FindBy(id="id_continue_button")
	public MobileElement continueButton;
	
	@FindBy (id="vehicleListLabel")
	public MobileElement listLabel;
	
	@FindBy (id="backImageView")
	public MobileElement backButton;
	
	@FindBy (id="saveVehicleButton")
	public MobileElement saveButton;
	
	public VehiclesPageAndroid(AppiumDriver driver) {	super(driver);}


	public void clickAddV() {
		addVehicleButton.click();
	}


	public void CheckVehiclesPageForExceptions() {
		zoneTextBox.sendKeys("8904");
		continueButton.click();
		BasePage.sleep(2000);
		assertEquals(header.getText(), "Select Vehicle");
		takeScreenshot("AddVehicle");
		assertEquals(listLabel.getText(), "Please choose the vehicle you would like to park in Location 8904 (E1, Bury Street at E1 Westminster City Council)");
		backButton.click();
		assertEquals(header.getText(), "Enter Location");
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
	
	public void AddVTest(){
		zoneTextBox.sendKeys("8904");
		continueButton.click();
		BasePage.sleep(5000);
		//scroll//
		int offset = 1;
        int y = driver.manage().window().getSize().getHeight();
        int x = driver.manage().window().getSize().getWidth();
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release();
        touchAction.perform();
      //scroll//
		addVehicleButton.click();
		assertEquals(header.getText(), "Add Vehicle");
		
	}
	
	public void NavTest(){
		AddVTest();
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
		takeScreenshot("VPage");
	}
}
