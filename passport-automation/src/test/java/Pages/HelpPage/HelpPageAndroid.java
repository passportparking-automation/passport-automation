package Pages.HelpPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HelpPageAndroid extends BasePage implements HelpPage {
	
	@FindBy (id = "tutorialCloseButton")
	public MobileElement closeHelpButton;
	
	@FindBy (xpath = "	//android.widget.RelativeLayout[1]/android.view.View[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.TextView[2]")
	public MobileElement helpMenu;
	

	
	
	public HelpPageAndroid(AppiumDriver driver) {super(driver); }

	public void CloseHelpTest() {
		closeHelpButton.click();
		
	}

	public void CheckHelpPageForExceptiosn() {
	
			//landingpage.CheckMenuOptionsForExceptions();
			menuIcon.click();
			helpMenu.isDisplayed();
			closeHelpButton.click();

	}

	public void HelpNavTest() {
		// TODO Auto-generated method stub
		
	}
	



}
