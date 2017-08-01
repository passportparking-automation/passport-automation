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
	private MobileElement acceptButton;;
	
	@FindBy (name = "Retry")
	public MobileElement tryAgainButton;
	
	@FindBy (name = "back")
	public MobileElement backButton;
	
	public CodeVerificationPageIOS(AppiumDriver driver) {super(driver);}

	public void SendCorrectCodeTest() {
		codeInputBox.sendKeys("963");
		takeScreenshot("CodeTest1");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		submitButton.click();
		takeScreenshot("CodeTest2");
		acceptButton.click();
		takeScreenshot("CodeTest3");
		
	}

	public void CheckCodeVerForExceptions() {
		codeInputBox.isDisplayed();
		submitButton.isDisplayed();
		tryAgainButton.isDisplayed();
		takeScreenshot("CodeTest4");
		
	}

	public void EmptyVerTest() {
		takeScreenshot("CodeTest4");
		submitButton.click();
		acceptButton.click();
		takeScreenshot("CodeTest4");
		
	}

	public void NavBackTest() {
		backButton.click();
		
	}

	@Override
	public void navToLanding() {
		// TODO Auto-generated method stub
		
	}
}
