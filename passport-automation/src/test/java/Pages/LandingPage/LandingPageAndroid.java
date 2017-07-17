package Pages.LandingPage;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
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
	
	/*
	@FindBy (className = "//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]")
	public MobileElement termsAndConditionsButton;
	
	@FindBy (className = "//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[2]")
	public MobileElement privacyPolicyButton;
	*/
	

	public LandingPageAndroid(AppiumDriver driver) { super(driver); }

	public void LaunchTest() {
		

	}

	public void ScrollTest() {
		
		
	}

	public void PushNotificationTest() {
		
		
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
/*		menuIcon.click();
		takeScreenshot("menuTestSS");
		List<MobileElement> menuTray = driver.findElements(By.className("android.widget.ListView"));
		String findParking = menuTray.get(2).getText();
		Assert.assertEquals(findParking, "Find Parking");
		
		String helpTitle = menuTray.get(3).getText();
		Assert.assertEquals(helpTitle, "Help");
		
		String sendBugButton = menuTray.get(4).getText();
		Assert.assertEquals(sendBugButton, "Send Bug Report");
		
		String faqButton = menuTray.get(5).getText();
		Assert.assertEquals(faqButton, "FAQ");
		
		String termsButton = menuTray.get(6).getText();
		Assert.assertEquals(termsButton, "Terms & Conditions");
		
		String privButton = menuTray.get(7).getText();
		Assert.assertEquals(privButton, "Privacy Policy");
		
		String loginButton = menuTray.get(7).getText();
		Assert.assertEquals(loginButton, "Login");
		
		welcomeLogo.click();
		takeScreenshot("backToPreviousState");*/
	}


	public void EnterLocationOrPayToParkCodeTest() {
		
	}
	public void clickHelpButton(){
		helpButton.click();
	}
	
	
	public void navigateToFav(){
		takeScreenshot("FavLanding");
		favButton.click();
		
	}
	
	public void navigateToAbout(){
		takeScreenshot("AboutLanding");
		faqButton.click();
		
		
		
		} 

	@Override
	public void clickPayToPark() {
		takeScreenshot("stagingNote");
		payToParkButton.click();
		try{
			declineButton.click();
		}catch (Throwable e) {
		    System.err.println("The staging build thing did not appear");
		}
	}
	
	
}
