package Pages.PayToParkPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.LandingPage.LandingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PayToParkPageAndroid extends BasePage implements PayToParkPage {
		
	@FindBy(id="zoneInfoButton")
	public MobileElement zoneInfoButton;
	
	@FindBy(id="id_continue_button")
	public MobileElement continueButton;
	
	@FindBy(id="zoneTextBox")
	public MobileElement zoneTextBox;
	
	@FindBy(id="backImageView")
	public MobileElement backButton;

	
	public PayToParkPageAndroid(AppiumDriver driver) { super(driver); }

	public void EmptyAndFalseZoneTest() {
		zoneInfoButton.click();
		assertEquals(popUpMessage.getText(), "Please enter a location number to proceed further");
		takeScreenshot("NoLocationNumber");
		acceptButton.click();
		continueButton.click();
		assertEquals(popUpMessage.getText(), "Please enter a location number to proceed further");
		takeScreenshot("NoLocationNumber2");
		acceptButton.click();
		zoneTextBox.sendKeys("1111");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		zoneInfoButton.click();
		assertEquals(popUpMessage.getText(), "This is not a location within our system. Please try a different location before continuing.");
		takeScreenshot("WrongLocationNumber");
		acceptButton.click();
		continueButton.click();
		assertEquals(popUpMessage.getText(), "This is not a location within our system. Please try a different location before continuing.");
		takeScreenshot("WrongLocationNumber2");
		acceptButton.click();
		
		
		
	}
	
	public void CorrectZoneNavTest(){
		zoneTextBox.sendKeys("8904");
		zoneInfoButton.click();
		takeScreenshot("LocationInfo");
		acceptButton.click();
	
		
	}
	
	public void navToLanding(){
		backButton.click();
	}



}
