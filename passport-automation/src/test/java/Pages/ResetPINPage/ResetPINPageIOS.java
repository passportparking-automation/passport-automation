package Pages.ResetPINPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class ResetPINPageIOS extends BasePage implements ResetPINPage {

	@FindBy(name = "Create your four digit PIN")
	public MobileElement pinLabel1;
	
	@FindBy (name="pinTextBox")
	public MobileElement pinBox;
	
	@FindBy (name="confirmPinTextBox")
	public MobileElement confirmPINBox;
	
	@FindBy (name="createPinButton")
	public MobileElement createPinButton;
	
	@FindBy (name="Ok")
	public MobileElement okButton;
	
	public ResetPINPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void ResetPINPageTest() {
		pinLabel1.isDisplayed();
		
		//pinTextBox
		pinBox.sendKeys("111");
		//confirmPinTextBox
		confirmPINBox.sendKeys("111");
		
		//createPinButton
		createPinButton.click();
		okButton.click();
		//PinTextBox
		pinBox.sendKeys("1111");
		//confirmPinTextBox
		confirmPINBox.sendKeys("2222");
		//createPinButton
		createPinButton.click();
		okButton.click();
		
		pinBox.sendKeys("1111");
		confirmPINBox.sendKeys("1111");
		createPinButton.click();
		takeScreenshot("RestSS8");
		okButton.click();	
	}
}
