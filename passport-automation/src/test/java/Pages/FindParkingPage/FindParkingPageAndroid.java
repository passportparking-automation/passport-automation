package Pages.FindParkingPage;

import static org.testng.Assert.assertTrue;



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
	
	@FindBy (id="mapView")
	public MobileElement mapView;
	
	@FindBy (id="mapSearchBarInput")
	public MobileElement mapSearchInput;
	
	@FindBy (id="filterButton")
	public MobileElement filterButton;
	
	@FindBy (id="zoneNumberHelpButton")
	public MobileElement zoneHelpButton;
	
	private LandingPage landingPage;
	
	
	
	
	
	public FindParkingPageAndroid(AppiumDriver driver) {
		super(driver);
		
	}	

	public void CheckFindParkingForExceptions() throws InterruptedException {		
		backButton.isDisplayed();
		locationListModeIcon.isDisplayed();
		availabilityContainer.isDisplayed();
		myLocationButton.isDisplayed();
		mapView.isDisplayed();
		mapSearchInput.isDisplayed();
		String actualSearchInput = mapSearchInput.getText();
		String expectedSearchInput = "Search by Street, Place or Location Number";
		if(expectedSearchInput.equals(actualSearchInput)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		filterButton.isDisplayed();

		Thread.sleep(5000);
		takeScreenshot("checkFP");
		
		//backButton.click();	
	}

	public void FindParkingNavTest() {
		backButton.click();	
	}

	public void ZoneTest() {
		mapSearchInput.click();
		takeScreenshot("leftArrowAndQuestionMark");
		zoneHelpButton.isDisplayed();
		String actualZoneHelpButton = zoneHelpButton.getText();
		String expectedZoneHelpButton = "What is a location number?";
		if(expectedZoneHelpButton.equals(actualZoneHelpButton)){
		assertTrue(true);
		}else{
			assertTrue(false);
		}
		try {
            driver.hideKeyboard();
            } catch (Exception e) {
            	assertTrue(false);
            }
	
	}

	public void WhatZoneTest() {
		// TODO Auto-generated method stub
		
	}

	public void ZoneTest2() {
		mapSearchInput.click();
		zoneHelpButton.click();
	
	}

	public void NumericValueZoneTest() {
		mapSearchInput.sendKeys("8896");
		try{
			driver.hideKeyboard();
			}
			catch(Exception e){
				System.out.println("Keyboard wasn't displayed");
			}		

		
		
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
	
