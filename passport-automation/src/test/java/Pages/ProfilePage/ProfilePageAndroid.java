package Pages.ProfilePage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.SendBugReportPage.SendBugReportPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ProfilePageAndroid extends BasePage implements ProfilePage {
	@FindBy (name= "User ID")
	public MobileElement userIDField;
	
	@FindBy (name= "E-mail")
	public MobileElement userEmailField;
	
	@FindBy (name="update")
	public MobileElement updateButton;
	
	public ProfilePageAndroid(AppiumDriver driver) throws Exception {  super(driver);  }
	
	public void CheckProfilePageForExceptions(){
		//userIDField.isDisplayed();
		//userEmailField.isDisplayed();
		takeScreenshot("ProfPage");
	}
	
	public void NavToUpdateProfTest(){
		updateButton.click();
		takeScreenshot("updatePage");
	}

}
