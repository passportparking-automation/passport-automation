package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.SendBugReportPage.SendBugReportPage;
import Pages.SendBugReportPage.SendBugReportPageAndroid;
import Pages.SendBugReportPage.SendBugReportPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class SendBugReportPageTests extends TestBase {
	
	public SendBugReportPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String mobileNumber = readingExcel.getCellData("ParkRight", "PhoneNumber", 2);
	
	private SendBugReportPage sendBugReportPage;
	
	@BeforeTest
	public void setUpPage() throws Exception {
		switch(TestBase.executionOS) {
		case ANDROID:
			sendBugReportPage = new SendBugReportPageAndroid(driver);
			
			break;
		case IOS:
			sendBugReportPage = new SendBugReportPageIOS(driver);
			
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
}
