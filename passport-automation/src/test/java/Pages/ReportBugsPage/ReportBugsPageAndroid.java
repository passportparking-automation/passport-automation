package Pages.ReportBugsPage;

import org.openqa.selenium.support.FindBy;

import Pages.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ReportBugsPageAndroid extends BasePage implements ReportBugsPage{
	
	@FindBy(id="bug_report_instructions")
	public MobileElement bugReportInstructions;
	
	@FindBy(id="bug_report_field")
	public MobileElement bugReportResponse;
	
	@FindBy(id="send_bug_report_button")
	public MobileElement sendBugReportButton;

	public ReportBugsPageAndroid(AppiumDriver driver) {super(driver);
	}

	@Override
	public void CheckReportBugPageForExcpetions() {
		// TODO Auto-generated method stub
		
	}

}
