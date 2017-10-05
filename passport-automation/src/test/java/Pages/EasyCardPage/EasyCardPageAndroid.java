package Pages.EasyCardPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class EasyCardPageAndroid extends BasePage implements EasyCardPage{
	
	@FindBy(id="menu_action_add")
	public MobileElement menuActionAdd;
	
	@FindBy(id="card_image")
	public MobileElement cardImage;
	
	@FindBy(id="easy_card_rider_class")
	public MobileElement easyCardRiderClass;
	
	@FindBy(id="easy_card_value")
	public MobileElement easyCardValue;
	
	@FindBy(id="easy_card_pass_type")
	public MobileElement easyCardPassType;
	
	@FindBy(id="easy_card_remove_card_button")
	public MobileElement easyCardRemoveCardButton;
	
	@FindBy(id="easy_card_auto_reload_button")
	public MobileElement easyCardAutoReloadButton;
	
	@FindBy(id="history_title")
	public MobileElement historyTitle;
	
	@FindBy(id="history_date")
	public MobileElement historyDate;
	
	@FindBy(id="history_icon")
	public MobileElement historyIcon;
	
	@FindBy(id="history_action_time")
	public MobileElement historyActionTime;
	
	@FindBy(id="history_location")
	public MobileElement historyLocation;
	
	@FindBy(id="history_pass")
	public MobileElement historyPass;
	
	//Below are objects that appear in the "Add an EASY Card" pop up after clicking the '+' button on the action bar.
	
	@FindBy(id="easy_card_number_entry_instruction")
	public MobileElement easyCardNumberEntryInstruction;
	
	@FindBy(id="easy_card_number_input")
	public MobileElement easyCardNumberInput;
	
	@FindBy(id="easy_card_number_entry_cancel")
	public MobileElement easyCardNumberEntryCancel;
	
	@FindBy(id="easy_card_number_entry_next")
	public MobileElement easyCardNumberEntryNext;

	public EasyCardPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckEasyCardPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoDataTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShortDataTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValidDataTest() {
		// TODO Auto-generated method stub
		
	}

}
