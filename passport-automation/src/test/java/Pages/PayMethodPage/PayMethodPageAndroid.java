package Pages.PayMethodPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PayMethodPageAndroid extends BasePage implements  PayMethodPage{
	@FindBy(id="message")
	public MobileElement paymentMethodMessage;

	public PayMethodPageAndroid(AppiumDriver driver) {super(driver);}

	public void CheckPayMethodForExceptions() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		BasePage.sleep(2000);
		takeScreenshot("DieselPopup"+System.currentTimeMillis());
	}

	public void declinePayment() {
		declineButton.click();
		
	}
	
	public void acceptPayment() {	
		acceptButton.click();
	}

	

}
