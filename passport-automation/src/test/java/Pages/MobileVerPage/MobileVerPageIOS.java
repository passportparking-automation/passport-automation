package Pages.MobileVerPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class MobileVerPageIOS extends BasePage implements MobileVerPage {

	@FindBy(name = "phoneNumberInput")
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
	
	@FindBy(name = "Ok")
	MobileElement okButton;
	
	@FindBy(name = "No")
	MobileElement noButton;
	
	@FindBy(name = "Pay to Park")
	private MobileElement payToParkButton;
	
	@FindBy(id="Login")
	public MobileElement logInButton;
	
	public MobileVerPageIOS(AppiumDriver driver) {
		super(driver);
	}

	public void CheckMobileVerPageForExceptions() {

		backButton.click();
		BasePage.sleep(4000);
		menuButton.click();
		homeMenuOption.click();
		payToParkButton.click();
		logInButton.click();
		takeScreenshot("MobileVer1");
		String actualphoneTextBox = phoneTextBox.getAttribute("value");
		String expectedphoneTextBox = "Phone number";
		if(expectedphoneTextBox.equals(actualphoneTextBox)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		textButton.isDisplayed();
		callButton.isDisplayed();
		
		String actualParagraph = paragraph.getText();
		String expectedParagraph = "Your phone number will be the means by which you register for ParkRight. We use your phone number to identify you in our system, so we just need to verify your phone number by sending a 3 digit code to you via text or call.";
		if(expectedParagraph.equals(actualParagraph)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		phoneTextBox.sendKeys("282436");
		backButton.isDisplayed();
		backButton.click();
		BasePage.sleep(4000);
		menuButton.click();
		homeMenuOption.click();
		
	}

	public void NavBackToLoginTest() {
		backButton.click();
		takeScreenshot("MobileVaToLogin");
		
	}

	public void BlankNumberProvidedTest() {
		callButton.click();
		popUp.isDisplayed();
		takeScreenshot("blank1");
		acceptButton.click();
		callButton.isDisplayed();
		takeScreenshot("blank2");
		
	}

	public void ShortNumberProivdedTest() {
		phoneTextBox.sendKeys("28246");
		takeScreenshot("short2");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		textButton.click();
		popUp.isDisplayed();
		takeScreenshot("short1");
		acceptButton.click();
		textButton.isDisplayed();
		
	}

	public void ValidMobileTest() {
		phoneTextBox.sendKeys("5550000000");
		textButton.click();
		okButton.click();

	}

	public void ForceQuitTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navToLanding() {
		// TODO Auto-generated method stub
		
	}

}
