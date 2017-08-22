package Pages.LengthOfStayPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class LengthOfStayPageIOS extends BasePage implements LengthOfStayPage {

	@FindBy (name = "maxStay")
	private MobileElement maxStayButton;
	
	@FindBy (name = "back")
	private MobileElement backButton;
	
	public LengthOfStayPageIOS(AppiumDriver driver) throws Exception {super(driver);}
	
	public void clickMaxStayButton() {
		maxStayButton.isDisplayed();
		takeScreenshot("lengthOfStay1");
		maxStayButton.click();
		takeScreenshot("lengthOfStay2");
	}
	
	public void clickBackButton() {
		BasePage.sleep(4000);
		backButton.click();
	}

	public void CheckLOSForExceptions() {
		// TODO Auto-generated method stub
		
	}
}
