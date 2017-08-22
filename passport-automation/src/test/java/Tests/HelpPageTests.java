package Tests;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.BasePage;
import Pages.HelpPage.HelpPage;
import Pages.HelpPage.HelpPageAndroid;
import Pages.HelpPage.HelpPageIOS;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LandingPage.LandingPageIOS;
import Tests.AbstractBaseTests.TestBase;

public class HelpPageTests extends TestBase {

	public HelpPageTests() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	private LandingPage landingPage;
	private HelpPage helpPage;

	@FindBy(name = "Don’t Allow")
	private static MobileElement dontAllowButton;
	
	@FindBy(name = "Allow")
	private static MobileElement allowButton;
	
	@FindBy(name = "OK")
	private static MobileElement OkButtonNotification;
	
	@FindBy(name = "OK")
	private static MobileElement okButtonBuddyBuild;

	@BeforeTest
	// @Override
	public void setUpPage() throws Exception {
		switch (TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			helpPage = new HelpPageAndroid(driver);

			break;
		case IOS:
			landingPage = new LandingPageIOS(driver);
			helpPage = new HelpPageIOS(driver);

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
	@Test
	public void TutorialSwipeTest(){
		landingPage.clickHelpButton();
		helpPage.TutorialSwipeTest(); 
	}
	


}
