//BLC class of PaymentSystem -> BankTransfer.java

package pkg;

public class BankTransfer extends Payment 
{
	private int recieverAccountNumber;
	private double amount;
	

	public BankTransfer(double balance, int recieverAccountNumber, double amount) {
		super(balance);
		if(recieverAccountNumber > 0 && amount > 0) {
			this.recieverAccountNumber = recieverAccountNumber;
			this.amount = amount;
		}else if(recieverAccountNumber <= 0 && amount > 0) {
			System.out.println("Error: Invalid Reciever Account Number");
			System.exit(0);
		}else if(recieverAccountNumber > 0 && amount <= 0) {
			System.out.println("Error: Invalid Amount");
			System.exit(0);
		}else {
			System.out.println("Error: Invalid Reciever Account Number and Amount");
			System.exit(0);
		}
	}

	public int getRecieverAccountNumber() {
		return recieverAccountNumber;
	}

	public void setRecieverAccountNumber(int recieverAccountNumber) {
		this.recieverAccountNumber = recieverAccountNumber;
	}
	
	@Override
	public String showBalance()
	{
		return "Your Balance is: "+getBalance();
	}
	
	@Override
	public void makePayment(double amount)
	{
		if(amount > 0 && balance > 1000) {
			balance -= amount;
			System.out.println("Payment Transferred Successfully to "+recieverAccountNumber+" Account Number");
		}else if(amount <= 0 && balance > 1000) {
			System.out.println("Error: Invalid Amount");
			return;
		}else if(amount > 0 && balance-amount <= 1000) {
			System.out.println("Insufficient Funds to Transfer Money");
			return;
		}else {
			System.out.println("Invalid Amount and Insufficient Funds");
			return;
		}
	}
	
}
