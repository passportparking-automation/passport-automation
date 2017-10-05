package Pages.ChangePhoneNumberPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ChangePhoneNumberPageAndroid extends BasePage implements ChangePhoneNumberPage{

	@FindBy(id="existing_phone_field")
	public MobileElement existingPhoneField;
	
	@FindBy(id="new_phone_field")
	public MobileElement newPhoneField;
	
	@FindBy(id="change_number_password_instructions")
	public MobileElement changeNumberPasswordInstructions;
	
	@FindBy(id="account_security_password")
	public MobileElement accountSecurityPassword;
	
	@FindBy(id="update_phone_number_button")
	public MobileElement updatePhoneNumberButton;
	
	@FindBy(id="text_input_password_toggle")
	public MobileElement textInputPasswordToggle;
	
	
	
	public ChangePhoneNumberPageAndroid(AppiumDriver driver) {super(driver);
	}

	@Override
	public void CheckChangePhoneNumberPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoDataTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InvalidNumberNoPasswordTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InvalidNumberInvalidPasswordTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InvalidNumberValidPasswordTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValidNumberInvalidPasswordTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValidNumberValidPasswordTest() {
		// TODO Auto-generated method stub
		
	}

}
