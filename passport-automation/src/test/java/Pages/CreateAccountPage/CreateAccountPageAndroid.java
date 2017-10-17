package Pages.CreateAccountPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

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

	public void CheckCreateAccountPageForExceptions() {
		firstNameInput.isDisplayed();
		lastNameInput.isDisplayed();
		emailInput.isDisplayed();
		passwordInput.isDisplayed();
		textInputPasswordToggle.isDisplayed();
		securityQuestion.isDisplayed();
		securityAnswer.isDisplayed();
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
		int offset = 1;
		int y = driver.manage().window().getSize().getHeight();
		int x = driver.manage().window().getSize().getWidth();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release();     
		touchAction.perform();
		phoneNumberInput.isDisplayed();
		zipCodeInput.isDisplayed();
		registerButton.isDisplayed();
		takeScreenshot("ScreenShot"+System.currentTimeMillis());
		driver.navigate().back();
	}
	public void AlreadyRegisteredTest() {
		emailInput.sendKeys("jkoch@quilmont.com");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		passwordInput.sendKeys("Password123!");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		int offset = 1;
		int y = driver.manage().window().getSize().getHeight();
		int x = driver.manage().window().getSize().getWidth();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release();     
		touchAction.perform();
		registerButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		driver.navigate().back();
		
	}

	public void BadEmailStringTest() {
		emailInput.sendKeys("jkochquilmontcom");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		passwordInput.sendKeys("Password123!");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		int offset = 1;
		int y = driver.manage().window().getSize().getHeight();
		int x = driver.manage().window().getSize().getWidth();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release();     
		touchAction.perform();
		registerButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		driver.navigate().back();
		
	}

	public void WrongPasswordTest() {
		emailInput.sendKeys("jh1@quilmont.com");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		passwordInput.sendKeys("123!");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		int offset = 1;
		int y = driver.manage().window().getSize().getHeight();
		int x = driver.manage().window().getSize().getWidth();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release();     
		touchAction.perform();
		registerButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		driver.navigate().back();
		
	}

	public void SuccessfulAccountCreationTest() {
		emailInput.sendKeys("jakel@quilmont.com");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		passwordInput.sendKeys("Password123!");
		try {
			driver.hideKeyboard();
		}
		catch (Exception e){
		}
		
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		int offset = 1;
		int y = driver.manage().window().getSize().getHeight();
		int x = driver.manage().window().getSize().getWidth();
		TouchAction touchAction = new TouchAction(driver);
		touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release();     
		touchAction.perform();
		registerButton.click();
		inputErrorMessage.isDisplayed();
		takeScreenshot("Screenshot"+System.currentTimeMillis());
		driver.navigate().back();
		
	}

}
