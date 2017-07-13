package Pages.FavoritesPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FavoritesPageAndroid extends BasePage implements FavoritesPage{
	
	
	
	public FavoritesPageAndroid(AppiumDriver driver) { super(driver); }

	public void FavoritesTest() {
		takeScreenshot("FavPage");
		if(acceptButton.isDisplayed()){
			acceptButton.click();
		}
		else{
			takeScreenshot("FavPage2");
			backButton.click();
		}
		
	}
	
}
