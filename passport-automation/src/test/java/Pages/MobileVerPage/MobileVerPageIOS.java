package Pages.MobileVerPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;
import Pages.ExcelReading;

public class MobileVerPageIOS extends BasePage implements MobileVerPage {

	@FindBy(name = "phoneTextBox")
	MobileElement phoneTextBox;
	
	@FindBy(name = "Text Me")
	MobileElement textButton;
	
	@FindBy(name = "Call Me")
	MobileElement callButton;
	
	@FindBy(name = "Your phone number will be the means by which you register for ParkRight. We use your phone number to identify you in our system, so we just need to verify your phone number by sending a 3 digit code to you via text or call.")
	MobileElement paragraph;
	
	@FindBy(name = "back")
	MobileElement backButton;
	
	@FindBy(name = "menuicon")
	MobileElement menuButton;
	
	@FindBy(name = "Home")
	MobileElement homeMenuOption;
	
	@FindBy(name = "Yes")
	MobileElement yesButton;
	
	@FindBy(name = "Ok")
	MobileElement okButton;
	
	@FindBy(name = "No")
	MobileElement noButton;
	
	@FindBy(name = "Pay to Park")
	private MobileElement payToParkButton;
	
	@FindBy(id="Login")
	public MobileElement logInButton;
	
	public MobileVerPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
	}

	public void CheckMobileVerPageForExceptions() {
		phoneTextBox.isDisplayed();
		textButton.isDisplayed();
		callButton.isDisplayed();
		backButton.isDisplayed();
		takeScreenshot("MobileVer1");		
	}

	public void NavBackToLoginTest() {
		backButton.click();
		takeScreenshot("MobileVaToLogin");
		
	}

	public void BlankNumberProvidedTest() {
		callButton.click();
		takeScreenshot("blank1");
		okButton.click();
		callButton.isDisplayed();
		takeScreenshot("blank2");
		
	}

	public void ShortNumberProivdedTest() {
		phoneTextBox.sendKeys("5465846");
		takeScreenshot("short2");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		textButton.click();
		takeScreenshot("short1");
		okButton.click();
		textButton.isDisplayed();
		
	}

	public void ValidMobileTest(String mobileNumber) {
		phoneTextBox.sendKeys(mobileNumber);
		textButton.click();
		yesButton.click();

	}

	public void ForceQuitTest() {
		// TODO Auto-generated method stub
		
	}

	public void navToLanding() {
		backButton.click();
		menuButton.click();
		homeMenuOption.click();
	}

}
