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

	@Override
	public void CheckPayMethodForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void declinePayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptPayment() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPopForTax_NonDieselYoungerThan2015() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPopForTax_NonDieselOlderThan2015() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPopForTax_NonDiesel2015() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPopForTax_Diesel2015() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPopForTax_DieselYoungerThan2015() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPopForTax_DieselOlderThan2015() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkPopForTax_NoGuruRecord() {
		// TODO Auto-generated method stub
		
	}
}
