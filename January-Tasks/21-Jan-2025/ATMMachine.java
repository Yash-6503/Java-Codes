/*
Develop a program by using ITC, where two customers called Depositor and Drawer
will deposit and withdraw the money respectively from the ATM machine.
*/

// ELC (main) class of Account, Drawer, Depositor -> ATMMachine.java

package pkg;

public class ATMMachine {

	public static void main(String[] args) 
	{
		Account acc = new Account();
		
		Drawer d1 = new Drawer(acc);
		
		Depositor depo1 = new Depositor(acc);
		
		d1.start();
		depo1.start();
	}

}


/*
Balance is 0
Amount to withdraw is 1000
Balance is less wait for Deposit
Deposited amount is 2000
After Deposit Updated Balance is 2000
After Withdraw Updated Balance is 1000

Balance is 1000
Amount to withdraw is 2000
Balance is less wait for Deposit
Deposited amount is 1000
After Deposit Updated Balance is 2000
After Withdraw Updated Balance is 0
*/