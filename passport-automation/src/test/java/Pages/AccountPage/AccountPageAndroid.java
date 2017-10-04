package Pages.AccountPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AccountPageAndroid extends BasePage implements AccountPage {
	
	@FindBy(id="accountName")
	public MobileElement accountName;
	
	@FindBy(id="accountEmail")
	public MobileElement accountEmail;
	
	@FindBy(id="accountPhone")
	public MobileElement accountPhone;
	
	/*
	 * These are the ID names for the icons and titles contained inside the buttons.
	 *
	@FindBy(id="menuItemTitle")
	public MobileElement menuItemTitle;
	
	@FindBy(id="menuItemIcon")
	public MobileElement menuItemIcon;
	*/
	

	public AccountPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void AccountPageNavTest() {
		// TODO Auto-generated method stub
		
	}

}
