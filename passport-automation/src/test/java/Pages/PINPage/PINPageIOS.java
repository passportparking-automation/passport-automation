package Pages.PINPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class PINPageIOS extends BasePage implements PINPage {

	@FindBy (name = "loginPIN")
	public MobileElement PINInputBox;
	
	@FindBy (name = "loginButton")
	public MobileElement PINSubmitButton;
	

	public PINPageIOS(AppiumDriver driver) {super(driver);}


	public void SendCorrectPINTest() {
		PINInputBox.sendKeys("1111");
		takeScreenshot("verTest1");
		PINSubmitButton.click();
		takeScreenshot("verTest1");
	}


	@Override
	public void SendShortValuedPINTest() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void SendFalsePINTest() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void CheckSecureLoginForExceptions() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void EmptyPINTest() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void InvalidPINTest() {
		// TODO Auto-generated method stub
		
	}
}
