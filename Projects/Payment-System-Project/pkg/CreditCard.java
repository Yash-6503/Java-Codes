//BLC class of PaymentSystem -> CreditCard.java

package pkg;

public class CreditCard extends Payment
{
	private int lastFourDigits;
	private int pinNumber;
	private double amount;
	
	public CreditCard(double balance, int lastFourDigits, int pinNumber, double amount)
	{
		super(balance);
		if(lastFourDigits > 0 && pinNumber > 0 && amount > 0) {
			if(lastFourDigits > 999 && lastFourDigits <= 9999) {
				this.lastFourDigits = lastFourDigits;				
			}else {
				System.out.println("Error: Last Four Digits must be 4 Digits only.");
				System.exit(0);
			}
			if(pinNumber > 999 && pinNumber <= 9999) {
				this.pinNumber = pinNumber;
			}else {
				System.out.println("Error: Pin Number must be 4 Digits only.");
				System.exit(0);
			}
			this.amount = amount;
		}else if(lastFourDigits <= 0 && pinNumber > 0 && amount > 0) {
			System.out.println("Error: Invalid Last Four Digits");
			System.exit(0);
		}else if(lastFourDigits > 0 && pinNumber <= 0 && amount > 0) {
			System.out.println("Error: Invalid Pin Number");
			System.exit(0);
		}else if(lastFourDigits > 0 && pinNumber > 0 && amount <= 0) {
			System.out.println("Error: Invalid Amount");
			System.exit(0);
		}else if(lastFourDigits <= 0 && pinNumber <= 0 && amount > 0) {
			System.out.println("Error: Invalid Last Four Digits and Pin Number");
			System.exit(0);
		}else if(lastFourDigits <= 0 && pinNumber > 0 && amount <= 0) {
			System.out.println("Error: Invalid Last Four Digits and Amount");
			System.exit(0);
		}else if(lastFourDigits > 0 && pinNumber <= 0 && amount <= 0) {
			System.out.println("Error: Invalid Pin Number and Amount");
			System.exit(0);
		}else {
			System.out.println("Error: Invalid Last Four Digits, Pin Number and Amount");
			System.exit(0);
		}
	}
	
	public int getLastFourDigits() {
		return lastFourDigits;
	}
	
	public void setLastFourDigits(int lastFourDigits) {
		this.lastFourDigits = lastFourDigits;
	}
	
	public int getPinNumber() {
		return pinNumber;
	}
	
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
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
