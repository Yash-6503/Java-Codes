// BLC class of CoronaVaccineApp -> VaccineEligibility.java

package pkg;

public class VaccineEligibility
{
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public boolean isEligible() {
		if(age >= 18 && age <= 60 && hasHealthCondition==true) {
			return true;
		}else {
			return false;
		}
	}
}