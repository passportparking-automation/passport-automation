package Pages.FindParkingPage;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import Pages.LandingPage.LandingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;


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
	
	@FindBy (id="mapSearchZoneListHeader")
	public MobileElement mapSearchZoneHeader;
	
	@FindBy (id="mapSearchListResultsHeader")
	public MobileElement mapSuggestionsHeader;
	
	@FindBy (xpath="//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public MobileElement ZoneResult1;
	
	@FindBy (id="//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ScrollView[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
	public MobileElement suggestionsResult1;
	
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
		
		
	}

	public void ZoneTest2() {
		mapSearchInput.click();
		zoneHelpButton.click();
		takeScreenshot("OverlayWithMessage");
		//Click on any part of the screen
		TouchAction a2 = new TouchAction(driver);
		a2.tap (779, 1236).perform();
		takeScreenshot("NoOverlay");
	
	}

	public void NumericValueZoneTest() {
		mapSearchInput.sendKeys("8896");
		try{
			driver.hideKeyboard();
			}
			catch(Exception e){
				System.out.println("Keyboard wasn't displayed");
			}			
		mapSearchZoneHeader.isDisplayed();
		try {
           if(ZoneResult1.getText().equals("Location 8896")){
        	   assertTrue(true);
           }
            } catch (Exception e) {
            	assertTrue(false);
            }
		
	}
	
	public void navToLanding(){
		driver.navigate().back();
	}
	

	public void TextValueZoneTest() {
		List <MobileElement> listOfObj = driver.findElementsByClassName("android.view.View");
		MobileElement icon1 = listOfObj.get(0);
		mapSearchInput.click();
		mapSearchInput.sendKeys("Sackville Street London");
		try{
			driver.hideKeyboard();
			}
			catch(Exception e){
				System.out.println("Keyboard wasn't displayed");
			}	
		mapSuggestionsHeader.isDisplayed();
		takeScreenshot("SeachSuggestions");
		suggestionsResult1.click();
		icon1.isDisplayed();
		icon1.click();
		
		
	}


	public void ZoneIconTest() {
		//does not send keys
		List <MobileElement> listOfObj = driver.findElementsByClassName("android.view.View");
		MobileElement icon1 = listOfObj.get(0);
		mapSearchInput.sendKeys("Sackville Street London");
		try{
			driver.hideKeyboard();
			}
			catch(Exception e){
				System.out.println("Keyboard wasn't displayed");
			}	
		
		suggestionsResult1.click();
		icon1.isDisplayed();
		icon1.click();	
	}

}
	
