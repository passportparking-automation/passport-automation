package Tests;

import java.io.BufferedReader;
import java.util.Scanner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.CountrySelectorPage.CountrySelectorPage;
import Pages.CountrySelectorPage.CountrySelectorPageAndroid;
import Pages.CountrySelectorPage.CountrySelectorPageIOS;
import Pages.CountrySelectorPage.CountrySelectorPageWebAndroid;
import Pages.CountrySelectorPage.CountrySelectorPageWebIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Pages.LandingPage.LandingPageWebAndroid;
import Pages.LandingPage.LandingPageWebIOS;
import Tests.AbstractBaseTests.TestBase;

public class TestLoginFlow extends TestBase {
	private CountrySelectorPage countryPage;
	private LandingPage landingpage;
	
	@BeforeTest
	@Override
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			countryPage = new CountrySelectorPageAndroid(driver);
			landingpage = new LandingPageAndroid(driver);
			
			break;
		case IOS:
			countryPage = new CountrySelectorPageIOS(driver);
			landingpage = new LandingPageIOS(driver);
			
			break;
			
		case WEBANDROID:
			countryPage = new CountrySelectorPageWebAndroid(driver);
			landingpage = new LandingPageWebAndroid(driver);
			
			break;
		case WEBIOS:
			countryPage = new CountrySelectorPageWebIOS(driver);
			landingpage = new LandingPageWebIOS(driver);
			
			break;
		}
	}
	
	@Test
	public void testLoginFlow() {
		/*
		 * Testcases of Country Selector Screen
		 */
		
		countryPage.checkCountrySpinnerClick();
		countryPage.checkSelectionOneCountry();
		countryPage.checkContinueButtonClick();
		
		/*
		 * Testcases of Landing Page
		 */
		
		landingpage.checkTermsAndCondtionsLinkClick();
		landingpage.checkPrivacyPolicyLinkClick();
		landingpage.checkSignUpClickExpectTNC();
		landingpage.checkDeclineClick();
		landingpage.checkLoginInClickExpectTNC();
		landingpage.checkAcceptClickExpectLoginSelection();
		landingpage.checkSignUpClickExpectLoginSelection();
		landingpage.checkLoginClickExpectLoginSelection();
	}
}
