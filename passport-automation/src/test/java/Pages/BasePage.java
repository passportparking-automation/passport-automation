package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import driver.deviceAndroid;
import driver.deviceIOS;

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
	
	@FindBy (id = "split_action_bar")
	public  MobileElement homeMenuOption;
	
	@FindBy (id = "text")
	public  MobileElement findParkingMenuOption;
	
	@FindBy (id = "textinput_error")
	public  MobileElement helpMenuOption;

	@FindBy (id = "transition_current_scene")
	public  MobileElement sendBugMenuOption;
	
	@FindBy (id = "transition_scene_layoutid_cache")
	public MobileElement FAQMenuOption;
	
	@FindBy (id = "tutorialCloseButton")
	public MobileElement termsMenuOption;
	
	@FindBy (id = "tutorialStepCounter")
	public  MobileElement privacyPolicyMenuOption;
	
	@FindBy (id = "tutorialStepMessage")
	public  MobileElement loginMenuOption;
	
    private static final int KEYBOARD_ANIMATION_DELAY = 1000;
    private static final int XML_REFRESH_DELAY = 1000;
    
    /*public static final String excelPath = "/Users/Anand/Testing/Office/passport-automation/";
	public static final String excelName = "Automation Sheet.xlsx";
	public static final String excelSheetName = "TestData";*/

    protected static AppiumDriver driver;
    
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
    private static XSSFRow Row;

    public BasePage(AppiumDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, 35, TimeUnit.SECONDS), this);
    }
    
    public static void excelFileReading() throws Exception {
    	/*ExcelReading.setExcelFile(excelPath + excelName, excelSheetName);*/
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
	
	public static void waitForClickability(MobileElement mobileElementLocator) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(mobileElementLocator));
	}
}
