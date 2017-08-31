package Pages.ProfilePage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.SendBugReportPage.SendBugReportPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ProfilePageAndroid extends BasePage implements ProfilePage {
	//@FindBy (name= "User ID")
	//public MobileElement userIDField;
	
	@FindBy (id= "activity_profile_email_row")
	public MobileElement userEmailField;
	
	@FindBy (id="update")
	public MobileElement updateButton;
	
	public ProfilePageAndroid(AppiumDriver driver) {  super(driver);  }
	
	public void CheckProfilePageForExceptions(){
		//userIDField.isDisplayed();
		//userEmailField.isDisplayed();
		updateButton.isDisplayed();
		userEmailField.isDisplayed();
		takeScreenshot("ProfPage");
	}
	
	public void NavToUpdateProfTest(){
		updateButton.click();
		takeScreenshot("updatePage");
	}

}
