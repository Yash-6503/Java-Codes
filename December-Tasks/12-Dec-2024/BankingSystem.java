//ELC (main) class of Customer, Bank, SBI, HDFC and ICICI classes -> BankSystem.java

/*
Program to develop a banking system to demonstrate the concept of loosely coupled 
architecture using interfaces and classes.
*/

package pkg.blc2;

public class BankingSystem {

	public static void main(String[] args) 
	{
		Customer cust = new Customer("Virat Kohli");
		
		System.out.println("SBI Bank Operations");
		SBI sbi = new SBI();
		cust.deposit(sbi, 1000);
		cust.checkBalance(sbi);
		cust.withdraw(sbi,500);
		cust.checkBalance(sbi);
		
		System.out.println("\nHDFC Bank Operations");
		HDFC hdfc = new HDFC();
		cust.deposit(hdfc, 5000);
		cust.checkBalance(hdfc);
		cust.withdraw(hdfc,1000);
		cust.checkBalance(hdfc);
		
		System.out.println("\nICICI Bank Operstions");
		ICICI icici = new ICICI();
		cust.deposit(icici, 2000);
		cust.checkBalance(icici);
		cust.withdraw(icici,500);
		cust.checkBalance(icici);
	}

}


/*  Tested with Positive Values
SBI Bank Operations
1000.0 is Deposited in your SBI Account
Your SBI Account Balance is 1000.0
500.0 is Withdrawl from your SBI Account
Your SBI Account Balance is 500.0

HDFC Bank Operations
5000.0 is Deposited in your HDFC Account
Your HDFC Account Balance is 5000.0
1000.0 is Withdrawl from your HDFC Account
Your HDFC Account Balance is 4000.0

ICICI Bank Operstions
2000.0 is Deposited in your ICICI Account
Your ICICI Account Balance is 2000.0
500.0 is Withdrawl from your ICICI Account
Your ICICI Account Balance is 1500.0
*/

/* Tested with Negative Values
SBI Bank Operations
1000.0 is Deposited in your SBI Account
Your SBI Account Balance is 1000.0
Error: Invalid Amount
*/