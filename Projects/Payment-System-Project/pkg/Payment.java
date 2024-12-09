//BLC class of PaymentSystem -> Payment.java

package pkg;

abstract class Payment 
{
	protected double balance;
	
	public Payment(double balance)
	{
		if(balance > 0) {
			this.balance = balance;
		}else {
			System.out.println("Error: Invalid Balance");
			System.exit(0);
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public abstract String showBalance();
	
	
	public abstract void makePayment(double amount);
}
