package Pages.FindParkingPage;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.LandingPage.LandingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FindParkingPageAndroid extends BasePage implements FindParkingPage{

	@FindBy (id="locationListModeIcon")
	public MobileElement locationListModeIcon;
	
	@FindBy (id="parkingMapAvailabilityContainer")
	public MobileElement availabilityContainer;
	
	@FindBy (id="myLocationButton")
	public MobileElement myLocationButton;
	
	private LandingPage landingPage;
	
	
	
	
	
	public FindParkingPageAndroid(AppiumDriver driver) {
		super(driver);
		
	}	

	public void CheckFindParkingForExceptions() throws InterruptedException {		
		/*
		backButton.isDisplayed();
		locationListModeIcon.isDisplayed();
		availabilityContainer.isDisplayed();
		myLocationButton.isDisplayed();
		*/
		Thread.sleep(5000);
		takeScreenshot("checkFP");
		driver.navigate().back();
		//backButton.click();	
	}

	@Override
	public void FindParkingNavTest() {
		backButton.click();	
	}

	@Override
	public void ZoneTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WhatZoneTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ZoneTest2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void NumericValueZoneTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void TextValueZoneTest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ZoneIconTest() {
		// TODO Auto-generated method stub
		
	}

}
	
