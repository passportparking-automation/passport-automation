package Pages.FindParkingPage;

import static org.testng.Assert.assertTrue;

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
	
	@FindBy(name = "numlisticon")
	private MobileElement locationListModeIcon;
	
	@FindBy(name = "crosshair")
	private MobileElement myLocationButton;
	
	@FindBy(name = "filter")
	private MobileElement filterButton;
	
	private LandingPage landingPage;
	
	public FindParkingPageIOS(AppiumDriver driver) throws Exception {
		super(driver);
		
	}	

	public void CheckFindParkingForExceptions() {		
		handlingIosNotificatioPopUp();
		backButton.isDisplayed();
		locationListModeIcon.isDisplayed();
//		availabilityContainer.isDisplayed();
		myLocationButton.isDisplayed();
//		mapView.isDisplayed();
//		mapSearchInput.isDisplayed();
		filterButton.isDisplayed();

		BasePage.sleep(5000);
		takeScreenshot("checkFP");	
	}

	public void FindParkingNavTest() {
		backButton.click();	
	}

	public void ZoneTest() {
		//Id's missing search textfield. 
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

	public void navToLanding() {
		backButton.click();
		
	}
}
