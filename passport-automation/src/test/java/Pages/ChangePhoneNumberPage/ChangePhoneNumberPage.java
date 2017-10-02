package Pages.ChangePhoneNumberPage;

public interface ChangePhoneNumberPage {
	public void CheckChangePhoneNumberPageForExceptions();
	public void NoDataTest();
	public void InvalidNumberNoPasswordTest();
	public void InvalidNumberInvalidPasswordTest();
	public void InvalidNumberValidPasswordTest();
	public void ValidNumberInvalidPasswordTest();
	public void ValidNumberValidPasswordTest();
}
