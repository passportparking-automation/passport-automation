package Pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
	
	@FindBy(id = "btnOk")
	public MobileElement acceptButton;
	
	@FindBy(id = "btnCancel")
	public MobileElement declineButton;
	
	@FindBy (id ="backImageView")
	public MobileElement backButton;
	
	@FindBy (xpath ="//android.widget.RelativeLayout[1]/android.view.View[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[3]/android.widget.TextView[1]")
	public MobileElement reportBugButton;
	
	@FindBy (xpath = " //android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]")
	public MobileElement popUp;
	
	@FindBy (xpath = "//android.widget.RelativeLayout[1]/android.view.View[2]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]")
	public  MobileElement homeOption;

	
	
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
