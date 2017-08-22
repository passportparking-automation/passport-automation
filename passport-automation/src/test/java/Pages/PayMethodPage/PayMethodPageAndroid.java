package Pages.PayMethodPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PayMethodPageAndroid extends BasePage implements  PayMethodPage{
	@FindBy(id="message")
	public MobileElement paymentMethodMessage;

	public PayMethodPageAndroid(AppiumDriver driver) throws Exception {super(driver);}

	public void CheckPayMethodForExceptions() {
		paymentMethodMessage.isDisplayed();
		BasePage.sleep(2000);
		takeScreenshot("DieselPopup");
	}

	
	
	public void acceptPayment() {
		
	}
	
	
	
	
	public void clickTestCreditCard() {	
		
	}

	public void declinePayment() {
		declineButton.click();
		
	}
	

}
