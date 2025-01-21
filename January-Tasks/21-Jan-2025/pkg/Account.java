//BLC class of ATMMachine -> Account.java

package pkg;

public class Account 
{
	private int balance = 0;
	
	public synchronized void withdraw(int amount) {
		System.out.println("Balance is "+this.balance);
		System.out.println("Amount to withdraw is "+amount);
		while(balance < amount) {
			System.out.println("Balance is less wait for Deposit");
			try {
				wait();
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
		this.balance -= amount;
		System.out.println("After Withdraw Updated Balance is "+this.balance+"\n");
		notify();
	}
	
	public synchronized void deposit(int amount) {
		System.out.println("Deposited amount is "+amount);
		if(amount > 0) {
			this.balance += amount;
			System.out.println("After Deposit Updated Balance is "+this.balance);
			notify();
		}else {
			System.err.println("Invalid amount");
		}
	}
}
