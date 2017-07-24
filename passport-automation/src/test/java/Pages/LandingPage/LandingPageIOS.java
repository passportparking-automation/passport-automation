package Pages.LandingPage;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class LandingPageIOS extends BasePage implements LandingPage {

	@FindBy(name = "Don’t Allow")
	private MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private MobileElement allowButton;
	
	@FindBy(name = "OK")
	private MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private MobileElement okButtonBuddyBuild;
	
	@FindBy(name = "Pay to Park")
	private MobileElement payToParkButton;
	
	@FindBy (name = "Help")
	public  MobileElement helpMenuOption;
	
	@FindBy (name = "Find Parking")
	public  MobileElement findParkingMenuOption;
	
	@FindBy (name = "Send Bug Report")
	public  MobileElement sendBugMenuOption;
	
	@FindBy (name = "FAQ")
	public  MobileElement FAQMenuOption;
	
	@FindBy (name = "Terms & Conditions")
	public  MobileElement termsMenuOption;
	
	@FindBy (name = "Privacy Policy")
	public  MobileElement privacyPolicyMenuOption;
	
	@FindBy (name = "Login")
	public  MobileElement loginMenuOption;
	
	@FindBy (name = "whitelabels/12_parkright/images/welcomelogo.png")
	public  MobileElement welcomeLogo;
	
	@FindBy (name = "The Parking App for London")
	public  MobileElement messageLabel;
	
	@FindBy (name = "Search by Street, Place or Location Number")
	public  MobileElement goToMapButton;
	
	@FindBy (name = "OR")
	public  MobileElement orLabel;
	
	@FindBy (name = "Help")
	public  MobileElement helpButton;
	
	@FindBy (name = "Home")
	public  MobileElement homeMenuOption;
	
	@FindBy (name = "Favourites")
	public  MobileElement favButton;	
	
	@FindBy (name = "FAQ")
	public  MobileElement faqButton;
	
	@FindBy (name = "menuicon")
	public MobileElement menuIcon;
	
	@FindBy (name = "back")
	private MobileElement backButton;
	
	public LandingPageIOS(AppiumDriver driver) {
		super(driver);
	}

	public void clickPayToPark() {
		payToParkButton.isDisplayed();
		payToParkButton.click();
		
	}

	public void navigateToAbout() {
		takeScreenshot("AboutLanding");
		faqButton.click();
	}

	public void CheckMenuOptionsForExceptions() {
		if(!driver.findElements(By.name("OK")).isEmpty()) {
			BasePage.sleep(6000);
			OkButtonNotification.isDisplayed();
			dontAllowButton.isDisplayed();
			OkButtonNotification.click();
		} else {
			allowButton.isDisplayed();
			dontAllowButton.isDisplayed();
			allowButton.click();
		}
		okButtonBuddyBuild.isDisplayed();
		okButtonBuddyBuild.click();
		takeScreenshot("menuOptTest");
		menuIcon.click();
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

	public void CheckLandingPageForExceptions() {
		/*welcomeLogo.isDisplayed();
		messageLabel.isDisplayed();*/
		goToMapButton.isDisplayed();
		orLabel.isDisplayed();
		payToParkButton.isDisplayed();
		helpButton.isDisplayed();
		favButton.isDisplayed();
		faqButton.isDisplayed();
		menuIcon.isDisplayed();
		takeScreenshot("CheckLandingPageForExceptions");
		
	}

	public void EnterLocationOrPayToParkCodeTest() {
		goToMapButton.click();
		backButton.isDisplayed();
		
	}
	
	public void SwipeLeftTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> swipeObject = new HashMap<String, String>();
		swipeObject.put("direction", "left");
		js.executeScript("mobile: swipe", swipeObject);
		BasePage.sleep(3000);
		homeMenuOption.click();
		
	}
	
	public void SwipeRightTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> swipeObject = new HashMap<String, String>();
		swipeObject.put("direction", "right");
		js.executeScript("mobile: swipe", swipeObject);	
	}
	
	public void SwipeDownTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> swipeObject = new HashMap<String, String>();
		swipeObject.put("direction", "down");
		js.executeScript("mobile: swipe", swipeObject);	
	}
	
	public void SwipeUpTest() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> swipeObject = new HashMap<String, String>();
		swipeObject.put("direction", "up");
		js.executeScript("mobile: swipe", swipeObject);	
	}

	public void clickHelpButton() {
		helpButton.click();
		
	}

	public void navigateToFindLocation() {
		takeScreenshot("FindLocationLanding");
		goToMapButton.click();
		
	}

	public void navigateToFav() {
		menuIcon.click();
		homeMenuOption.click();
		takeScreenshot("FavLanding");
		favButton.click();
		
	}

	@Override
	public void LaunchTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void PushNotificationTest() {
		// TODO Auto-generated method stub
		
	}
}
