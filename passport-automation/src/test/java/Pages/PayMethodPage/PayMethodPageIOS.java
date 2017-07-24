package Pages.PayMethodPage;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class PayMethodPageIOS extends BasePage implements PayMethodPage {

	@FindBy (name = "creditCard_0")
	private MobileElement testCreditCard;
	
	@FindBy (name = "No")
	private MobileElement noButton;
	
	public PayMethodPageIOS(AppiumDriver driver) {super(driver);}

	public void clickTestCreditCard() {
		testCreditCard.isDisplayed();
		takeScreenshot("testcreditcard1");
		testCreditCard.click();
		takeScreenshot("testcreditcard2");
	}
	
	public void clickNoButton() {
		noButton.click();
	}
	
	public void CheckPayMethodForExceptions(){
		
	}
}
