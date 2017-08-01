package Pages.PINPage;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;

public class PINPageIOS extends BasePage implements PINPage {

	@FindBy (name = "loginPIN")
	public MobileElement PINInputBox;
	
	@FindBy (name = "loginButton")
	public MobileElement PINSignInButton;
	
	@FindBy (name = "Reset PIN")
	public MobileElement resetPINButton;
	
	@FindBy (name = "menuicon")
	public MobileElement menuButton;
	
	@FindBy (name = "Home")
	public MobileElement homeMenuOption;
	
	@FindBy (name = "Ok")
	public MobileElement okButton;

	public PINPageIOS(AppiumDriver driver) {super(driver);}

	public void SendCorrectPINTest() {
		PINInputBox.sendKeys("1111");
		takeScreenshot("verTest1");
		PINSignInButton.click();
		takeScreenshot("verTest1");
	}

	public void CheckSecureLoginForExceptions() {
		PINInputBox.isDisplayed();
		PINSignInButton.isDisplayed();
		resetPINButton.isDisplayed();
		takeScreenshot("pinTest8");
		menuButton.click();
		homeMenuOption.click();
		
	}

	public void EmptyPINTest() {
		PINSignInButton.click();
		takeScreenshot("pinTest6");
		okButton.click();
		
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
		/*okButton.click();*/
		
	}


	@Override
	public void navToLanding() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void navToReset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SendShortValuedPINTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SendFalsePINTest() {
		// TODO Auto-generated method stub
		
	}
}
