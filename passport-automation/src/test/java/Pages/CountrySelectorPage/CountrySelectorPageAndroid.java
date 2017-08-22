package Pages.CountrySelectorPage;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CountrySelectorPageAndroid extends BasePage implements CountrySelectorPage {
	
	/*Country Dropdown Button Country Selector Screen*/
	@AndroidFindBy(id = "com.passportparking.mobile:id/countrySpinner")
	private MobileElement countryDropdown;
	
	/*OK Button Turn on GPS pop up*/
	@AndroidFindBy(id = "com.passportparking.mobile:id/btnOk")
	private MobileElement okButtonGPS;
	
	/*Cancel Button Turn on GPS pop up*/
	@AndroidFindBy(id = "com.passportparking.mobile:id/btnCancel")
	private MobileElement cancelButtonGPS;
	
	/*Country Option India*/
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='India']")
	private MobileElement countryOptionIndia;
	
	/*Country Option USA*/
	@AndroidFindBy(xpath = "//android.widget.CheckedTextView[@text='United States of America']")
	private MobileElement countryOptionUSA;
	
	/*Continue Button on Country Selector Page*/
	@AndroidFindBy(xpath = "//android.widget.Button[@text='Continue']")
	private MobileElement continueButton;
	
	public CountrySelectorPageAndroid(AppiumDriver driver) throws Exception {
		super(driver);
	}

	public void checkOkButtonClick() {
		okButtonGPS.click();
	}
	
	public void checkCountrySpinnerClick() {
			BasePage.sleep(10000);
			if(!driver.findElements(By.id("com.passportparking.mobile:id/btnOk")).isEmpty()) {
				takeScreenshot("ss1");
				okButtonGPS.isDisplayed();
				cancelButtonGPS.isDisplayed();
				cancelButtonGPS.click();
				
				takeScreenshot("ss2");
				countryDropdown.isDisplayed();
				countryDropdown.click();
			} else {
				takeScreenshot("ss1");
				countryDropdown.isDisplayed();
				countryDropdown.click();
			}	
	}
	
	public void checkSelectionOneCountry() {
		takeScreenshot("ss4");
		if(!(driver.findElements(MobileBy.xpath("//android.widget.CheckedTextView[@text='United States of America']"))).isEmpty()) {
			countryOptionUSA.click();
		} else {
			WebElement element = driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@text='India']"));
	
			int x = element.getLocation().getX();
			int y = element.getLocation().getY();
	
			TouchAction action = new TouchAction(driver);
			action.press(x,y).moveTo(x+90,y).release().perform(); 
			takeScreenshot("ss5");
			countryOptionUSA.click();
		}
	}
	
	public void checkContinueButtonClick() {
		try{
			takeScreenshot("ss6");
			countryDropdown.isDisplayed();
			List<MobileElement> buttonArray = driver.findElements(By.className("android.widget.Button"));
			MobileElement countryContinueButton = buttonArray.get(0);
			countryContinueButton.click();

			} catch(NoSuchElementException e) {
		}
	}
}
