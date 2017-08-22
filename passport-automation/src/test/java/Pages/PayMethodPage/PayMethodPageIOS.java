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
	
	@FindBy (name = "Yes")
	private MobileElement yesButton;
	
	@FindBy (name = "Please select the length of stay in Location 6861, F2, Baker St at F2 Westminster City Council. VRM  TEST.")
	private MobileElement paymentMethodMessage;
	
	public PayMethodPageIOS(AppiumDriver driver) throws Exception {super(driver);}

	public void clickTestCreditCard() {
		testCreditCard.isDisplayed();
		takeScreenshot("testcreditcard1");
		testCreditCard.click();
		takeScreenshot("testcreditcard2");
	}
	
	public void CheckPayMethodForExceptions(){
		takeScreenshot("DieselPopup");
	}

	public void declinePayment() {
		noButton.click();
	}
	
	public void acceptPayment() {
		yesButton.click();
	}
}
