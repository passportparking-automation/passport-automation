package Pages.ProfilePage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.SendBugReportPage.SendBugReportPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ProfilePageAndroid extends BasePage implements ProfilePage {
	
	@FindBy (id="update")
	public MobileElement updateButton;
	
	public ProfilePageAndroid(AppiumDriver driver) {  super(driver);  }
	
	public void CheckProfilePageForExceptions(){
		
	}
	
	public void NavToUpdateProfTest(){
		updateButton.click();
		takeScreenshot("UpdateProfile");
	}

}
