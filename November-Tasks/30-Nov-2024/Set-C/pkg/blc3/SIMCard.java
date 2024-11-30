//BLC class of EmployeeManagementSystem -> SIMCard.java

package pkg.blc3;

public class SIMCard {

	private String simname;
	private String simNumber;

	
	public SIMCard(String simname, String simNumber)
	{
		this.simname = simname;
		this.simNumber = simNumber;
		
	}
	
	public void setSimName(String simname) {
		this.simname = simname;
	}
	
	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}
	
	public String getSimName() {
		return simname;
	}
	
	public String getSimNumber() {
		return simNumber;
	}
	
}
