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
	private MobileElement okButton;;
	
	@FindBy (name = "Retry")
	public MobileElement tryAgainButton;
	
	@FindBy (name = "back")
	public MobileElement backButton;
	
	@FindBy (name = "Home")
	public  MobileElement homeMenuOption;
	
	@FindBy (name = "menuicon")
	public MobileElement menuIcon;
	
	public CodeVerificationPageIOS(AppiumDriver driver) throws Exception {super(driver);}

	public void SendCorrectCodeTest() {
		BasePage.sleep(5000);
		codeInputBox.sendKeys("426");
		takeScreenshot("CodeTest1");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		submitButton.click();
		takeScreenshot("CodeTest2");
		okButton.click();
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
		okButton.click();
		takeScreenshot("CodeTest4");
		
	}

	public void NavBackTest() {
		backButton.click();
		
	}

	public void navToLanding() {
		backButton.click();
		backButton.click();
		menuIcon.click();
		homeMenuOption.click();
		
	}
}
