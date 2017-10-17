package Pages.SignInPage;

public interface SignInPage {	
	public void CheckSigninPageForExceptions();
	public void FailedLoginTest();
	public void NavigateForgotPassword();
	public void NavigateCreateAccount();
	public void SuccesfulLoginTest();

	public void navigateToCreateAccountPage();
	public void navigateToForgotPasswordPage();
}
