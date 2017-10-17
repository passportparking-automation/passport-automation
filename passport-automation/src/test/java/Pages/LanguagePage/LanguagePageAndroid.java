package Pages.LanguagePage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LanguagePageAndroid extends BasePage implements LanguagePage{

	/*
	@FindBy(id="checkmark")
	public MobileElement checkmark;
	
	@FindBy(id="selection_name")
	public MobileElement selectionName;
	*/
	
	@FindBy(id="md_buttonDefaultNegative")
	public MobileElement changeLanguageRestartButton;
	
	@FindBy(id="md_buttonDefaultPositive")
	public MobileElement changeLanguageCancelButton;
	
	
	public LanguagePageAndroid(AppiumDriver driver) {super(driver);
	}

	@Override
	public void ToggleLanguageTest() {
		// TODO Auto-generated method stub
		
	}

}
