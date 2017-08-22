package Pages.CodeVerificationPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CodeVerificationPageAndroid extends BasePage implements CodeVerificationPage{

	@FindBy (id = "codeTextBox")
	public MobileElement codeInputBox;
	
	@FindBy (id="id_cvw_verify")
	public MobileElement submitButton;
	
	@FindBy (id="id_cvw_try_again")
	public MobileElement tryAgainButton;
	
	public CodeVerificationPageAndroid(AppiumDriver driver) throws Exception {super(driver);}

	public void SendCorrectCodeTest() {
		codeInputBox.sendKeys("777");
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
	public void NavBackTest() {
		backButton.click();
	}
	public void EmptyVerTest() {
		takeScreenshot("CodeTest4");
		submitButton.click();
		popUp.isDisplayed();
		acceptButton.click();
		takeScreenshot("CodeTest4");
	}

	public void navToLanding() {
		driver.navigate().back();
		driver.navigate().back(); 
	}
	

}
