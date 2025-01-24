// BLC class of CoronaVaccineApp -> DoseBooking.java

package pkg;

public class DoseBooking
{
	private boolean booked;
	
	public DoseBooking(boolean booked) {
		this.booked = booked;
	}
	
	public boolean bookDose() {
		try {
			if(booked) {	
				throw new RuntimeException("Dose already booked.");
			}else {
				booked=true;
			}
			return true;
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	public boolean isDoseBooked() {
		if(booked) {
			return true;
		}else {
			return false;
		}
	}
}