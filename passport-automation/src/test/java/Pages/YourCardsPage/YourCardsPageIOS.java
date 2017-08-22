package Pages.YourCardsPage;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;

public class YourCardsPageIOS extends BasePage implements YourCardsPage {
	
	@FindBy(name = "creditCard_0")
	public MobileElement cardButton;
	
	@FindBy(name = "addCardButton")
	public MobileElement addCardButton;
	
	@FindBy(name = "visa.png")
	public MobileElement cardTypeImage;
	
	@FindBy(name = "deleteButton")
	public MobileElement deleteCardButton;
	
	@FindBy(name = "No")
	public MobileElement noButton;
	
	@FindBy(name = "Yes")
	public MobileElement yesButton;

	public YourCardsPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void CheckYCPageForExceptions() {
		addCardButton.isDisplayed();
	}
	
	public void navToLanding() {
		menuImage.click();
		homeMenuOption.click();
	}
	
	public void NavToPayDetailsPage() {
		addCardButton.click();
		takeScreenshot("PD1");
	}
	
	public void CardScreenTest() {
		cardButton.click();
		takeScreenshot("PD2");
		deleteCardButton.click();
		takeScreenshot("PD3");
		noButton.click();
		takeScreenshot("PD4");
		deleteCardButton.click();
		takeScreenshot("PD5");
		yesButton.click();
		takeScreenshot("PD6");
	}
	public void clickTestCreditCard(){
		takeScreenshot("PD7");
		cardButton.click();
		
	}
}
