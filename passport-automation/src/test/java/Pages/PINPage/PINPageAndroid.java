package Pages.PINPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PINPageAndroid extends BasePage  implements PINPage{
	@FindBy (id="pinTextBox")
	public MobileElement PINInputBox;
	
	@FindBy (xpath="//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")
	public MobileElement PINSubmitButton;
	

	public PINPageAndroid(AppiumDriver driver) {super(driver);}


	public void SendCorrectPINTest() {
		PINInputBox.sendKeys("1111");
		takeScreenshot("verTest1");
		PINSubmitButton.click();
		takeScreenshot("verTest1");
		backButton.click();
	}

}
