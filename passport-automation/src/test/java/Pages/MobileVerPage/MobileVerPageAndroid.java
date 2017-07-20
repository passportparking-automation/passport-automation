package Pages.MobileVerPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.SendBugReportPage.SendBugReportPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class MobileVerPageAndroid  extends BasePage implements MobileVerPage {

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

	@Override
	public void CheckMobileVerPageForExceptions() {
		takeScreenshot("MobileVer1");
		String actualphoneTextBox = phoneTextBox.getText();
		String expectedphoneTextBox = "Phone number";
		if(expectedphoneTextBox.equals(actualphoneTextBox)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		textButton.isDisplayed();
		callButton.isDisplayed();
		
		String actualParagraph = paragraph.getText();
		String expectedParagraph = "Your phone number will be the means by which you register for ParkRight. We use your phone number to identify you in our system, so we just need to verify your phone number by sending a 3 digit code to you via text or call.";
		if(expectedParagraph.equals(actualParagraph)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		backButton.isDisplayed();
	}

	@Override
	public void NavBackToLoginTest() {
	backButton.click();
	takeScreenshot("MobileVaToLogin");
		
	}

	@Override
	public void BlankNumberProvidedTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ShortNumberProivdedTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValidMobileTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ForceQuitTest() {
		// TODO Auto-generated method stub
		
	}


}