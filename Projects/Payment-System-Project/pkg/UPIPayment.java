//BLC class of PaymentSystem -> UPIPayment.java

package pkg;

public class UPIPayment extends Payment 
{
	private String upiId;
	private double amount;
	
	public UPIPayment(double balance, String upiId, double amount)
	{
		super(balance);
		if(amount > 0) {
			this.upiId = upiId;
			this.amount = amount;
		}else {
			System.out.println("Error: Invalid Amount");
			System.exit(0);
		}
	}

	public String getUpiId() {
		return upiId;
	}

	public void setUpiId(String upiId) {
		this.upiId = upiId;
	}
	
	
	@Override
	public String showBalance()
	{
		return "Your Balance is: "+getBalance();
	}
	
	@Override
	public void makePayment(double amount) {
		if(amount > 0 && balance > 1000) {
			balance -= amount;
			System.out.println("Payment Done Successfully");
		}else if(amount <= 0 && balance > 1000) {
			System.out.println("Error: Invalid Amount");
			return;
		}else if(amount > 0 && balance-amount <= 1000) {
			System.out.println("Insufficient Funds to Pay Payment");
			return;
		}else {
			System.out.println("Invalid Amount and Insufficient Funds");
			return;
		}
	}
}
