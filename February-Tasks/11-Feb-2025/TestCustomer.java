// Create a class Customer with below attributes:

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer implements Comparable<Customer>
{
	private int customerNumber;
	private String customerName;
	private double customerBill;
	
	public Customer(int customerNumber, String customerName, double customerBill) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.customerBill = customerBill;
	}

	
	
	public int getCustomerNumber() {
		return customerNumber;
	}



	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public double getCustomerBill() {
		return customerBill;
	}



	public void setCustomerBill(double customerBill) {
		this.customerBill = customerBill;
	}


	@Override
	public int compareTo(Customer o) {
		return Integer.compare(this.customerNumber, o.customerNumber);
	}
	
	 @Override
	    public String toString() {
	        return "Customer{" +
	                "customerNumber=" + customerNumber +
	                ", customerName='" + customerName + '\'' +
	                ", customerBill=" + customerBill +
	                '}';
	    }
	
}

class CustomerNumberComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        return Integer.compare(o1.getCustomerNumber(), o2.getCustomerNumber());
    }
} 

//Comparator for sorting by customerName
class CustomerNameComparator implements Comparator<Customer> {
 @Override
 public int compare(Customer o1, Customer o2) {
     return o1.getCustomerName().compareTo(o2.getCustomerName());
 }
}

//Comparator for sorting by customerBill
class CustomerBillComparator implements Comparator<Customer> {
 @Override
 public int compare(Customer o1, Customer o2) {
     return Double.compare(o1.getCustomerBill(), o2.getCustomerBill());
 }
}

public class TestCustomer 
{
	public static void main(String[] args) 
	{
		ArrayList<Customer> custList = new ArrayList<>();
		
//		Customer cust = new Customer(444, "Harsh", 300);
		
		custList.add(new Customer(333,"Raj",500));
		custList.add(new Customer(111,"Abhi",1000));
		custList.add(new Customer(222,"Yash", 800));
		
		System.out.println("Original Customer List");
		custList.forEach(System.out::println);
		
		Collections.sort(custList,new CustomerNumberComparator());
		 System.out.println("\nSorted by Customer Number:");
		custList.forEach(System.out::println);
		
		// Sorting by customerName
        Collections.sort(custList, new CustomerNameComparator());
        System.out.println("\nSorted by Customer Name:");
        custList.forEach(System.out::println);

        // Sorting by customerBill
        Collections.sort(custList, new CustomerBillComparator());
        System.out.println("\nSorted by Customer Bill:");
        custList.forEach(System.out::println);
	}

}
