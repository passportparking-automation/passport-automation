package Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class BasePage {

	@FindBy (id = "menuButton")
	public MobileElement menuIcon;
	
	@FindBy (id = "menuImageView")
	public MobileElement menuImage;
	
	@FindBy(id = "btnOk")
	public MobileElement acceptButton;
	
	@FindBy(id = "btnCancel")
	public MobileElement declineButton;
	
	@FindBy (id ="backButton")
	public MobileElement backButton;

	@FindBy (id = "parent")
	public MobileElement popUp;
	
	@FindBy (id = "title")
	public MobileElement popUpTitle;
	
	@FindBy (id = "message")
	public MobileElement popUpMessage;
	
	@FindBy (id = "sidemenu_item_sm_new_session")
	public  MobileElement homeMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_wayfinding")
	public  MobileElement findParkingMenuOption;
	
	@FindBy (id = "sidemenu_item_help")
	public  MobileElement helpMenuOption;

	@FindBy (id = "sidemenu_item_sm_send_report")
	public  MobileElement sendBugMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_faq")
	public MobileElement FAQMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_terms")
	public MobileElement termsMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_privacy_policy")
	public  MobileElement privacyPolicyMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_login")
	public  MobileElement loginMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_parker_history")
	public  MobileElement parkHistoryMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_profile")
	public  MobileElement profileMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_payment")
	public  MobileElement paymentMenuOption;
	
	@FindBy (id = "sidemenu_item_sm_vehicles")
	public  MobileElement vehiclesMenuOption;
	
	@FindBy (xpath = "//android.widget.RelativeLayout[1]/android.view.ViewGroup[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[11]")
	public  MobileElement logoutMenuOption;
		
	static WebDriverWait wait;
	
    private static final int KEYBOARD_ANIMATION_DELAY = 1000;
    private static final int XML_REFRESH_DELAY = 1000;

    protected final AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 35, TimeUnit.SECONDS), this);
    }
    
    protected boolean sendKeysToElement(String input, WebElement element, boolean appendNewLine) throws InterruptedException {
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;

        do {
            element.clear();
            Thread.sleep(KEYBOARD_ANIMATION_DELAY);

            if (appendNewLine) {
                element.sendKeys(input + "\n");
            } else {
                element.sendKeys(input);
            }

            Thread.sleep(XML_REFRESH_DELAY);
        } while (!element.getText().contains(input) && ++attempts < MAX_ATTEMPTS);

        return element.getText().contains(input);
    }
   
    
	
	public boolean takeScreenshot(final String name) {
		String screenshotDirectory = System.getProperty("appium.screenshots.dir", System.getProperty("java.io.tmpdir", ""));
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		return screenshot.renameTo(new File(screenshotDirectory, String.format("%s.png", name)));
	}
	public static void sleep(int sleeptime) {
		try {
			Thread.sleep(sleeptime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
