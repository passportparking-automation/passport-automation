package Pages.ManageEasyCardPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ManageEasyCardPageAndroid extends BasePage implements ManageEasyCardPage {
	
	//wubababd
	
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

	public ManageEasyCardPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckManageEasyCardPageForExcpetions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddEasyCardNoDataTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddEasyCardShortDataTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AddEasyCardValidDataTest() {
		// TODO Auto-generated method stub
		
	}

}
