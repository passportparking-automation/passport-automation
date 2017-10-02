package Pages.ForgotPasswordPage;

public interface ForgotPasswordPage {
	public void NoDataTest();
	public void BadEmailTest();
	public void NonvalidEmailTest();
	public void CheckSecurityQuestionsForExcpetions();
	public void NoAnswerTest();
	public void WrongAnswerTest();
	public void CorrectAnswerTest();
}
