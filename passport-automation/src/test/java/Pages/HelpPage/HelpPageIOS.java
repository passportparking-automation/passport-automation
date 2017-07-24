package Pages.HelpPage;

import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;
import Pages.FAQPage.FAQPage;
import Pages.FAQPage.FAQPageIOS;
import Pages.SendBugReportPage.SendBugReportPage;
import Pages.SendBugReportPage.SendBugReportPageIOS;

public class HelpPageIOS extends BasePage implements HelpPage {

	@FindBy(name = "Close")
	private MobileElement closeHelpButton;
	
	@FindBy (xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[3]/XCUIElementTypeTable[1]/XCUIElementTypeCell[3]/XCUIElementTypeStaticText[1]")
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
	
	public HelpPageIOS(AppiumDriver driver) {
		super(driver);
	}

	public void CloseHelpTest() {
		takeScreenshot("closeHelpTest");
		closeHelpButton.click();
	}

	public void TutorialSwipeTest() {
		// TODO Auto-generated method stub
		
	}

	public void HelpNavTest() throws InterruptedException {
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
