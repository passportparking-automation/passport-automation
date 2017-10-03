package Pages.TicketsPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TicketsPageAndroid extends BasePage implements TicketsPage{
	
	//The "1 day pass" and "7 day pass" objects have the same IDs.
	//The "$5.29" and "$29.25" objects have the same IDs
	
	@FindBy(id="purchased_label")
	public MobileElement purchasedLabel;
	
	@FindBy(id="purchase_ticket_instruction")
	public MobileElement purchaseTicketInstruction;

	public TicketsPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckTicketPageForExcpetions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void OneDayPassTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void MultiDayPassTest() {
		// TODO Auto-generated method stub
		
	}

}
