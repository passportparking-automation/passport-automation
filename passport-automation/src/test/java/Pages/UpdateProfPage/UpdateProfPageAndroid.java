package Pages.UpdateProfPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.ProfilePage.ProfilePage;
import Pages.ProfilePage.ProfilePageAndroid;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class UpdateProfPageAndroid extends BasePage implements UpdateProfPage {
	
	@FindBy (id="id_titlebar_back_button")
	public MobileElement backButton1;
	
	@FindBy (id="id_privacy_link_msg")
	public MobileElement readPrivacyPolicy;
	
	@FindBy (id="viewHeader")
	public MobileElement header;
	
	@FindBy (id="saveProfileButton")
	public MobileElement saveButton;
	
	private String headerText; 
	private ProfilePage profilePage = new ProfilePageAndroid(driver);
	
	@FindBy (id="profileactivity_firstname")
	public MobileElement firstNameInput;
	
	@FindBy (id="profileactivity_lastname")
	public MobileElement lastNameInput;
	
	@FindBy(id="profileactivity_phonenumber")
	public MobileElement phoneNumberField;

	@FindBy (id="profileactivity_emailaddress")
	public MobileElement emailInput;
	
	public UpdateProfPageAndroid(AppiumDriver driver) throws Exception {  super(driver);  }

	
	public void UpdateProfNavTest() {
		profilePage.CheckProfilePageForExceptions();
		profilePage.NavToUpdateProfTest();
		headerText = header.getText();
		//System.out.println(header.getText());
		if(headerText.equals("Update Profile")){
			assertTrue(true);
		}else {assertTrue(false); }
		readPrivacyPolicy.click();
		headerText = header.getText();
		if(headerText.equals("Privacy Policy")){
			assertTrue(true);
		}else {assertTrue(false); }
		//System.out.println(header.getText());
		backButton.click();
		headerText = header.getText();
		//System.out.println(header.getText());
		if(headerText.equals("Update Profile")){
			assertTrue(true);
		}else {assertTrue(false); }		
	}

	public void CheckUpdateProfPageForExceptions() {
		phoneNumberField.isDisplayed();
		//first name
		firstNameInput.sendKeys("");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		popUp.isDisplayed();
		acceptButton.click();
		takeScreenshot("UpdateProfileEmptyName");
		firstNameInput.sendKeys(" ");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		popUp.isDisplayed();
		acceptButton.click();
		firstNameInput.sendKeys("First");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		//last name
		lastNameInput.sendKeys(" ");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		popUp.isDisplayed();
		takeScreenshot("UpdateProfileEmptyLastName");
		acceptButton.click();
		lastNameInput.sendKeys("Last");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		//email
		emailInput.sendKeys("");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		emailInput.sendKeys("automaton+00@gopassport");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		popUp.isDisplayed();
		takeScreenshot("UpdateProfileWrongEmail");
		acceptButton.click();
		emailInput.sendKeys("automaton+00gopassport.com");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		popUp.isDisplayed();
		takeScreenshot("UpdateProfileWrongEmail2");
		acceptButton.click();
		emailInput.sendKeys("me@park.ing");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		if(popUpTitle.getText().equals("Success")){
			assertTrue(true);
		}else {assertTrue(false);}
		takeScreenshot("UpdateProfileSuccess");
		acceptButton.click();
		
	}
}
