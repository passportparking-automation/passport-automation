package Pages.HelpPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HelpPageAndroid extends BasePage implements HelpPage {
	
	@FindBy (id = "tutorialCloseButton")
	public MobileElement closeHelpButton;
	
	
	public HelpPageAndroid(AppiumDriver driver) {super(driver); }

	public void CloseHelpTest() {
		closeHelpButton.click();
		
	}

	public void CheckHelpPageForExceptiosn() {
		// TODO Auto-generated method stub
		
	}

	public void HelpNavTest() {
		
	}

}
