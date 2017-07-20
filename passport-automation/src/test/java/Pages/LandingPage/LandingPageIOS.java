package Pages.LandingPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

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
	
	@FindBy(name = "Pay Here")
	private MobileElement payHereButton;
	
	public LandingPageIOS(AppiumDriver driver) {
		super(driver);
	}
	
	public void checkAllowButtonClick() {
		allowButton.isDisplayed();
		allowButton.click();
	}
	
	public void checkDontAllowButtonClick() {
		dontAllowButton.isDisplayed();
		dontAllowButton.click();
	}
	
	public void checkOkButtonClick() {
		okButtonBuddyBuild.isDisplayed();
		okButtonBuddyBuild.click();
	}
	
	public void CheckPayToParkButtonClick() {
		payHereButton.isDisplayed();
		payHereButton.click();
	}

	@Override
	public void LaunchTest() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void PushNotificationTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckLandingPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CheckMenuOptionsForExceptions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EnterLocationOrPayToParkCodeTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickHelpButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clickPayToPark() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToFav() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void navigateToAbout() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void navigateToFindLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SwipeLeftTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SwipeRightTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SwipeDownTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SwipeUpTest() {
		// TODO Auto-generated method stub
		
	}
}
