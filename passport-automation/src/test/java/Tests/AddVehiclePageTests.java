package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Pages.AddVehiclePage.AddVehiclePage;
import Pages.AddVehiclePage.AddVehiclePageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class AddVehiclePageTests extends TestBase {
	
	private LandingPage landingPage;
	private AddVehiclePage addVehiclePage;
	private VehiclesPage vehiclesPage;
	
	@BeforeTest
	public void setUpPage() {
		switch(TestBase.executionOS) {
		case ANDROID:
			landingPage = new LandingPageAndroid(driver);
			addVehiclePage = new AddVehiclePageAndroid(driver);
			vehiclesPage = new VehiclesPageAndroid(driver);

		
			
			break;
		case IOS:
			//landingpage = new LandingPageIOS(driver);
			
			break;
		default:
			break;
		}
	}
	
	@Test
	public void AddVehicleTest(){
		//should be changed to landingPage.navigateToLogin() after logout is coded
		try{landingPage.navigateToLogin();
		}
		catch(Exception e){System.out.println("Wrong Screen");
			driver.navigate().back(); 
		}
		landingPage.hideOverlay();
		landingPage.navigateToVehiclesPage();
		vehiclesPage.CheckVehiclesPageForExceptions();
		addVehiclePage.AddVehicleTest();
		vehiclesPage.navToLanding();		
	}
	
	@Test
	public void CheckUpdateToVehiclePage(){
		//should be changed to landingPage.navigateToLogin() after logout is coded
		try{landingPage.navigateToLogin();
		}
		catch(Exception e){System.out.println("Wrong Screen");
			driver.navigate().back(); 
		}
		landingPage.hideOverlay();
		landingPage.navigateToVehiclesPage();
		vehiclesPage.CheckVehiclesPageForExceptions();
		addVehiclePage.CheckUpdateToVehiclePage();
		vehiclesPage.navToLanding();		
	}
}
