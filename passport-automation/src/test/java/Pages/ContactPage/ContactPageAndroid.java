package Pages.ContactPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ContactPageAndroid extends BasePage implements ContactPage{
	
	//This is the green call button at the bottom of the dialpad.
	@FindBy(id="dialpad_floating_action_button")
	public MobileElement dialpadFloatingActionButton;
	
	//Phone number container
	@FindBy(id="digits_container")
	public MobileElement digitsContainers;
	
	//The 3 objects within the phone number container are - dialpadOverflow, digits, and deleteButton.
	@FindBy(id="dialpad_overflow")
	public MobileElement dialpadOverflow;
	
	@FindBy(id="digits")
	public MobileElement digits;
	
	@FindBy(id="delete_button")
	public MobileElement deleteButton;
	
	//dialpad buttons
	@FindBy(id="one")
	public MobileElement oneButton;
	
	@FindBy(id="two")
	public MobileElement twoButton;

	@FindBy(id="three")
	public MobileElement threeButton;

	@FindBy(id="four")
	public MobileElement fourButton;

	@FindBy(id="five")
	public MobileElement fiveButton;

	@FindBy(id="six")
	public MobileElement sixButton;

	@FindBy(id="seven")
	public MobileElement sevenButton;

	@FindBy(id="eight")
	public MobileElement eightButton;

	@FindBy(id="nine")
	public MobileElement nineButton;

	@FindBy(id="star")
	public MobileElement starButton;
	
	@FindBy(id="zero")
	public MobileElement zeroButton;

	@FindBy(id="pound")
	public MobileElement poundButton;

	public ContactPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckContactPageForExcpetions() {
		// TODO Auto-generated method stub
		
	}

}
