package Pages.CodeVerificationPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class CodeVerificationPageIOS extends BasePage implements CodeVerificationPage {
	
	@FindBy (name = "codeInput")
	public MobileElement codeInputBox;
	
	@FindBy (name = "Verify")
	public MobileElement submitButton;

	@FindBy (name = "Ok")
	private MobileElement acceptButton;
	
	public CodeVerificationPageIOS(AppiumDriver driver) {super(driver);}

	public void VerCodeTest() {
		codeInputBox.sendKeys("777");
		takeScreenshot("pinTest");
		submitButton.click();
		takeScreenshot("pinTest2");
		acceptButton.click();
		takeScreenshot("pinTest3");
	}

	@Override
	public void CheckCodeVerForExceptions() {
		// TODO Auto-generated method stub
		
	}
}
