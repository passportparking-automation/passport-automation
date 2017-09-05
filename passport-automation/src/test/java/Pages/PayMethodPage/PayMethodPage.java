package Pages.PayMethodPage;

public interface PayMethodPage {
	public void CheckPayMethodForExceptions();
	public void acceptPayment();
	public void declinePayment();
	
	public void checkPopForTax_NonDieselYoungerThan2015();
	public void checkPopForTax_NonDieselOlderThan2015();
	public void checkPopForTax_NonDiesel2015();
	public void checkPopForTax_Diesel2015();
	public void checkPopForTax_DieselYoungerThan2015();
	public void checkPopForTax_DieselOlderThan2015();
	public void checkPopForTax_NoGuruRecord();

}
