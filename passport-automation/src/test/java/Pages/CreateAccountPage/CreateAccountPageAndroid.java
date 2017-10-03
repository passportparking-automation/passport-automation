package Pages.CreateAccountPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CreateAccountPageAndroid extends BasePage implements CreateAccountPage{
	
	@FindBy(id="firstNameInput")
	public MobileElement firstNameInput;
	
	@FindBy(id="lastNameInput")
	public MobileElement lastNameInput;
	
	@FindBy(id="emailInput")
	public MobileElement emailInput;
	
	@FindBy(id="passwordInput")
	public MobileElement passwordInput;
	
	@FindBy(id="text_input_password_toggle")
	public MobileElement textInputPasswordToggle;
	
	@FindBy(id="security_question")
	public MobileElement securityQuestion;
	
	@FindBy(id="security_answer")
	public MobileElement securityAnswer;
	
	@FindBy(id="phoneNumberInput")
	public MobileElement phoneNumberInput;
	
	@FindBy(id="zipCodeInput")
	public MobileElement zipCodeInput;
	
	@FindBy(id="registerButton")
	public MobileElement registerButton;

	public CreateAccountPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void CheckCreateAccountPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void AlreadyRegisteredTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BadEmailStringTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WrongPasswordTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SuccessfulAccountCreationTest() {
		// TODO Auto-generated method stub
		
	}

}
