package Pages.YourCardsPage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class YourCardsPageAndroid extends BasePage implements YourCardsPage {
	
	@FindBy (id="id_add_card_button")
	public MobileElement addCardButton;
	
	@FindBy (id="viewHeader")
	public MobileElement header;
	
	@FindBy(id = "cardTypeImage")
	public MobileElement cardButton;
	
	@FindBy(id = "cdaCardTypeImage")
	public MobileElement cardTypeImage;
	
	@FindBy (id="cdaCardDescription")
	public MobileElement cardDescription;
	
	@FindBy(id="id_ccd_delete")
	public MobileElement deleteCardButton;
	
	public YourCardsPageAndroid(AppiumDriver driver) {super(driver);}
	
	public void CheckYCPageForExceptions() {
		addCardButton.isDisplayed();
	}
	
	public void navToLanding() {
		menuImage.click();
		homeMenuOption.click();
	}
	
	public void NavToPayDetailsPage() {
		addCardButton.click();
			assertEquals(header.getText(), "Add Payment Details");
			takeScreenshot("PD1");
	}

	public void CardScreenTest() {
		cardButton.click();
		cardTypeImage.isDisplayed();
		cardDescription.isDisplayed();
		takeScreenshot("PD2");
		deleteCardButton.click();
		takeScreenshot("PD3");
		declineButton.click();
		cardTypeImage.isDisplayed();
		cardDescription.isDisplayed();
		takeScreenshot("PD4");
		deleteCardButton.click();
		takeScreenshot("PD5");
		acceptButton.click();
		addCardButton.isDisplayed();
		takeScreenshot("PD6");
	}

}
