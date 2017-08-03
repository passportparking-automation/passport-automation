package Pages.MobileVerPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.SendBugReportPage.SendBugReportPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MobileVerPageAndroid  extends BasePage implements MobileVerPage {
	@FindBy (id = "prefixSpinner")
	public MobileElement prefixInputDD;
	
	@FindBy(id = "phoneTextBox")
	MobileElement phoneTextBox;
	
	@FindBy(id = "id_mvw_text_button")
	MobileElement textButton;
	
	@FindBy(id = "id_mvw_call_button")
	MobileElement callButton;
	
	@FindBy(xpath = "//android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.TextView[3]")
	MobileElement paragraph;
	
	@FindBy(id = "backImageView")
	MobileElement backButton;
	
	public MobileVerPageAndroid(AppiumDriver driver) {super(driver);}

	public void CheckMobileVerPageForExceptions() {
		prefixInputDD.isDisplayed();
		phoneTextBox.isDisplayed();
		textButton.isDisplayed();
		callButton.isDisplayed();
		backButton.isDisplayed();
		takeScreenshot("MobileVer1"); 
	}
	public void NavBackToLoginTest() {
		backButton.click();
		takeScreenshot("MobileVaToLogin");
	}
	public void BlankNumberProvidedTest() {
		callButton.click();
		popUp.isDisplayed();
		takeScreenshot("blank1");
		acceptButton.click();
		callButton.isDisplayed();
		takeScreenshot("blank2");
	}
	public void ShortNumberProivdedTest() {
		phoneTextBox.sendKeys("281330");
		takeScreenshot("short2");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		textButton.click();
		popUp.isDisplayed();
		takeScreenshot("short1");
		acceptButton.click();
		textButton.isDisplayed();
		
	}
	public void ValidMobileTest() {
		phoneTextBox.sendKeys("5550000000");
		takeScreenshot("valid2");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		textButton.click();
		popUp.isDisplayed();
		takeScreenshot("valid1");
		acceptButton.click();
	}
	public void ForceQuitTest() {
		// NA
	}

	public void navToLanding() {
		driver.navigate().back();
		driver.navigate().back();
	}


}