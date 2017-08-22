package Pages.ProfilePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class ProfilePageIOS extends BasePage implements ProfilePage {

	@FindBy (name = "update")
	private MobileElement updateButton;
	
	public ProfilePageIOS(AppiumDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void CheckProfilePageForExceptions() {
		updateButton.isDisplayed();
		takeScreenshot("ProfPage");
	}
	
	public void NavToUpdateProfTest(){
		updateButton.click();
		takeScreenshot("updatePage");
	}

}
