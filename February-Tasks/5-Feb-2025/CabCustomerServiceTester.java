/*
Three classes are given to you, 
CabCustomer
CabCustomerService
CabCustomerServiceTester
*/

import java.util.*;

class CabCustomer 
{
	private int custId;
	private String customerName; 
	private String pickupLocation;
	private String dropLocation;
	private int distance; 
	private String phone;

	
	
	public CabCustomer() {
		
	}
	
	
	public CabCustomer(int custId, String customerName, String pickupLocation, String dropLocation, int distance,
			String phone) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
	}




	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getDropLocation() {
		return dropLocation;
	}
	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


	@Override
	public String toString() {
		return "CabCustomer [custId=" + custId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone + "]";
	}
	
	
}

class CabCustomerService
{
	private ArrayList<CabCustomer> genericArrayList = new ArrayList<CabCustomer>();
	
	public void addCabCustomer(CabCustomer cust) {
		if(isFirstCustomer(cust)) {
			genericArrayList.add(cust);
			System.out.println("Customer added succesfully..");
		}else {
			System.out.println("Customer already exists..");
		}
	}
	
	
	public boolean isFirstCustomer(CabCustomer cust) {
		for(CabCustomer c : genericArrayList) {
			if(c.getPhone().equals(cust.getPhone())) {
				return false;
			}
		}
		return true;
	}
	
	public double calculateBill(CabCustomer cust) {
		if(isFirstCustomer(cust)) {
			
			return 0;
		}else if(cust.getDistance() <= 4) {
				return 80;
		}else {
				return 80 + (cust.getDistance() * 6 -4);
		}
		
	}
	
	public String printBill(CabCustomer cust) {
		
		return cust.getCustomerName()+" Please pay your bill of Rs."+calculateBill(cust);
		
	}
	
}



public class CabCustomerServiceTester 
{
	public static void main(String[] args)
	{
		CabCustomer cust1 = new CabCustomer(111,"John","Ameerpet","Begumpet",6,"9067973585");
		CabCustomer cust2 = new CabCustomer(221,"Smith","Ameerpet","S.R.Nagar",10,"9067973585");

		
		CabCustomerService service = new CabCustomerService();
		
		service.addCabCustomer(cust1);
		System.out.println(service.printBill(cust1));
		
		System.out.println("-------------------------------------------");
		
		service.addCabCustomer(cust2);
		System.out.println(service.printBill(cust2));
		
	}

}
