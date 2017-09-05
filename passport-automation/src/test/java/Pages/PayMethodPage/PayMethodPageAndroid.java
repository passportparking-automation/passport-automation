package Pages.PayMethodPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PayMethodPageAndroid extends BasePage implements PayMethodPage {
	@FindBy(id = "message")
	public MobileElement paymentMethodMessage;

	public PayMethodPageAndroid(AppiumDriver driver) {
		super(driver);
	}

	public void CheckPayMethodForExceptions() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		takeScreenshot("Popup" + System.currentTimeMillis());
	}

	public void declinePayment() {
		declineButton.click();
		backButton.click();
		assertEquals(header.getText(), "Select Vehicle");

	}

	public void acceptPayment() {
		acceptButton.click();
	}

	public void checkPopForTax_NonDieselYoungerThan2015() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		String actualMessage = paymentMethodMessage.getText();
		System.out.println(actualMessage);
		/*
		 * if(actualMessage.contains("Total Fee: £19.60")){
		 * Assert.assertTrue(true); } else if
		 * (actualMessage.contains("Total Fee: £19.60")){
		 * 
		 * }
		 */

	}

	public void checkPopForTax_NonDieselOlderThan2015() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		String actualMessage = paymentMethodMessage.getText();
		System.out.println(actualMessage);
		/*
		 * if(actualMessage.contains("Total Fee: £19.60")){
		 * Assert.assertTrue(true); } else if
		 * (actualMessage.contains("Total Fee: £19.60")){
		 * 
		 * }
		 */

	}

	public void checkPopForTax_NonDiesel2015() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		String actualMessage = paymentMethodMessage.getText();
		System.out.println(actualMessage);
		/*
		 * if(actualMessage.contains("Total Fee: £19.60")){
		 * Assert.assertTrue(true); } else if
		 * (actualMessage.contains("Total Fee: £19.60")){
		 * 
		 * }
		 */

	}

	public void checkPopForTax_Diesel2015() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		String actualMessage = paymentMethodMessage.getText();
		System.out.println(actualMessage);
		/*
		 * if(actualMessage.contains("Total Fee: £19.60")){
		 * Assert.assertTrue(true); } else if
		 * (actualMessage.contains("Total Fee: £19.60")){
		 * 
		 * }
		 */

	}

	public void checkPopForTax_DieselYoungerThan2015() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		String actualMessage = paymentMethodMessage.getText();
		System.out.println(actualMessage);
		/*
		 * if(actualMessage.contains("Total Fee: £19.60")){
		 * Assert.assertTrue(true); } else if
		 * (actualMessage.contains("Total Fee: £19.60")){
		 * 
		 * }
		 */

	}

	public void checkPopForTax_DieselOlderThan2015() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		String actualMessage = paymentMethodMessage.getText();
		System.out.println(actualMessage);
		/*
		 * if(actualMessage.contains("Total Fee: £19.60")){
		 * Assert.assertTrue(true); } else if
		 * (actualMessage.contains("Total Fee: £19.60")){
		 * 
		 * }
		 */

	}

	public void checkPopForTax_NoGuruRecord() {
		popUp.isDisplayed();
		paymentMethodMessage.isDisplayed();
		String actualMessage = paymentMethodMessage.getText();
		System.out.println(actualMessage);
		/*
		 * if(actualMessage.contains("Total Fee: £19.60")){
		 * Assert.assertTrue(true); } else if
		 * (actualMessage.contains("Total Fee: £19.60")){
		 * 
		 * }
		 */

	}

}
