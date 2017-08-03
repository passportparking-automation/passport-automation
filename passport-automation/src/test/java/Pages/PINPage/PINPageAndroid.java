package Pages.PINPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class PINPageAndroid extends BasePage  implements PINPage{
	@FindBy (id="pinTextBox")
	public MobileElement PINInputBox;
	
	@FindBy (id="id_lw_sign_in_button")
	public MobileElement PINSignInButton;
	
	@FindBy (id="id_lw_reset_button")
	public MobileElement resetPINButton;
	

	public PINPageAndroid(AppiumDriver driver) {super(driver);}

	public void SendCorrectPINTest() {
		PINInputBox.sendKeys("1111");
		takeScreenshot("pinTest1");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		PINSignInButton.click();
		takeScreenshot("pinTest2");
		
		try {
            driver.findElement(By.id("button1")).click();
            } catch (Exception e) {
            	System.out.println("Run is not on Emulator");
            }
	}
	public void SendShortValuedPINTest() {

	}
	public void SendFalsePINTest() {
		
	}
	public void CheckSecureLoginForExceptions() {
		PINInputBox.isDisplayed();
		PINSignInButton.isDisplayed();
		resetPINButton.isDisplayed();
		takeScreenshot("pinTest8");
	}
	public void EmptyPINTest() {
		PINSignInButton.click();
		takeScreenshot("pinTest6");
		popUp.isDisplayed();
		takeScreenshot("pinTest7");
		acceptButton.click();
	}
	public void InvalidPINTest() {
		PINInputBox.sendKeys("1211");
		takeScreenshot("pinTest3");
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	System.out.println("Keyboard wasn't displayed");
            }
		PINSignInButton.click();
		takeScreenshot("pinrTest4");
		popUp.isDisplayed();
		takeScreenshot("pinTest5");
		acceptButton.click();
	}

	public void navToLanding() {
		driver.navigate().back();
	}
	public void navToReset(){
		resetPINButton.click();
		acceptButton.click();
	}
}
