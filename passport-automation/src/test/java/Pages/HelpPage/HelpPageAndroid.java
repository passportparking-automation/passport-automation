package Pages.HelpPage;

import static org.testng.Assert.assertTrue;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.FAQPage.FAQPage;
import Pages.FAQPage.FAQPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.SendBugReportPage.SendBugReportPage;
import Pages.SendBugReportPage.SendBugReportPageAndroid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class HelpPageAndroid extends BasePage implements HelpPage {
	
	@FindBy (id = "tutorialCloseButton")
	public MobileElement closeHelpButton;
	
	@FindBy (id = "id_ha_faq")
	public MobileElement faqHelpButton;
	
	@FindBy (id = "id_ha_bug_report")
	public MobileElement sendBugHelpButton;
	
	@FindBy (id = "id_ha_fix_session_button")
	public MobileElement fixItHelpButton;
	
    private FAQPage faqPage = new FAQPageAndroid(driver);
    private SendBugReportPage sendBug = new SendBugReportPageAndroid(driver);
	
	public HelpPageAndroid(AppiumDriver driver) {super(driver); }

	public void CloseHelpTest() {
		takeScreenshot("closeHelpTest");
		closeHelpButton.click();
		
	}
	
	public void HelpNavTest() throws InterruptedException{
		menuIcon.click();
		helpMenuOption.click();
		takeScreenshot("HelpNavTest1");
		//faqHelpButton.click();
		//faqPage.FAQNavTest();
		//takeScreenshot("HelpNavTest2");
		sendBugHelpButton.click();
		sendBug.CheckBugForExceptions();
		takeScreenshot("HelpNavTest3");
		fixItHelpButton.click();
		popUp.isDisplayed();
		takeScreenshot("HelpNavTest4");
		acceptButton.click();
		takeScreenshot("HelpNavTest5");
		Thread.sleep(5000);
		driver.navigate().back();
	}

	public void TutorialSwipeTest() {
		int numberOfSwipesLeft = 10;
		for(int p=0; p<numberOfSwipesLeft; p++){
			takeScreenshot("swipeLeft1"+ System.currentTimeMillis());
			TouchAction swipe = new TouchAction(driver).press(481, 318).waitAction().moveTo(203,337).release();
			swipe.perform();
	        takeScreenshot("swipeLeft2"+System.currentTimeMillis());
		}
		int numberOfSwipesRight = 10;
		for(int p=0; p<numberOfSwipesRight; p++){
			takeScreenshot("swipeRight1"+System.currentTimeMillis());
			TouchAction swipe = new TouchAction(driver).press(38, 459).waitAction().moveTo(463,468).release();
			swipe.perform();
			takeScreenshot("swipeRight2"+System.currentTimeMillis());
			
	}
}
}
