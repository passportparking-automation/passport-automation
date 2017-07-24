package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.SendBugReportPage.SendBugReportPage;
import Pages.SendBugReportPage.SendBugReportPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class SendBugReportPageTests extends TestBase {
	
	private LandingPage landingPage;
	private SendBugReportPage sendBugReportPage;
	
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			sendBugReportPage = new SendBugReportPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	@Test 
	public void CheckBugForExceptions() throws InterruptedException{
		sendBugReportPage.NavigateToBugReportPage();
		sendBugReportPage.CheckBugForExceptions();	
	}
	@Test
	public void EmptyBugTest() throws InterruptedException{
		sendBugReportPage.NavigateToBugReportPage();
		sendBugReportPage.EmptyBugTest();
	}
	@Test
	public void NotEmptyBugTest(){
		sendBugReportPage.NavigateToBugReportPage();
		sendBugReportPage.NotEmptyBugTest();
	}
	@Override
	public void exitCriteria() {
		// TODO Auto-generated method stub
		
	}
}
