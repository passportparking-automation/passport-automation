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
	
	@FindBy(id="security_question_layout")
	public MobileElement securityQuestionField;
	
	@FindBy(id="security_answer_field")
	public MobileElement securityAnswerField;
	
	@FindBy(id="send_email_button")
	public MobileElement sendEmailButton;
	
	@FindBy(id="security_answer_instructions")
	public MobileElement secAnswerFieldDesc;

	public ForgotPasswordPageAndroid(AppiumDriver driver) {super(driver);}

	public void NoDataTest() {
		nextButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		driver.navigate().back();
	
	}

	public void BadEmailTest() {
		//userEmailField.clear();
		userEmailField.sendKeys("jk1@quilmont");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		nextButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		driver.navigate().back();
	}

	public void NonvalidEmailTest() {
		//userEmailField.clear();
		userEmailField.sendKeys("jakel@quilmont.com");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		nextButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		driver.navigate().back();
	}

	public void CheckSecurityQuestionsForExcpetions() {
		userEmailField.sendKeys("jkoch@quilmont.com");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		nextButton.click();
		secAnswerFieldDesc.isDisplayed();
		securityQuestionField.isDisplayed();
		securityAnswerField.isDisplayed();
		sendEmailButton.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
	}

	public void NoAnswerTest() {
		sendEmailButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		
	}

	public void WrongAnswerTest() {
		securityAnswerField.sendKeys("wrong answer");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		sendEmailButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
	}


	public void CorrectAnswerTest() {
		securityAnswerField.sendKeys( "Opera");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		sendEmailButton.click();
		//popUp.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		
	}

}
