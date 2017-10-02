package Pages.ChangePasswordPage;

public interface ChangePasswordPage {
	public void CheckChangePasswordPageForExceptions();
	public void NoDataTest();
	public void InvlaidNewNoCurrentTest();
	public void InvlaidNewInvalidOldTest();
	public void InvlaidNewInvalidNewTest();
	public void ValidNewInvalidOldTest();
	public void ValidNewValidOldTest();
}
