package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.HelpPage.HelpPage;
import Pages.HelpPage.HelpPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class HelpPageTests extends TestBase {

	private LandingPage landingPage;
	private HelpPage helpPage;

	@BeforeTest
	// @Override
	public void setUpPage() {
		switch (TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			helpPage = new HelpPageAndroid(driver);

			break;
		case IOS:
			// landingpage = new LandingPageIOS(driver);

			break;
		default:
			break;
		}
	}

	@Test
	public void CloseHelpTest() {
		landingPage.clickHelpButton();
		helpPage.CloseHelpTest();
	}

	@Test
	public void HelpNavTest() throws InterruptedException {
		BasePage.sleep(5000);
		helpPage.HelpNavTest();
	}
/*	@Test
	public void TutorialSwipeTest(){
		landingPage.clickHelpButton();
		helpPage.TutorialSwipeTest(); 
	}
	*/


}
