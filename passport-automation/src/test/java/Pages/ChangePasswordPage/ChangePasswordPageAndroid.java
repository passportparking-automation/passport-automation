package Pages.ChangePasswordPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ChangePasswordPageAndroid extends BasePage implements ChangePasswordPage{

	@FindBy(id="current_password_field")
	public MobileElement currentPasswordField;
	
	@FindBy(id="new_password_field")
	public MobileElement newPasswordField;
	
	@FindBy(id="update_password_button")
	public MobileElement updatePasswordButton;
	
	@FindBy(id="text_input_password_toggle")
	public MobileElement textInputPasswordToggle;
	
	public ChangePasswordPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckChangePasswordPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoDataTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InvlaidNewNoCurrentTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InvlaidNewInvalidOldTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InvlaidNewInvalidNewTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValidNewInvalidOldTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValidNewValidOldTest() {
		// TODO Auto-generated method stub
		
	}

}
