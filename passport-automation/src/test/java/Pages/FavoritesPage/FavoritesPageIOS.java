package Pages.FavoritesPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FavoritesPageIOS extends BasePage implements FavoritesPage{
	
	@FindBy(name = "Ok")
	private MobileElement OKButtonFavourites;
	
	@FindBy (name = "back")
	private MobileElement backButton;
	
	public FavoritesPageIOS(AppiumDriver driver) { super(driver); }

	public void FavoritesTest() {
		takeScreenshot("FavPage");
		if(OKButtonFavourites.isDisplayed()){
			OKButtonFavourites.click();
		}
		else{
			takeScreenshot("FavPage2");
			backButton.click();
		}
	}
}
