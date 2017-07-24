package Pages.AboutPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import Pages.BasePage;

public class AboutPageIOS extends BasePage implements AboutPage {

	public AboutPageIOS(AppiumDriver driver) {
		super(driver);
	}

	public void AboutTest() {
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
