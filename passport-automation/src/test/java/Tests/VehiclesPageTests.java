package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pages.LandingPage.LandingPage;
import Pages.LandingPage.LandingPageAndroid;
import Pages.VehiclesPage.VehiclesPage;
import Pages.VehiclesPage.VehiclesPageAndroid;
import Tests.AbstractBaseTests.TestBase;

public class VehiclesPageTests  extends TestBase {
		
		private LandingPage landingPage;
		private VehiclesPage vehiclesPage;
		
		@BeforeTest
		public void setUpPage() {
			switch(TestBase.executionOS) {
			case ANDROID:
				landingPage = new LandingPageAndroid(driver);
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
		public void CheckVehiclesPageForExceptions(){
			//should be changed to landingPage.navigateToLogin() after logout is coded
			try{landingPage.navigateToLogin();
			}
			catch(Exception e){System.out.println("Wrong Screen");
				driver.navigate().back(); 
			}
			landingPage.hideOverlay();
			landingPage.navigateToVehiclesPage();
			vehiclesPage.CheckVehiclesPageForExceptions();
			driver.navigate().back();
			vehiclesPage.navToLanding();
		}
		
		
		
}


