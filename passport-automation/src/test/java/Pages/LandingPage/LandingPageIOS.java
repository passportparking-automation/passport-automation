package Pages.LandingPage;

import java.util.HashMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.ExcelReading;

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
	
	@FindBy (name = "Payment")
	public  MobileElement paymentMenuOption;
	
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
	
	@FindBy (name = "Vehicles")
	private MobileElement vehiclesMenuOption;
	
	@FindBy (name = "Profile")
	private MobileElement profileMenuOption;
	
	@FindBy (name = "Logout")
	private MobileElement logoutMenuOption;
	
	public LandingPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
	}

	public void clickPayToPark() {
		handlingIosNotificatioPopUp();
		BasePage.sleep(5000);
		payToParkButton.isDisplayed();
		payToParkButton.click();
		
	}

	public void navigateToAbout() {
		handlingIosNotificatioPopUp();
		takeScreenshot("AboutLanding");
		SwipeDownTest();
		faqButton.click();
	}

	public void CheckMenuOptionsForExceptions() {
		handlingIosNotificatioPopUp();
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
		if(!driver.findElements(By.name("Allow")).isEmpty()) {
			BasePage.sleep(6000);
			allowButton.isDisplayed();
			dontAllowButton.isDisplayed();
			allowButton.click();
		}
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
		SwipeDownTest();
		helpButton.click();
		
	}

	public void navigateToFindLocation() {
		handlingIosNotificatioPopUp();
		takeScreenshot("FindLocationLanding");
		goToMapButton.click();
		
	}

	public void navigateToFav() {
		handlingIosNotificatioPopUp();
		takeScreenshot("FavLanding");
		SwipeDownTest();
		favButton.click();
		
	}

	public void logout() {
		SwipeDownTest();
		logoutMenuOption.click();
		
	}

	public void LaunchTest() {
		// TODO Auto-generated method stub
		
	}

	public void PushNotificationTest() {
		// TODO Auto-generated method stub
		
	}

	public void navigateToProfilePage() {
		backButton.click();
		menuIcon.click();
		profileMenuOption.click();
		
	}

	public void navigateToYourCardsPage() {
		backButton.click();
		menuIcon.click();
		paymentMenuOption.click();
		
	}

	public void navigateToVehiclesPage() {
		backButton.click();
		menuIcon.click();
		vehiclesMenuOption.click();
		
	}

	public void login() {
		handlingIosNotificatioPopUp();
		menuIcon.click();
		loginMenuOption.click();
		
	}
}
