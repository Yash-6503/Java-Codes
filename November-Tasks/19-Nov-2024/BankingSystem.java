package com.classes;

class BankAccount
{
	protected int accountNumber;
	protected double balance;
	
	public BankAccount(int accountNumbesr, double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}else {
			System.out.println("Invalid Input Amount");
		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && balance > 0) {
			balance += amount;
		}else if(amount <= 0) {
			System.out.println("Invalid Input Amount");
		}else if(balance <= 0) {
			System.out.println("Invalid Input Balance");
		}else if(amount <= 0 && balance <= 0) {
			System.out.println("Invalid Input Amount and Balance");
		}
	}
	
}

class SavingAccount extends BankAccount 
{
	protected double interestRate;
	
	public SavingAccount(int accountNumber, double balance, double interestRate)
	{
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}
	
	public void addInterest(){
		if(balance > 0 && interestRate > 0) {
			double total = (balance / 100) * interestRate;
			balance += total;
			System.out.println("Your Interest Balance is : "+total);
			System.out.println("Your Balance After Calulating Interest is : "+balance);
		}else if(balance > 0 && interestRate <= 0) {
			System.out.println("Invalid Input Interest Rate");
		}else if(interestRate > 0 && balance <= 0) {
			System.out.println("Invalid Input Balance");
		}else {
			System.out.println("Invalid Input Balance and Interest Rate");
		}
	}
}

class CheckingAccount extends BankAccount 
{
	protected double overdraftLimit;
	
	public CheckingAccount(int accountNumber, double balance, double overdraftLimit)
	{
		super(accountNumber,balance);
		if(balance >= overdraftLimit) {			
			this.overdraftLimit = overdraftLimit;
		}else {
			return;
		}
	}
	
	@Override
	public void withdraw(double amount)
	{
		if(balance > 0 && overdraftLimit > 0) {
			if(amount <= overdraftLimit) {
				balance -= amount;
				if(balance < overdraftLimit) {
					System.out.println("Exceeds overdraft limit balance is less");
				}else {
					System.out.println("You have withdraw amount : "+amount);
					System.out.println("Your Balance is : "+balance);
				}
			}else if(balance < overdraftLimit) {
				System.out.println("Exceeds overdraft limit balance is less");
			}
			else {
				System.out.println("Exceeds overdraft limit");
			}
		}
		else if(balance <= 0 && overdraftLimit > 0) {
			System.out.println("Invalid Input Balance");
		}
		else if(balance > 0 && overdraftLimit <= 0) {
			System.out.println("Invalid Input Overdraft Limit");
		}
		else if(overdraftLimit <= 0 && balance <= 0){
			if(balance <= 0 && overdraftLimit > 0) {
				System.out.println("Invalid Input Balance");
			}else {
				System.out.println("Invalid Input Balance and OverDraft Limit");
			}
		}
	}
}


public class BankingSystem {

	public static void main(String[] args) 
	{
		SavingAccount saving = new SavingAccount(1000502,50000,5.5);
		
		CheckingAccount checking = new CheckingAccount(2003010,4000,3000);
		
		saving.addInterest();
		
		System.out.println();
		
		checking.withdraw(1000);
		
	}

}

/*
Your Interest Balance is : 2750.0
Your Balance After Calulating Interest is : 52750.0

You have withdraw amount : 1000.0
Your Balance is : 3000.0
*/

