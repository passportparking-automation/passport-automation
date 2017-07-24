package Pages.PINPage;

public interface PINPage {
	public void SendShortValuedPINTest();
	public void SendFalsePINTest();
	public void SendCorrectPINTest();
	public void navToLanding();
	public void CheckSecureLoginForExceptions();
	public void EmptyPINTest();
	public void InvalidPINTest();
}
