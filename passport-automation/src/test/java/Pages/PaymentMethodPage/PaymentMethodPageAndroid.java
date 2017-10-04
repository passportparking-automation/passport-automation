package Pages.PaymentMethodPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PaymentMethodPageAndroid extends BasePage implements PaymentMethodPage{
	
	@FindBy(id="payment_method_type_image")
	public MobileElement paymentMethodTypeImage;
	
	@FindBy(id="card_nickname")
	public MobileElement cardNickname;
	
	@FindBy(id="cardholder_name")
	public MobileElement cardholderName;
	
	@FindBy(id="change_card_button")
	public MobileElement changeCardButton;

	public PaymentMethodPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckPaymentMethodPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

}
