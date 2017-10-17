package Tests.EasyPayMiami;

import org.testng.annotations.*;

import Pages.ForgotPasswordPage.ForgotPasswordPageAndroid;
import Pages.SignInPage.SignInPage;
import Pages.SignInPage.SignInPageAndroid;
import Pages.TicketsPage.TicketsPage;
import Pages.TicketsPage.TicketsPageAndroid;
import Tests.TestBase;

public class TicketsPageTests extends TestBase{
	
	SignInPage signInPage;
	TicketsPage ticketsPage;

	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS){
		case ANDROID:
			signInPage = new SignInPageAndroid(driver);
			ticketsPage = new TicketsPageAndroid(driver);
			break;

		case IOS:
			
			break;
		
		default:
			break;
		}
	}
	@Test
	public void TicketsPageTestMethods(){
		signInPage.SuccesfulLoginTest();
		ticketsPage.CheckTicketPageForExcpetions();
		ticketsPage.OneDayPassTest();
		ticketsPage.MultiDayPassTest();
	}

}
