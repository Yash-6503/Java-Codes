//BLC class of ATM Operations -> Customer.java

package pkg;

public class Customer 
{
	private String name;
	
	private BankAccount account;
	
	public Customer(String name, BankAccount account)
	{
		this.name = name;
		this.account = account;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
}
