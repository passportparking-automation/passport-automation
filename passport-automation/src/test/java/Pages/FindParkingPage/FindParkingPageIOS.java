package Pages.FindParkingPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.LandingPage.LandingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FindParkingPageIOS extends BasePage implements FindParkingPage{

	@FindBy(name = "Don’t Allow")
	private MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private MobileElement allowButton;
	
	@FindBy(name = "OK")
	private MobileElement OkButtonNotification;
	
	@FindBy(name = "back")
	private MobileElement backButton;
	
	private LandingPage landingPage;
	
	public FindParkingPageIOS(AppiumDriver driver) {
		super(driver);
		
	}	

	public void CheckFindParkingForExceptions() throws InterruptedException {		
		/*if(!driver.findElements(By.name("Allow")).isEmpty()) {
			allowButton.isDisplayed();
			dontAllowButton.isDisplayed();
			allowButton.click();
		}*/
		takeScreenshot("checkFP");
		backButton.click();	
	}

	public void FindParkingNavTest() {
		backButton.click();	
	}

	public void ZoneTest() {
		// TODO Auto-generated method stub
		
	}

	public void WhatZoneTest() {
		// TODO Auto-generated method stub
		
	}

	public void ZoneTest2() {
		// TODO Auto-generated method stub
		
	}

	public void NumericValueZoneTest() {
		// TODO Auto-generated method stub
		
	}

	public void TextValueZoneTest() {
		// TODO Auto-generated method stub
		
	}

	public void ZoneIconTest() {
		// TODO Auto-generated method stub
		
	}
}
