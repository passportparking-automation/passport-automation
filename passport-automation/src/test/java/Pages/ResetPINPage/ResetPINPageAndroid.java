package Pages.ResetPINPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class ResetPINPageAndroid extends BasePage implements ResetPINPage{
	@FindBy(id = "createPinPromptLabel")
	public MobileElement pinLabel1;
	
	@FindBy (id="pinTextBox")
	public MobileElement pinBox;
	
	@FindBy (id="confirmPinTextBox")
	public MobileElement confirmPINBox;
	
	@FindBy (id="createPinButton")
	public MobileElement createPinButton;
	
	
	public ResetPINPageAndroid(AppiumDriver driver) throws Exception {super(driver);}

	public void ResetPINPageTest() {
		pinLabel1.isDisplayed();
		pinBox.isDisplayed();
		confirmPINBox.isDisplayed();
		createPinButton.isDisplayed();
		takeScreenshot("RestSS1");
		pinBox.sendKeys("111");
		confirmPINBox.sendKeys("111");
		takeScreenshot("RestSS2");
		createPinButton.click();
		popUp.isDisplayed();
		takeScreenshot("RestSS3");
		acceptButton.click();
		takeScreenshot("RestSS4");
		pinBox.sendKeys("1111");
		confirmPINBox.sendKeys("2222");
		takeScreenshot("RestSS5");
		createPinButton.click();
		popUp.isDisplayed();
		takeScreenshot("RestSS6");
		acceptButton.click();
		
		pinBox.sendKeys("1111");
		confirmPINBox.sendKeys("1111");
		takeScreenshot("RestSS7");
		createPinButton.click();
		takeScreenshot("RestSS8");
		acceptButton.click();
	}

	
	

}
