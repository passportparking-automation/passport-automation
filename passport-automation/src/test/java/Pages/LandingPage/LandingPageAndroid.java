package Pages.LandingPage;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
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
	
	@FindBy(id="id_poweredbypassport")
	public MobileElement powerdByLogo;
	
	
	public LandingPageAndroid(AppiumDriver driver) { super(driver);}

	public void LaunchTest() {
		// all do this
	}
	//From Right to Left
	public void SwipeLeftTest() {
		takeScreenshot("swipeLeft1");
		TouchAction swipe = new TouchAction(driver).press(481, 318).waitAction().moveTo(203,337).release();
		swipe.perform();
        takeScreenshot("swipeLeft2");
	}
	//Left to Right
	public void SwipeRightTest() {
		takeScreenshot("swipeRight1");
		TouchAction swipe = new TouchAction(driver).press(38, 459).waitAction().moveTo(463,468).release();
		swipe.perform();
		takeScreenshot("swipeRight2");
	}
	public void SwipeUpTest() {
		takeScreenshot("swipeUp1");
		TouchAction swipe = new TouchAction(driver).press(289, 93).waitAction().moveTo(320,707).release();
		swipe.perform();
		takeScreenshot("swipeUp2");
	
	}
	public void SwipeDownTest() {
		takeScreenshot("swipeDown1");
		int offset = 1;
        int y = driver.manage().window().getSize().getHeight();
        int x = driver.manage().window().getSize().getWidth();
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press(x / 2, y - offset).moveTo(0, -(y - (2 * offset))).release();
        touchAction.perform();
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
		
		takeScreenshot("CheckLandingPageForExceptions1");
		takeScreenshot("swipeDown1"+System.currentTimeMillis());
        Dimension size = driver.manage().window().getSize();
        int starty = (int) (size.height * 0.80);
        //Finding endy coordinate which is at top side of screen.
        int endy = (int) (size.height * 0.30);
        //Find horizontal point where you wants to swipe. It is in middle of screen width.
        int startx = size.width / 2;
        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

        TouchAction swipe = new TouchAction(driver).press(startx, starty).waitAction().moveTo(startx,endy).release();
        swipe.perform();
        takeScreenshot("swipeDown2"+System.currentTimeMillis());
        
		powerdByLogo.isDisplayed();
	
	}

	public void CheckMenuOptionsForExceptions() {
		takeScreenshot("menuOptTest");
		menuIcon.click();
		homeMenuOption.isDisplayed();
		helpMenuOption.isDisplayed();
		findParkingMenuOption.isDisplayed();
		sendBugMenuOption.isDisplayed();
		FAQMenuOption.isDisplayed();
		//termsMenuOption.isDisplayed();
		//privacyPolicyMenuOption.isDisplayed();
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
	

	public void logout() { 		
		 menuIcon.click();
	        
	        takeScreenshot("swipeDown1"+System.currentTimeMillis());
	        Dimension size = driver.manage().window().getSize();
	        int starty = (int) (size.height * 0.80);
	        //Finding endy coordinate which is at top side of screen.
	        int endy = (int) (size.height * 0.30);
	        //Find horizontal point where you wants to swipe. It is in middle of screen width.
	        int startx = size.width / 2;
	        System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);

	        TouchAction swipe = new TouchAction(driver).press(startx, starty).waitAction().moveTo(startx,endy).release();
	        swipe.perform();
	        takeScreenshot("swipeDown2"+System.currentTimeMillis());
	        //logoutMenuOption.click();    
	        
	        profileMenuOption.click();
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
