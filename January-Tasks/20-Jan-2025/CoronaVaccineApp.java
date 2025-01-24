/*
Design a COVID-19 vaccine booking application that allows users to check their eligibility based on
age and health conditions. Users who meet the eligibility criteria can book a dose, and the application
should handle concurrent user interactions using threads.
*/

// ELC (main) class of VaccineEligibility, DoseBooking and User classes  -> CoronaVaccineApp.java

package pkg;

public class CoronaVaccineApp {

	public static void main(String[] args) throws InterruptedException {

		VaccineEligibility ele1 = new VaccineEligibility(22, true);
		DoseBooking db1 = new DoseBooking(false);
		User user1 = new User("Yash", ele1, db1);
		
		VaccineEligibility ele2 = new VaccineEligibility(15, true);
		DoseBooking db2 = new DoseBooking(false);
		User user2 = new User("Suresh", ele2, db2);
		
		new Thread(()->{
			user1.bookDose();
		}).start();
		
		new Thread(()->{
			user2.bookDose();
		}).start();
		
	}
}

/*
Dose booked successfully for Yash
Suresh is not eligible for the vaccine.
*/

/*
Suresh is not eligible for the vaccine.
Dose booked successfully for Yash
*/
