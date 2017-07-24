package Pages.SendBugReportPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class SendBugReportPageIOS extends BasePage implements SendBugReportPage {

	public SendBugReportPageIOS(AppiumDriver driver) {  super(driver);  }
	
	@FindBy(xpath = ".//XCUIElementTypeTextField[1]")
	private MobileElement emailReportBug;
	
	@FindBy (name = "sendBugReportText")
	public MobileElement commentReportBug;

	@FindBy (name = "submitButton")
	public MobileElement submitReportBug;
	
	@FindBy (name = "back")
	public MobileElement backButton;
	
	@FindBy (name = "Send Report")
	public MobileElement title;
	
	@FindBy (name = "Bug Report Sent")
	public MobileElement titleBugReportSent;
	
	@FindBy (name = "We have received your bug report.")
	public MobileElement messageBugReportSent;
	
	@FindBy (name = "Ok")
	public MobileElement okButton;
	
	@FindBy (name = "Missing Description")
	public MobileElement titlePopUp;
	
	@FindBy (xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextView[1]")
	public MobileElement message;
	
	@FindBy (name = "Send Bug Report")
	public  MobileElement sendBugMenuOption;
	
	@FindBy (name = "menuicon")
	public MobileElement menuIcon;
	
	@FindBy (name = "Home")
	public  MobileElement homeMenuOption;

	public void CheckBugForExceptions(){
		emailReportBug.isDisplayed();
		commentReportBug.isDisplayed();
		submitReportBug.isDisplayed();
		takeScreenshot("yada1");
		/*backButton.click();
		takeScreenshot("yada2");*/
	}
	
	public void EmptyBugTest(){
		submitReportBug.click();
		takeScreenshot("PopUpMessage1");
		//click ok button
		okButton.click();
		emailReportBug.sendKeys("automaton+00@gopassport.com");
		submitReportBug.click();
		takeScreenshot("PopUpMessage");
		
		//Check the pop up with correct fields is displayed when comment box is empty
		String actualTitle = titlePopUp.getText();
		String actualMessage = message.getText();
		String actualAcceptBtn = okButton.getText();
		
		String expectedTitle = "Missing Description";
		String expectedMessage = "Please describe the issue you're experiencing so that we can better assist you.";
		String expectedAcceptBtn = "Ok";
		
		if(expectedTitle.equals(actualTitle)){
			assertTrue(true);
			}else{
				assertTrue(false);
			}
		if(expectedMessage.equals(actualMessage)){
			assertTrue(true);
			}else{
				assertTrue(false);
			}
		
		if(expectedAcceptBtn.equals(actualAcceptBtn)){
			assertTrue(true);
			}else{
				assertTrue(false);
			}
		takeScreenshot("PopUpMessage2");
		okButton.click();
		
		takeScreenshot("yada3");
	}
	
	public void NotEmptyBugTest(){
		//enter valid email address
		emailReportBug.sendKeys("automaton+00@gopassport.com");	
		takeScreenshot("PopUpMessage2");
		commentReportBug.sendKeys("Comment");
		//close android keyboard
		//driver.navigate().back();
		submitReportBug.click();

		// Check the pop up with correct fields is displayed when success
		String actualTitle = titleBugReportSent.getText();
		String actualMessage = messageBugReportSent.getText();
		String actualAcceptBtn = okButton.getText();

		String expectedTitle = "Bug Report Sent";
		String expectedMessage = "We have received your bug report.";
		String expectedAcceptBtn = "Ok";

		if (expectedTitle.equals(actualTitle)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		if (expectedMessage.equals(actualMessage)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}

		if (expectedAcceptBtn.equals(actualAcceptBtn)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		takeScreenshot("ssxxx");
		okButton.click();

		menuIcon.click();
		homeMenuOption.click();
		takeScreenshot("ssx1xx");	
	}
	public void NavigateToBugReportPage() {
		menuIcon.click();
		sendBugMenuOption.click();
		takeScreenshot("amIOnBug");
	}
}

