package Pages.MobileVerPage;

public interface MobileVerPage {
	public void CheckMobileVerPageForExceptions();
	public void NavBackToLoginTest();
	public void BlankNumberProvidedTest();
	public void ShortNumberProivdedTest();
	public void ValidMobileTest(String mobileNumber);
	public void ForceQuitTest();
	public void navToLanding(); 
}