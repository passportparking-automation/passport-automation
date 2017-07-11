package Pages.ZonePage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ZonePageAndroid extends BasePage implements ZonePage{
	@FindBy(id ="zoneTextBox")
	public MobileElement zoneInputBox;
	
	@FindBy(xpath ="//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")
	public MobileElement continueButton;
	
	public ZonePageAndroid(AppiumDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public void goToDieselZone1() {
		zoneInputBox.sendKeys("6861");
		takeScreenshot("desielScreenshot1");
		continueButton.click();
	}

}
