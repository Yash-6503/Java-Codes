/*
Program to demonstrate Consumer interface
*/

package com.classes;

import java.util.Scanner;
import java.util.function.Consumer;

class Customer{
	private int customerId;
	
	public Customer(int customerId) {
		this.customerId = customerId;
	}
	
	@Override
	public String toString() {
		return "Customer [customer ID = "+customerId+"]";
	}
}

public class Consumer_Demo1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Consumer<Customer> customer = cust -> System.out.println("Customer type: "+cust);
		
		customer.accept(new Customer(111));
	}

}

/*
Customer type: Customer [customer ID = 111]
*/
