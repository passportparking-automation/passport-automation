package Pages.FAQPage;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class FAQPageIOS extends BasePage implements FAQPage {

	@FindBy (name = "back")
	private MobileElement backButton;
	
	public FAQPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
	}

	public void FAQNavTest() {
		takeScreenshot("faqNavTest");
		backButton.click();
	}
}
