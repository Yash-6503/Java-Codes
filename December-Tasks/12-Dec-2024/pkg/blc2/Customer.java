//BLC class of BankingSystem -> Customer.java

package pkg.blc2;

public class Customer 
{
	String name;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public void deposit(Bank bank, double amount){
		bank.deposit(amount);
	}
	
	public void withdraw(Bank bank, double amount) {
		bank.withdraw(amount);
	}
	
	public double checkBalance(Bank bank) {
		System.out.println("Your "+bank.getClass().getSimpleName()+" Account Balance is "+bank.checkBalance());
		return bank.checkBalance();
	}
}
