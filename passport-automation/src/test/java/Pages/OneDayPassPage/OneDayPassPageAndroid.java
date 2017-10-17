package Pages.OneDayPassPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class OneDayPassPageAndroid extends BasePage implements OneDayPassPage{
	
	@FindBy(id="floating_ticket_image")
	public MobileElement floatingTicketImage;
	
	@FindBy(id="purchase_ticket_quantity")
	public MobileElement purchaseTicketQuantity;
	
	// Payment Picker Container is not 'clickable.'
	@FindBy(id="payment_picker_container")
	public MobileElement paymentPickerContainer;
	
	@FindBy(id="purchase_ticket_agency")
	public MobileElement purchaseTicketAgency;
	
	@FindBy(id="purchase_ticket_fare")
	public MobileElement purchaseTicketFare;
	
	@FindBy(id="purchase_ticket_button")
	public MobileElement purchaseTicketButton;
	
	@FindBy(id="purchase_ticket_more")
	public MobileElement purchaseTicketMore;
	
	@FindBy(id="activation_rules_list")
	public MobileElement activationRulesList;
	
	@FindBy(id="ticket_activation_rule_icon")
	public MobileElement ticketActivationRuleIcon;
	
	@FindBy(id="ticket_activation_rule_description")
	public MobileElement ticketActivationRuleDescription;
	
	@FindBy(id="md_buttonDefaultNegative")
	public MobileElement negativeConfirmPurchase;
	
	@FindBy(id="md_buttonDefaultPositive")
	public MobileElement positiveConfirmPurchase;

	public OneDayPassPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckOneDayPassForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckConfirmPurchaseScreenForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MoreTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AcceptPaymentTest() {
		// TODO Auto-generated method stub
		
	}

}
