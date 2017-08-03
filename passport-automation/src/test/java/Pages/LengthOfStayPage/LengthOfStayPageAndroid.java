package Pages.LengthOfStayPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class LengthOfStayPageAndroid extends BasePage implements LengthOfStayPage {

	@FindBy (id="durationHeader")
	public MobileElement durationMessage;
	
	@FindBy (id = "shortcutButton")
	public MobileElement maxStayButton;
	
	@FindBy (id = "id_titlebar_back_button")
	public MobileElement backButton;
	
	public LengthOfStayPageAndroid(AppiumDriver driver) {super(driver);}
	
	public void clickMaxStayButton() {
		maxStayButton.click();
		takeScreenshot("lengthOfStay2");
	}
	public void CheckLOSForExceptions(){
		 
	}
	
	
	
	
	
	
	public void clickBackButton() {
		BasePage.sleep(4000);
		backButton.click();
	}
}
