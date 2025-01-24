// BLC class of CoronaVaccineApp -> User.java

package pkg;

public class User
{
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}
	
	public void isisEligible() {
		if(eligibility.isEligible()) {
			System.out.println("Eligible for the vaccine");
		}else {
			System.out.println("Not Eligible for the vaccine");
		}
	}
	
	public void bookDose() {
		try {
			if(eligibility.isEligible() && doseBooking.bookDose()) {
				
				System.out.println("Dose booked successfully for "+name);
			}else {
				throw new RuntimeException(name+" is not eligible for the vaccine.");
			}
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void isDoseBooked() {
		if(doseBooking.isDoseBooked()) {
			System.out.println("Dose is booked");
		}else {
			System.out.println("Dose is not booked");
		}
	}
}