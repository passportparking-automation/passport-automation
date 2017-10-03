package Pages.ForgotPasswordPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ForgotPasswordPageAndroid extends BasePage implements ForgotPasswordPage{
	
	@FindBy(id="username_field")
	public MobileElement userEmailField;
	
	@FindBy(id="next_button")
	public MobileElement nextButton;
	
	@FindBy(id="security_question_field")
	public MobileElement securityQuestionField;
	
	@FindBy(id="security_answer_field")
	public MobileElement securityAnswerField;
	
	@FindBy(id="send_email_button")
	public MobileElement sendEmailButton;

	public ForgotPasswordPageAndroid(AppiumDriver driver) {super(driver);}

	@Override
	public void NoDataTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BadEmailTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NonvalidEmailTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckSecurityQuestionsForExcpetions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NoAnswerTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WrongAnswerTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CorrectAnswerTest() {
		// TODO Auto-generated method stub
		
	}

}
