//BLC interface of BankingSystem -> Bank.java

package pkg.blc2;

public interface Bank 
{
	void deposit(double amount);
	void withdraw(double amount);
	double checkBalance();
}
