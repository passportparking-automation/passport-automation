package Pages.AboutPage;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AboutPageAndroid extends BasePage implements AboutPage {

	public AboutPageAndroid(AppiumDriver driver) {  super(driver);  }

	
	@FindBy (id = "menuImageView")
	public MobileElement menuImage;
	
	
	public void AboutTest(){
		
		WebElement pageHeader =   driver.findElement(By.id("viewHeader"));
		String actualFAQHeader = pageHeader.getText();
		String expectedFAQHeader = "FAQ";
		//System.out.println("Actual Value is: " + actualFAQHeader);
		if(expectedFAQHeader.equals(actualFAQHeader)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		//driver.navigate().back();
		driver.navigate().back();
		//backButton.click();
		//menuIcon.click();
		//homeOption.click();
		
		
		
	}
	
}