//BLC class of BankingSystem -> SBI.java

package pkg.blc2;

public class SBI implements Bank 
{
	private double accountBalance;
		
	@Override
	public void deposit(double amount) {
		if(amount > 0) {
			accountBalance += amount;
			System.out.println(amount+" is Deposited in your SBI Account");
		}else {
			System.err.println("Error: Invalid Amount");
			System.exit(0);
		}
	
	}
	
	@Override
	public void withdraw(double amount) {
		if(accountBalance > amount && amount > 0) {
			accountBalance -= amount;
			System.out.println(amount+" is Withdrawl from your SBI Account");
		}else if(amount <= 0) {
			System.err.println("Error: Invalid Amount");
			System.exit(0);
		}else {
			System.err.println("Insufficient Funds..");
			System.exit(0);
		}
	}

	@Override
	public double checkBalance() {
		return accountBalance;
	}

}
