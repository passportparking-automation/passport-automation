package Pages.LengthOfStayPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class LengthOfStayPageAndroid extends BasePage implements LengthOfStayPage {

	@FindBy (id="durationHeader")
	public MobileElement durationMessage;
	
	@FindBy (id = "shortcutButton_1")
	public MobileElement maxStayButton;
	
	@FindBy (id = "id_titlebar_back_button")
	public MobileElement backButton;
	
	@FindBy (id = "shortcutButton_2")
	public MobileElement chooseStayButton;
	
	@FindBy (id ="spinner_up_button")
	public MobileElement hourSpinnerUp;
	
	@FindBy (id ="durationText")
	public MobileElement durationText;
	
	@FindBy (id="duration_next_btn")
	public MobileElement nextButton;
	
	public LengthOfStayPageAndroid(AppiumDriver driver) {super(driver);}
	
	public void clickMaxStayButton() {
		maxStayButton.click();
		takeScreenshot("lengthOfStay2");
	}
	public void CheckLOSForExceptions(){
		durationMessage.isDisplayed();
		maxStayButton.isDisplayed();
		chooseStayButton.click();
		
		int numOfClicks = 5;
		for (int i = 0; numOfClicks > i ;i++){
			hourSpinnerUp.click();
			takeScreenshot("maxHRs"+i );
		}
		String actualTermsTitle = durationText.getText();
		String expectedTermsTitle = "4 hours";
		if(expectedTermsTitle.equals(actualTermsTitle)){
			assertTrue(true);
		}else{
			assertTrue(false);
		}
		nextButton.click();
	}

	
	
	public void clickBackButton() {
		BasePage.sleep(4000);
		backButton.click();
	}
}
