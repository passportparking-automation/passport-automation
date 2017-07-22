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
		emailReportBug.isDisplayed();
		commentReportBug.isDisplayed();
		submitReportBug.isDisplayed();
		takeScreenshot("yada1");
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
		takeScreenshot("yada2");
	}
	
	public void EmptyBugTest(){
		submitReportBug.click();
		popUp.isDisplayed();
		takeScreenshot("PopUpMessage1");
		popUp.isDisplayed();
		//click ok button
		acceptButton.click();
		emailReportBug.sendKeys("automaton+00@gopassport.com");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		submitReportBug.click();
		popUp.isDisplayed();
		takeScreenshot("PopUpMessage");
		
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
		takeScreenshot("PopUpMessage2");
		acceptButton.click();
		
		driver.navigate().back();
		takeScreenshot("yada3");
	}
	
	public void NotEmptyBugTest(){
		//enter valid email address
		emailReportBug.sendKeys("automaton+00@gopassport.com");	
		takeScreenshot("PopUpMessage2");
		commentReportBug.sendKeys("Comment");
		//close android keyboard
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		submitReportBug.click();

		// Check the pop up with correct fields is displayed when success
		String actualTitle = title.getText();
		String actualMessage = message.getText();
		String actualAcceptBtn = acceptButton.getText();

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
		popUp.isDisplayed();
		takeScreenshot("ssxxx");
		acceptButton.click();

		driver.navigate().back();
		takeScreenshot("ssx1xx");	
	}
	public void NavigateToBugReportPage() {
		menuIcon.click();
		sendBugMenuOption.click();
		takeScreenshot("amIOnBug");
	}

	


}

