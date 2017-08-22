package Pages.PayDetailsPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import Pages.BasePage;
import Pages.LandingPage.LandingPageIOS;

public class PayDetailsPageIOS extends BasePage implements PayDetailsPage {

	@FindBy (name="cardNumberTextBox")
	public MobileElement cardNumberTextBox;
	
	@FindBy (name="monthDropDown")
	public MobileElement monthSpinner;
	
	@FindBy (name="yearDropDown")
	public MobileElement yearSpinner;
	
	@FindBy (name="cvvTextBox")
	public MobileElement cvvTextBox;
	
	@FindBy (name="saveCardButton")
	public MobileElement saveCardButton;
	
	@FindBy (name="Done")
	public MobileElement doneButton;
	
	@FindBy (name="Cancel")
	public MobileElement cancelButton;
	
	@FindBy (name="Ok")
	public MobileElement okButton;
	
	LandingPageIOS landingPage = new LandingPageIOS(driver);
	
	public PayDetailsPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void CheckPayDetailForExpcetions() {
		/*cardNumberTextBox.isDisplayed();
		monthSpinner.isDisplayed();
		yearSpinner.isDisplayed();
		cvvTextBox.isDisplayed();
		saveCardButton.isDisplayed();*/
		takeScreenshot("ceckPDForEX");
	}

	public void FillOutForm() {
		cardNumberTextBox.sendKeys("41111111111111111");
		monthSpinner.click();
		int offset = 1;
        int y = driver.manage().window().getSize().getHeight();
        int x = driver.manage().window().getSize().getWidth();
        TouchAction touchAction = new TouchAction(driver);
        touchAction.press((x + 2) / 3, y - offset).moveTo(0, -(y - (2 * offset))).release();
        touchAction.perform();
		BasePage.sleep(5000);
		landingPage.SwipeDownTest();
		doneButton.click();
		yearSpinner.click();
		landingPage.SwipeDownTest();
		doneButton.click();
		List<MobileElement> cvvTextField = driver.findElements(By.className("XCUIElementTypeTextField"));
		cvvTextField.get(3).sendKeys("111");
		takeScreenshot("fillForm1");
		List<MobileElement> saveCardButton = driver.findElements(By.className("XCUIElementTypeButton"));
		saveCardButton.get(4).click();
		takeScreenshot("fillForm2");
		try{
		okButton.click();
		} catch (Exception e) {
			System.out.println("okBtn Not displayed"); 
         	
		}
	}
}
