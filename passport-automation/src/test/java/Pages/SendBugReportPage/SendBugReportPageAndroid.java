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
	
	@FindBy (id = "menuImageView")
	public MobileElement menuImage;
	
	@FindBy (xpath = "	//android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")
	public MobileElement submitReportBug;

	
	public void CheckBugForExceptions(){
		menuIcon.click();
		takeScreenshot("cbfe");
		
		
		reportBugButton.click();
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
		TouchAction touchAction=new TouchAction(driver);
		touchAction.tap(920, 620).perform();
		popUp.isDisplayed();
		acceptButton.click();
		driver.navigate().back();
		menuIcon.click();
		homeOption.click();
		
		
		
	}


}

