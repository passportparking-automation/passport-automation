package Pages.CodeVerificationPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CodeVerificationPageAndroid extends BasePage implements CodeVerificationPage{

	@FindBy (id = "codeTextBox")
	public MobileElement codeInputBox;
	
	@FindBy (xpath="//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")
	public MobileElement submitButton;
	
	public CodeVerificationPageAndroid(AppiumDriver driver) {super(driver);}

	public void VerCodeTest() {
		codeInputBox.sendKeys("777");
		takeScreenshot("pinTest");
		submitButton.click();
		takeScreenshot("pinTest2");
		acceptButton.click();
		takeScreenshot("pinTest3");
	}

}
