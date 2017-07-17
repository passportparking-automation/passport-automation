package Pages.VehiclesPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class VehiclesPageAndroid extends BasePage implements  VehiclesPage{
	@FindBy (xpath= "//android.widget.RelativeLayout[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")
	public MobileElement addVehicleButton;
	
	public VehiclesPageAndroid(AppiumDriver driver) {	super(driver);}

	@Override
	public void clickAddV() {
		addVehicleButton.click();

	}

	@Override
	public void CheckVehiclesPageForExceptions() {
		// TODO Auto-generated method stub
		
	}

}
