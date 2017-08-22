package Pages.UpdateProfPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import Pages.BasePage;
import Pages.ProfilePage.ProfilePage;
import Pages.ProfilePage.ProfilePageAndroid;

public class UpdateProfPageIOS extends BasePage implements UpdateProfPage {

	@FindBy (name="back")
	public MobileElement backButton;
	
	@FindBy (name = "id_privacy_link_msg")
	public MobileElement readPrivacyPolicy;
	
	@FindBy (name = "saveProfileButton")
	public MobileElement saveButton;
	
	@FindBy (name = "Ok")
	public MobileElement okButton;
	 
	private ProfilePage profilePage = new ProfilePageAndroid(driver);
		
	public UpdateProfPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void UpdateProfNavTest() {
		profilePage.CheckProfilePageForExceptions();
		profilePage.NavToUpdateProfTest();
		readPrivacyPolicy.click();
		backButton.click();
	}

	public void CheckUpdateProfPageForExceptions() {
		List<MobileElement> updateProfileTextboxList = driver.findElements(By.className("XCUIElementTypeTextField"));
		//first name
		updateProfileTextboxList.get(0).clear();
		updateProfileTextboxList.get(0).sendKeys("");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		okButton.click();
		takeScreenshot("UpdateProfileEmptyName");
		updateProfileTextboxList.get(0).clear();
		updateProfileTextboxList.get(0).sendKeys(" ");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		okButton.click();
		updateProfileTextboxList.get(0).sendKeys("First");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		//last name
		updateProfileTextboxList.get(1).clear();
		updateProfileTextboxList.get(1).sendKeys(" ");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		takeScreenshot("UpdateProfileEmptyLastName");
		okButton.click();
		updateProfileTextboxList.get(1).sendKeys("Last");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		//email
		updateProfileTextboxList.get(3).clear();
		updateProfileTextboxList.get(3).sendKeys("");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		okButton.click();
		updateProfileTextboxList.get(3).clear();
		updateProfileTextboxList.get(3).sendKeys("automaton+00@gopassport");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		takeScreenshot("UpdateProfileWrongEmail");
		okButton.click();
		updateProfileTextboxList.get(3).clear();
		updateProfileTextboxList.get(3).sendKeys("automaton+00gopassport.com");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		takeScreenshot("UpdateProfileWrongEmail2");
		okButton.click();
		updateProfileTextboxList.get(3).clear();
		updateProfileTextboxList.get(3).sendKeys("me@park.ing");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		saveButton.click();
		takeScreenshot("UpdateProfileSuccess");
		okButton.click();
		
	}
}
