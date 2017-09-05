package Pages.VehiclesPage;

public interface VehiclesPage {
	public void CheckVehiclesPageForExceptions();
	public void clickAddV();
	public void navToLanding();
	public void CheckUpdateToVehiclePage();
	public void NavTest();
	public void navToUpdateDeleteVehicleDetialPage();
	public void clickTestVehicle();
	
	//Deisel flow
	public void clickNonDieselOlderThan2015TestVehicle();
	public void clickNonDieselYoungerThan2015TestVehicle();
	public void clickNonDiesel2015TestVehicle();
	public void clickDiesel2015TestVehicle();
	public void clickDieselYoungThan2015TestVehicle();
	public void clickDieselOlderThan2015TestVehicle();
	public void clickNoGuruRecordVehicle();
	
}

