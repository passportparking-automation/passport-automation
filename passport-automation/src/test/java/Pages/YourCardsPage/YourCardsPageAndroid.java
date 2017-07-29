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
	}

}
