package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.CodeVerificationPage.CodeVerificationPage;
import Pages.CodeVerificationPage.CodeVerificationPageAndroid;
import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.LoginPage.LoginPage;
import Pages.LoginPage.LoginPageAndroid;
import Pages.MobileVerPage.MobileVerPage;
import Pages.MobileVerPage.MobileVerPageAndroid;
import Pages.PINPage.PINPage;
import Pages.PINPage.PINPageAndroid;
import Pages.ProfilePage.ProfilePage;
import Pages.ProfilePage.ProfilePageAndroid;
import Pages.UpdateProfPage.UpdateProfPage;
import Pages.UpdateProfPage.UpdateProfPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class UpdateProfPageTests extends TestBase {
	
	private LandingPage landingPage;
	private ProfilePage profilePage;
	private UpdateProfPage updateProfPage;
	private LoginPage loginPage;
	private MobileVerPage mobVerPage;
	private CodeVerificationPage codeVerPage;
	private PINPage pinPage;
	
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			profilePage = new ProfilePageAndroid(driver);
			updateProfPage = new UpdateProfPageAndroid(driver);
			loginPage = new LoginPageAndroid(driver);
			mobVerPage = new MobileVerPageAndroid(driver);
			codeVerPage = new CodeVerificationPageAndroid(driver);
			pinPage = new PINPageAndroid(driver);
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	@Test 
	public void UpdateProfNavTest(){
		//should be changed to landingPage.navigateToLogin() after logout is coded
		try{landingPage.navigateToLogin();
		}
		catch(Exception e){System.out.println("Wrong Screen");
			driver.navigate().back(); 
		}
		landingPage.navigateToProfilePage();
	profilePage.NavToUpdateProfTest();
	updateProfPage.UpdateProfNavTest();
	driver.navigate().back();
	//landingPage.logout();
	}
	
	@Test
	public void CheckUpdateProfForExceptions() {
		//should be changed to landingPage.navigateToLogin() after logout is coded
		try{landingPage.navigateToLogin();
		}
		catch(Exception e){System.out.println("Wrong Screen");
		driver.navigate().back();}
		landingPage.navigateToProfilePage();
	

		profilePage.NavToUpdateProfTest();
		updateProfPage.CheckUpdateProfPageForExceptions();
		profilePage.CheckProfilePageForExceptions();
		driver.navigate().back();
		
	}
}
