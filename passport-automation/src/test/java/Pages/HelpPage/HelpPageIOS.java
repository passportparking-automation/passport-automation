package Pages.HelpPage;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import Pages.BasePage;
import Pages.FAQPage.FAQPage;
import Pages.FAQPage.FAQPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageIOS;
import Pages.SendBugReportPage.SendBugReportPage;
import Pages.SendBugReportPage.SendBugReportPageIOS;

public class HelpPageIOS extends BasePage implements HelpPage {

	@FindBy(name = "Close")
	private MobileElement closeHelpButton;
	
	@FindBy (name = "Help")
	public  MobileElement helpMenuOption;
	
	@FindBy (name = "back")
	public MobileElement backButton;
	
	@FindBy(name = "faqButton")
	private MobileElement faqHelpButton;
	
	@FindBy (name = "menuicon")
	public MobileElement menuIcon;
	
	@FindBy(name = "sendBugReportButton")
	private MobileElement sendBugHelpButton;
	
	@FindBy(name = "Home")
	private MobileElement homeMenuOption;
	
    private FAQPage faqPage = new FAQPageIOS(driver);
    private SendBugReportPage sendBug = new SendBugReportPageIOS(driver);
    private LandingPage landingPage = new LandingPageIOS(driver);
	
	public HelpPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
	}

	public void CloseHelpTest() {
		takeScreenshot("closeHelpTest");
		closeHelpButton.click();
	}

	public void TutorialSwipeTest() {
		int numberOfSwipesLeft = 10;
		for(int p=0; p<numberOfSwipesLeft; p++){
			takeScreenshot("swipeLeft1"+ System.currentTimeMillis());
			landingPage.SwipeLeftTest();
	        takeScreenshot("swipeLeft2"+System.currentTimeMillis());
		}
		int numberOfSwipesRight = 10;
		for(int p=0; p<numberOfSwipesRight; p++){
			takeScreenshot("swipeRight1"+System.currentTimeMillis());
			landingPage.SwipeRightTest();
			takeScreenshot("swipeRight2"+System.currentTimeMillis());
			
	}
		
	}

	public void HelpNavTest() throws InterruptedException {
		handlingIosNotificatioPopUp();
		landingPage.SwipeDownTest();
		menuIcon.click();
		helpMenuOption.click();
		takeScreenshot("HelpNavTest1");
		//faqHelpButton.click();
		//faqPage.FAQNavTest();
		//takeScreenshot("HelpNavTest2");
		BasePage.sleep(3000);
		sendBugHelpButton.click();
		sendBug.CheckBugForExceptions();
		takeScreenshot("HelpNavTest3");
		Thread.sleep(5000);
		backButton.click();
		
	}

}
