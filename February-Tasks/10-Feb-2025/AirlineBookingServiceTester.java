// Create a class AirlineCustomer with below attributes

import java.util.ArrayList;

class AirlineCustomer 
{
	private int customerId;
	private String fullName;
	private String email;
	private String phoneNumber;
	
	public AirlineCustomer() {}

	public AirlineCustomer(int customerId, String fullName, String email, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}

class AirlineBookingService
{
	ArrayList<AirlineCustomer> customerList = new ArrayList<>();
	
	public void bookFlight(AirlineCustomer cust) {
		customerList.add(cust);
	}
	
	public boolean isFirstTimeCustomer(AirlineCustomer cust) {
		for(AirlineCustomer ph : customerList) {
			if(ph.getPhoneNumber().equals(cust.getPhoneNumber())) {
				return false;
			}else {
				return true;
			}
		}
		return true;
	}
	
	public int calculateBookingCost(AirlineCustomer cust, int baseCost) {
		if(isFirstTimeCustomer(cust)) {
			return 0;
		}else {
			return baseCost;
		}
	}
	
	public String printBookingDetails(AirlineCustomer cust, int bookingCost) {
		return cust.getFullName()+" confirming the booking and booking cost is "+bookingCost;
	}
}


public class AirlineBookingServiceTester 
{
	public static void main(String[] args) 
	{
		
		AirlineBookingService service = new AirlineBookingService();
		
		AirlineCustomer cust1 = new AirlineCustomer(101,"Virat Kohli","virat183@gmail.com","1234567890");
		AirlineCustomer cust2 = new AirlineCustomer(102,"Rohit Sharma","rohit264@gmail.com","0987654321");
		
		service.bookFlight(cust1);
		service.bookFlight(cust2);
		
		System.out.println("Is "+cust1.getFullName()+" First Time Customer ? -> "+service.isFirstTimeCustomer(cust1));
		System.out.println("Is "+cust2.getFullName()+" First Time Customer ? -> "+service.isFirstTimeCustomer(cust2));
		
		int bill1 = service.calculateBookingCost(cust1, 1500);
		int bill2 = service.calculateBookingCost(cust2, 1500);
		
		System.out.println("\nBilling Details");
		System.out.println(service.printBookingDetails(cust1, bill1));
		System.out.println(service.printBookingDetails(cust2, bill2));

	}

}
