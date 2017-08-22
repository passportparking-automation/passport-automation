package Pages.PayDetailsPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PayDetailsPageAndroid extends BasePage implements PayDetailsPage{
	@FindBy (id="cardNumberTextBox")
	public MobileElement cardNumberTextBox;
	
	@FindBy (id="monthSpinner")
	public MobileElement monthSpinner;
	
	@FindBy (id="yearSpinner")
	public MobileElement yearSpinner;
	
	@FindBy (id="cvvTextBox")
	public MobileElement cvvTextBox;
	
	@FindBy (id="saveCardButton")
	public MobileElement saveCardButton;

	public PayDetailsPageAndroid(AppiumDriver driver) throws Exception {super(driver);}

	public void CheckPayDetailForExpcetions() {
		cardNumberTextBox.isDisplayed();
		monthSpinner.isDisplayed();
		yearSpinner.isDisplayed();
		cvvTextBox.isDisplayed();
		saveCardButton.isDisplayed();
		takeScreenshot("ceckPDForEX");
	}

	public void FillOutForm() {
		cardNumberTextBox.sendKeys("41111111111111111");
		monthSpinner.click();
		List<MobileElement> monthList = driver.findElements(By.className("android.widget.CheckedTextView"));
		monthList.get(11).click();
		
		yearSpinner.click();
		List<MobileElement> YearList = driver.findElements(By.className("android.widget.CheckedTextView"));
		YearList.get(1).click();
		cvvTextBox.sendKeys("111");
		takeScreenshot("fillForm1");
		saveCardButton.click();
		takeScreenshot("fillForm2");
		try{
		acceptButton.click();
		 } catch (Exception e) {
         	System.out.println("okBtn Not displayed"); 
         	
         }
	}
}
