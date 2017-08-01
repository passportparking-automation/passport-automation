package Pages.LandingPage;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import Pages.BasePage;
import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;

public class LandingPageAndroid extends BasePage implements LandingPage {
	@FindBy(id = "welcomeLogoImage")
	public MobileElement welcomeLogo;

	@FindBy(id = "messageLabel")
	public MobileElement messageLabel;

	@FindBy(id = "goToMapButton")
	public MobileElement goToMapButton;

	@FindBy(id = "orLabel")
	public MobileElement orLabel;

	@FindBy(id = "payToParkButton")
	public MobileElement payToParkButton;

	@FindBy(id = "id_help_layout")
	public MobileElement helpButton;

	@FindBy(id = "id_favorites")
	public MobileElement favButton;

	@FindBy(id = "id_about_layout")
	public MobileElement faqButton;

	@FindBy(id = "signUpButton")
	public MobileElement signUpButton;

	@FindBy(id = "haveAccountLabel")
	public MobileElement haveAccountLabel;

	@FindBy(id = "logInButton")
	public MobileElement logInButton;

	@FindBy(id = "optionsContainer")
	public MobileElement optionsCont;

	@FindBy(id = "slidingmenumain")
	public MobileElement mainScreen;
	
	@FindBy(id = "overlay_header")
	public MobileElement sessionOverlayHeader;
	
	
	private LoginPage loginPage = new LoginPageAndroid(driver);
	private MobileVerPage mobVerPage = new MobileVerPageAndroid(driver);
	private CodeVerificationPage codeVerPage = new CodeVerificationPageAndroid(driver);
	private PINPage pinPage  = new PINPageAndroid(driver);

	public LandingPageAndroid(AppiumDriver driver) { super(driver);}

	public void LaunchTest() {
		// all do this
	}
	public void SwipeLeftTest() {

	}
	public void SwipeRightTest() {
		
	}
	public void SwipeDownTest() {
        int offset = 1;
        int y = driver.manage().window().getSize().getHeight();
        int x = driver.manage().window().getSize().getWidth();
        TouchAction touchAction = new TouchAction(driver);
        System.out.println(x + " " + y);
        touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release().perform();
	
	}
	public void SwipeUpTest() {
	
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

	public void clickHelpButton() {
		helpButton.click();
	}

	public void navigateToFav() {
		takeScreenshot("FavLanding");
		favButton.click();

	}

	public void navigateToFindLocation() {
		takeScreenshot("FindLocationLanding");
		goToMapButton.click();
	}

	public void navigateToAbout() {
		takeScreenshot("AboutLanding");
		faqButton.click();
	}
	
	public void hideOverlay() {
		try{
			if(sessionOverlayHeader.isDisplayed()){
				//Click on any part of the screen
				TouchAction a2 = new TouchAction(driver);
				a2.tap (779, 1236).perform();
				menuImage.click();
				homeMenuOption.click();
			}
		}
			catch (Exception E){
				System.out.println("Hide overlay was not performed");
			}
			
		}
	
	
	public void navigateToLogin() {
		menuIcon.click();
		loginMenuOption.click();
		//staging popup check
		try {
			declineButton.click();
		} catch (Throwable e) {
			System.err.println("The staging build message did not appear");
		}
		
		try {
			logInButton.click();
			//check if there are terms and conditions
			try {
				acceptButton.click();
			} catch (Exception e) {
				System.out.println("Terms message did not appear");
			}
			mobVerPage.ValidMobileTest();
			codeVerPage.SendCorrectCodeTest();
			pinPage.SendCorrectPINTest();
			
		} catch (Throwable e) {
			System.err.println("need to send pin");
			pinPage.SendCorrectPINTest();
		}
	}
	
	
	
	public void logout() { 
		menuIcon.click();
		logoutMenuOption.click();	
	}
	
	public void navigateToProfilePage() {
		menuIcon.click();
		profileMenuOption.click();
	}
	
	public void navigateToYourCardsPage() {
		menuIcon.click();
		paymentMenuOption.click();
	}
	public void navigateToVehiclesPage() {
		menuIcon.click();
		vehiclesMenuOption.click();
	}

	public void clickPayToPark() {
		takeScreenshot("stagingNote");
		try {
			payToParkButton.click();
		} catch (Throwable e) {
			System.err.println("The payToParkButton did not appaer");
		}

		try {
			declineButton.click();
		} catch (Throwable e) {
			System.err.println("The staging build message did not appear");
		}
	}

}
