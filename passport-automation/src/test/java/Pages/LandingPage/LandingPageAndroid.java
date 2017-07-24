package Pages.LandingPage;



import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import Pages.BasePage;

public class LandingPageAndroid extends BasePage implements LandingPage {
	@FindBy (id = "welcomeLogoImage")
	public MobileElement welcomeLogo;
	
	@FindBy (id = "messageLabel")
	public MobileElement messageLabel;
	
	@FindBy (id = "goToMapButton")
	public MobileElement goToMapButton;
	
	@FindBy (id = "orLabel")
	public MobileElement orLabel;
	
	@FindBy (id = "payToParkButton")
	public MobileElement payToParkButton;
	
	@FindBy (id = "id_help_layout")
	public MobileElement helpButton;
	
	@FindBy (id = "id_favorites")
	public MobileElement favButton; 
	
	@FindBy (id = "id_about_layout")
	public MobileElement faqButton;
	
	@FindBy (id = "signUpButton")
	public MobileElement signUpButton;
	
	@FindBy (id = "haveAccountLabel")
	public MobileElement haveAccountLabel;
	
	@FindBy (id = "logInButton")
	public MobileElement logInButton;
	
	@FindBy (id="optionsContainer")
	public MobileElement optionsCont;
	
	@FindBy (id ="slidingmenumain")
	public MobileElement mainScreen;
	
	public LandingPageAndroid(AppiumDriver driver) { super(driver); }

	public void LaunchTest() {
		

	}

	public void SwipeLeftTest() {
		takeScreenshot("swipeLeft1");
		mainScreen.swipe(SwipeElementDirection.LEFT, 1, 1, 1000);
		takeScreenshot("swipeLeft2");
	}
	
	public void SwipeRightTest() {
		takeScreenshot("swipeRight1");
		mainScreen.swipe(SwipeElementDirection.RIGHT, 1, 1, 1000);
		takeScreenshot("swipeRight2");
		
	}
	public void SwipeUpTest() {
		takeScreenshot("swipeUp1");
		mainScreen.swipe(SwipeElementDirection.UP, 1, 1, 1000);
		takeScreenshot("swipeUp2");
	
	}
	public void SwipeDownTest() {
		takeScreenshot("swipeDown1");
		mainScreen.swipe(SwipeElementDirection.DOWN, 1, 1, 1000);
		takeScreenshot("swipeDown2");
	
	}


	public void PushNotificationTest() {
		/*
		 * N/A
		 */
	}

	public void CheckLandingPageForExceptions() {
		welcomeLogo.isDisplayed();
		messageLabel.isDisplayed();
		goToMapButton.isDisplayed();
		orLabel.isDisplayed();
		payToParkButton.isDisplayed();
		helpButton.isDisplayed();
		favButton.isDisplayed();
		faqButton.isDisplayed();
		menuIcon.isDisplayed();
		takeScreenshot("CheckLandingPageForExceptions");
	}

	public void CheckMenuOptionsForExceptions() {
		takeScreenshot("menuOptTest");	
		menuIcon.click();
		homeMenuOption.isDisplayed();
		helpMenuOption.isDisplayed();
		findParkingMenuOption.isDisplayed();
		sendBugMenuOption.isDisplayed();
		FAQMenuOption.isDisplayed();
		termsMenuOption.isDisplayed();
		privacyPolicyMenuOption.isDisplayed();
		loginMenuOption.isDisplayed();
		takeScreenshot("menuOptTest2");	
		menuIcon.click();
		takeScreenshot("menuOptTest3");
			
	}


	public void EnterLocationOrPayToParkCodeTest() {
		goToMapButton.click();	
		
	}
	
	
	public void clickHelpButton(){
		helpButton.click();
	}
	
	
	public void navigateToFav(){
		takeScreenshot("FavLanding");
		favButton.click();
		
	}
	
	public void navigateToFindLocation(){
		takeScreenshot("FindLocationLanding");
		goToMapButton.click();		
		} 
	
	public void navigateToAbout(){
		takeScreenshot("AboutLanding");
		faqButton.click();		
		} 
	
	public void clickPayToPark() {
		takeScreenshot("stagingNote");
		try{
			payToParkButton.click();
		}catch (Throwable e) {
		    System.err.println("The payToParkButton did not appaer");
		}
		
		try{
			declineButton.click();
		}catch (Throwable e) {
		    System.err.println("The staging build thing did not appear");
		}
	}
	
	
}
