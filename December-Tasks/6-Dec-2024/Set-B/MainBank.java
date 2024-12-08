//Program to manage bank accounts for both savings and checking purposes. 

package com.classes;

class BankAccount
{
    double balance;

    public BankAccount(double balance)
    {
        if(balance > 0){
            this.balance = balance;
        }else{
            System.out.println("Error: Invalid Balance");
            System.exit(0);
        }
    }

    public void deposit(double amount)
    {
        if(amount > 0){
            System.out.println("Previous Balance : "+balance);
            balance += amount;
            System.out.println("Deposited : "+amount);
        }else{
            System.out.println("Error: Invalid amount");
        }
    }

    public void withdraw(double amount)
    {
        if(balance > 1000 && amount > 0){
            balance -= amount;
            System.out.println("Withdraw : "+amount);
        }else if(balance <= 1000 && amount > 0){
            System.out.println("Insufficient Funds you can't withdraw");
        }
        else if(balance > 1000 && amount <= 0) {
            System.out.println("Error: Invalid amount");
        }else{
            System.out.println("Insufficient Funds and Invalid amount");
        }
    }
    }

    class SavingsAccount extends BankAccount
    {
    double interestRate;

    public SavingsAccount(double balance, double interestRate)
    {
        super(balance);
        if(interestRate > 0){
            this.interestRate = interestRate;
        }else {
            System.out.println("Error: Interest Rate");
            System.exit(0);
        }
    }

    public double calculateInterest(SavingsAccount saving)    
    {
        if(saving instanceof SavingsAccount){
            double total = (balance/100)*interestRate + balance;
            System.out.println("Interest Added : "+interestRate); 
            // System.out.println("Interest on Balance is : "+(balance/100)*interestRate);
            // System.out.println("Savings Account Balance : "+total);
            return total;
        }else{
            System.out.println("Error: Invalid Account");
            return 0;
        }
    }
}

class CheckingAccount extends BankAccount
{
 public CheckingAccount(double balance){
         super(balance);
 }
}


public class MainBank
{
 public static void main(String args[])
 {
     SavingsAccount saving = new SavingsAccount(1000,10);

     saving.deposit(200);
     saving.calculateInterest(saving);
     System.out.println("Savings Account Balance : "+saving.balance+"\n");
     
     CheckingAccount checking = new CheckingAccount(1000);
     checking.deposit(300);
     checking.withdraw(100);
     System.out.println("Checking Account Balance : "+checking.balance);
     
 }
}


/*  Tested with Positive values
Previous Balance : 1000.0
Deposited : 200.0
Interest Added : 10.0
Savings Account Balance : 1200.0

Previous Balance : 1000.0
Deposited : 300.0
Withdraw : 100.0
Checking Account Balance : 1200.0
*/

/*  Tested with Negative values
Previous Balance : 1000.0
Deposited : 200.0
Interest Added : 10.0
Savings Account Balance : 1200.0

Error: Invalid amount
Insufficient Funds you can't withdraw
Checking Account Balance : 1000.0
*/