package Pages.HelpPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HelpPageAndroid extends BasePage implements HelpPage {
	
	@FindBy (id = "tutorialCloseButton")
	public MobileElement closeHelpButton;
	
	@FindBy (xpath = "	//android.widget.RelativeLayout[1]/android.view.View[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.TextView[2]")
	public MobileElement helpMenu;
	
    private LandingPage landingPage = new LandingPageAndroid(driver);
	
	
	public HelpPageAndroid(AppiumDriver driver) {super(driver); }

	public void CloseHelpTest() {
		closeHelpButton.click();
		
	}


	public void MenuTrayHelpNavTest() {
		menuIcon.click();
		menuTray.isDisplayed();
		sendBugMenuOption.click();
		WebElement pageHeader = driver.findElement(By.id("viewHeader"));
		String actualHeader = pageHeader.getText();
		String expectedHeader = "Send Report";
		// System.out.println("Actual Value is: " + actualFAQHeader);
		if (expectedHeader.equals(actualHeader)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		menuImage.click();
		menuTray.isDisplayed();
		FAQMenuOption.click();
		pageHeader =   driver.findElement(By.id("viewHeader"));
		String actualFAQHeader = pageHeader.getText();
		String expectedFAQHeader = "FAQ";
		//System.out.println("Actual Value is: " + actualFAQHeader);
		if(expectedFAQHeader.equals(actualFAQHeader)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		menuImage.click();
		menuTray.isDisplayed();
		termsMenuOption.click();
		
		pageHeader = driver.findElement(By.id("viewHeader"));
		actualHeader = pageHeader.getText();
		expectedHeader = "Terms and Conditions";
		// System.out.println("Actual Value is: " + actualFAQHeader);
		if (expectedHeader.equals(actualHeader)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		menuImage.click();
		menuTray.isDisplayed();
		privacyPolicyMenuOption.click();
		
		pageHeader = driver.findElement(By.id("viewHeader"));
		actualHeader = pageHeader.getText();
		expectedHeader = "Privacy Policy";
		// System.out.println("Actual Value is: " + actualFAQHeader);
		if (expectedHeader.equals(actualHeader)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		menuImage.click();
		menuTray.isDisplayed();
		
		homeOption.click();
		landingPage.CheckLandingPageForExceptions();
		

		
	}
	
	



}
