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

public class SendBugReportPageAndroid extends BasePage implements SendBugReportPage {


	public SendBugReportPageAndroid(AppiumDriver driver) {  super(driver);  }
	
	@FindBy (id = "emailAddressInput")
	public MobileElement emailReportBug;
	
	@FindBy (id = "commentsText")
	public MobileElement commentReportBug;
	

	@FindBy (id = "id_sm_bug_report_submit")
	public MobileElement submitReportBug;
	

	@FindBy (id = "menuImageView")
	public MobileElement menuImage;
	
	@FindBy (id="title")
	public MobileElement title;
	
	@FindBy (id="message")
	public MobileElement message;



	
	public void CheckBugForExceptions(){
		menuIcon.click();
		takeScreenshot("cbfe");
		
		
		reportBugButton.click();
		//Check if you are on the right page using Header
		WebElement pageHeader =   driver.findElement(By.id("viewHeader"));
		String actualHeader = pageHeader.getText();
		String expectedHeader = "Send Report";
		//System.out.println("Actual Value is: " + actualHeader);
		if(expectedHeader.equals(actualHeader)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		emailReportBug.isDisplayed();
		commentReportBug.isDisplayed();
		submitReportBug.isDisplayed();
		
		//Check if email and comment  boxes have inner text "Required"
		String actualEmailBugRequired = emailReportBug.getText();
		String expectedEmailBugRequired = "Required";
		if(expectedEmailBugRequired.equals(actualEmailBugRequired)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		String actualCommentBugRequired = commentReportBug.getText();
		String expectedCommentBugRequired = "Required";
		if(expectedCommentBugRequired.equals(actualCommentBugRequired)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		
		driver.navigate().back();
		menuIcon.click();
		homeOption.click();
}
	
	
	public void EmptyBugTest(){
		menuIcon.click();
		
		reportBugButton.click();
		submitReportBug.click();
		popUp.isDisplayed();
		takeScreenshot("PopUp Message");
		//Check if pop up is display after clicking anywhere the screen
		TouchAction touchAction=new TouchAction(driver);
		touchAction.tap(920, 620).perform();
		popUp.isDisplayed();
		//click ok button
		acceptButton.click();
		driver.navigate().back();
		menuIcon.click();
		homeOption.click();	
	}
	
	public void NotEmptyBugTest(){
		menuIcon.click();
		reportBugButton.click();
		//enter valid email address
		emailReportBug.click();
		emailReportBug.sendKeys("yjus@quilmont.com"+"\n");
		submitReportBug.click();
		popUp.isDisplayed();
		takeScreenshot("PopUp Message");
		
		//Check the pop up with correct fields is displayed when comment box is empty
		String actualTitle = title.getText();
		String actualMessage = message.getText();
		String actualAcceptBtn = acceptButton.getText();
		
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
		//Tap anywhere on the screen
		TouchAction touchAction=new TouchAction(driver);
		touchAction.tap(920, 620).perform();
		popUp.isDisplayed();
		
		takeScreenshot("PopUpMessage2");
		acceptButton.click();
		
		//Check if you are on the right page using Header
		WebElement pageHeader = driver.findElement(By.id("viewHeader"));
		String actualHeader = pageHeader.getText();
		String expectedHeader = "Send Report";
		// System.out.println("Actual Value is: " + actualHeader);
		if (expectedHeader.equals(actualHeader)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		//Enter text to comments box
		commentReportBug.click();
		commentReportBug.sendKeys("Comment");
		//close android keyboard
		//driver.navigate().back();
		submitReportBug.click();

		// Check the pop up with correct fields is displayed when success
		actualTitle = title.getText();
		actualMessage = message.getText();
		actualAcceptBtn = acceptButton.getText();

		expectedTitle = "Bug Report Sent";
		expectedMessage = "We have received your bug report.";
		expectedAcceptBtn = "Ok";

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
	
		// Tap anywhere on the screen
		touchAction = new TouchAction(driver);
		touchAction.tap(920, 620).perform();
		popUp.isDisplayed();
		
		acceptButton.click();
		//Check if you are on the right page using Header
		pageHeader = driver.findElement(By.id("viewHeader"));
		actualHeader = pageHeader.getText();
		expectedHeader = "Send Report";
		// System.out.println("Actual Value is: " + actualHeader);
		if (expectedHeader.equals(actualHeader)) {
			assertTrue(true);
		} else {
			assertTrue(false);
		}
		
		//backButton.click();
		driver.navigate().back();
		//menuIcon.click();
		//homeOption.click();	
		
		
		
		

	}

	


}

