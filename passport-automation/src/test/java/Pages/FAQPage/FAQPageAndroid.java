package Pages.FAQPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FAQPageAndroid extends BasePage implements FAQPage {
	@FindBy(id="viewHeader")
	public MobileElement pageHeader;
	
	public FAQPageAndroid(AppiumDriver driver) {  super(driver);  }

	public void FAQNavTest(){
		pageHeader.isDisplayed();
		takeScreenshot("faqNavTest");
		backButton.click();
	}
}
