package Pages.CountrySelectorPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class CountrySelectorPageIOS extends BasePage implements CountrySelectorPage {
	
	@FindBy(name = "countrySelectionDropDown")
	private MobileElement countrySelectionDropDown;
	
	@FindBy(name = "continueButton")
	private MobileElement continueButton;

	@FindBy(name = "Cancel")
	private MobileElement cancelButton;
	
	@FindBy(name = "Done")
	private MobileElement doneButton;
	
	@FindBy(name = "Ok")
	private MobileElement OkButton;
	
	@FindBy(name = "Don’t Allow")
	private MobileElement dontAllowButton;
	
	public CountrySelectorPageIOS(AppiumDriver driver) {
		super(driver);
	}

	public void checkCountrySpinnerClick() {
		if(!driver.findElements(By.name("Ok")).isEmpty()){
			OkButton.isDisplayed();
			dontAllowButton.isDisplayed();
			OkButton.click();
		}
		takeScreenshot("ss1");
		countrySelectionDropDown.isDisplayed();
		countrySelectionDropDown.click();
		
		takeScreenshot("ss2");
		cancelButton.isDisplayed();
		cancelButton.click();
	}

	public void checkSelectionOneCountry()	{
		countrySelectionDropDown.isDisplayed();
		takeScreenshot("ss3");
		countrySelectionDropDown.click();
		
		takeScreenshot("ss4");
		doneButton.isDisplayed();
		doneButton.click();
	}
	
	public void checkContinueButtonClick() {
		takeScreenshot("ss5");
		continueButton.isDisplayed();
		continueButton.click();
	}
}
