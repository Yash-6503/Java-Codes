//Q1. Create a class FoodCustomer with below attributes:

import java.util.ArrayList;

class FoodCustomer
{
	int customerId;
	String customerName;
	String address;
	String phoneNumber;
	public FoodCustomer(int customerId, String customerName, String address, String phoneNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	public FoodCustomer() {}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	private void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	private String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}

class FoodOrderService
{
	ArrayList<FoodCustomer> foodCustomerList = new ArrayList<>();
	
	public void placeOrder(FoodCustomer obj) {
		foodCustomerList.add(obj);
	}	
	
	public boolean isFirstTimeCustomer(FoodCustomer cust) {
		for(FoodCustomer c : foodCustomerList) {
			if(c.getPhoneNumber().equals(cust.getPhoneNumber())) {
				return true;
			}
		}
		return false;
	}
	
	public int calculateBill(FoodCustomer cust, int deliveryCharge) {
		if(isFirstTimeCustomer(cust)) {
			return 0;
		}
			return deliveryCharge;
	}
	
	public String printBill(FoodCustomer cust, int billAmt){
		return cust.customerName+" confirming the order and the bill amount is "+billAmt;
	}
	
}

public class FoodOrderServiceTester 
{
	public static void main(String[] args) 
	{
	
		FoodOrderService service = new FoodOrderService();
		
		FoodCustomer cust1 = new FoodCustomer(101, "Virat", "Delhi", "9067973585");
		FoodCustomer cust2 = new FoodCustomer(102, "Rohit", "Delhi", "9067973585");
		
		service.placeOrder(cust1);
		service.placeOrder(cust2);
		
		System.out.println("Is " + cust1.getCustomerName() + " a first-time customer? " + service.isFirstTimeCustomer(cust1));
        System.out.println("Is " + cust2.getCustomerName() + " a first-time customer? " + service.isFirstTimeCustomer(cust2));
		
		int bill1 = service.calculateBill(cust1, 50);
		int bill2 = service.calculateBill(cust2, 50);
		
		System.out.println(service.printBill(cust1, bill1));
		System.out.println(service.printBill(cust2, bill2));

	}

}
