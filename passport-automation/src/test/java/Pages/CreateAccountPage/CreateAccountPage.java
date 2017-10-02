package Pages.CreateAccountPage;

public interface CreateAccountPage {
	public void CheckCreateAccountPageForExceptions();
	public void AlreadyRegisteredTest();
	public void BadEmailStringTest();
	public void WrongPasswordTest();
	public void SuccessfulAccountCreationTest();
}
