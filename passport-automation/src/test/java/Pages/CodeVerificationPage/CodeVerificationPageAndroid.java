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
	
	public CodeVerificationPageAndroid(AppiumDriver driver) {super(driver);}

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
