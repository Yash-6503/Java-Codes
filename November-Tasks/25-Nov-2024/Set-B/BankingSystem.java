//Banking System

package com.classes;

class BankAccount
{
    int accountNumber;
    double balance;

    public BankAccount(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        
    }

    public void deposite(double amount)
    {
        if(amount > 0 && balance >= 1000){
            balance += amount;
            System.out.println("Deposited Succesfully");
            System.out.println("Account Balance is : "+balance);
        }else if(amount > 0 && balance <= 0){
            System.out.println("Invalid Input Balance");
        }else if(balance > 0 && amount <= 0){
            System.out.println("Invalid Input Amount");
        }else if(balance <= 1000 && balance > 0){
            System.out.println("Maintain Minimum Balance 1000");
        }
        else{
            System.out.println("Invalid Input Amount and Balance");
        }
    }

    public void withdraw(double amount)
    {
        if(balance >= 1000 && amount > 0 && (balance - amount) >= 1000){
            balance -= amount;
        }else{
            System.out.println("Insufficient Funds");
        }
    }
}

class SavingAccount extends BankAccount
{
    double interestRate;

    public SavingAccount(int accountNumber, double balance, double interestRate)
    {
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }

    public void addInterest()
    {
        if(interestRate > 0 && balance >= 1000 && !(balance <= 0) && accountNumber > 0){
            double total = (balance / 100) * interestRate;
            System.out.println("Total Interest Rate on Balance is : "+total);
            System.out.println("Total Balance after adding Interest : "+(total+balance));
        }else if(interestRate > 0 && accountNumber > 0 &&  balance <= 0){
            System.out.println("Invalid Input Balance");
        }else if(balance > 0 && accountNumber > 0 && interestRate <= 0){
            System.out.println("Invalid Input Interest Rate");
        }else if(accountNumber <= 0 && interestRate > 0 && balance > 0){
            System.out.println("Invalid Input Account Number");
        }else if(balance <= 0 && accountNumber <= 0 && interestRate > 0){
            System.out.println("Invalid Input Account Number and Balance");
        }else if(balance <= 0 && interestRate <= 0 && accountNumber > 0){
            System.out.println("Invalid Input Balance and Interest Rate");
        }else if(interestRate <= 0 && accountNumber <= 0 && balance > 0){
            System.out.println("Invalid Input Account Number and Interest Rate");
        }else if(balance <= 1000 && balance > 0){
            System.out.println("Maintain Minimum Balance 1000");
        }else{
            System.out.println("Invalid Input Account Number, Balance and Interest Rate");
        }
    }
}

class CheckingAccount extends BankAccount
{
    double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance, double overdraftLimit)
    {
        super(accountNumber,balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw(double amount)
    {
        if(balance >= overdraftLimit && amount > 0)
        {
            if((balance - amount) >= overdraftLimit){
                balance -= amount;
                System.out.println(accountNumber <= 0 ? "Invalid Input Account Number" : "Transaction Succesfull \nAccount Balance is : "+balance);
            }else{
                System.out.println("Exceeds Overdraft Limit");
            }
        }
        else if(overdraftLimit > 0 && balance > 0 && amount <= 0) {
            System.out.println(accountNumber <= 0 ? "Invalid Input Account Number and Amount" : "Invalid Input Amount");
        }else if(amount > 0 && balance> 0 && overdraftLimit <= 0){
            System.out.println(accountNumber <= 0 ? "Invalid Input Account Number and Overdraft Limit" : "Invalid Input Overdraft Limit");
        }else if(amount > 0 && overdraftLimit > 0 && balance <= 0){
            System.out.println(accountNumber <= 0 ? "Invalid Input Account Number and Balance" : "Invalid Input Balance");
        }else if(overdraftLimit <= 0 && amount <= 0 && balance > 0){
            System.out.println(accountNumber <= 0 ? "Invalid Input Account Number, Overdraft Limit and Amount" : "Invalid Input Overdraft Limit and Amount");
        }else if(overdraftLimit <= 0 && amount > 0 && balance <= 0){
            System.out.println(accountNumber <= 0 ? "Invalid Input Account Number, Overdraft Limit and Balance" : "Invalid Input Overdraft Limit and Balance");
        }else if(overdraftLimit > 0 && amount <= 0 && balance <= 0){
            System.out.println(accountNumber <= 0 ? "Invalid Input Account Number, Balance and Amount" : "Invalid Input Balance and Amount");
        }else if(overdraftLimit <= 0 && amount <= 0 && balance <= 0){
            System.out.println(accountNumber <= 0 ? "Invalid Input Account Number, Balance, Overdraft Limit and Amount" : "Invalid Input Balance, Overdraft Limit and Amount");
        }else{
            System.out.println("Exceeds Overdraft Limit");
        }
    }
}

public class BankingSystem
{
    public static void main(String args[])
    {
        SavingAccount sa = new SavingAccount(8383220,1000,5.5);
        CheckingAccount ca = new CheckingAccount(9926788,5000,3000);

        System.out.println("\nSaving Account Operations");
        System.out.println("Account No. : "+sa.accountNumber);
        System.out.println("Balance : "+sa.balance);
        System.out.println("Interest Rate : "+sa.interestRate);
        sa.addInterest();

        System.out.println("\nChecking Account Operations");
        System.out.println("Account No. : "+ca.accountNumber);
        System.out.println("Balance : "+ca.balance);
        System.out.println("Overdraft Limit : "+ca.overdraftLimit);
        ca.withdraw(2000);
    }
}

/*  Tested with Positive Values
Saving Account Operations
Account No. : 8383220
Balance : 500.0
Interest Rate : 5.5
Total Interest Rate on Balance is : 27.5
Total Balance after adding Interest : 527.5

Checking Account Operations
Account No. : 9926788
Balance : 4000.0
Overdraft Limit : 3000.0
Transaction Succesfull
Account Balance is : 3000.0
*/

/*  Tested with Negative Values
Saving Account Operations
Account No. : -8383220
Balance : -1000.0
Interest Rate : -5.5
Invalid Input Account Number, Balance and Interest Rate

Checking Account Operations
Account No. : 9926788
Balance : 4000.0
Overdraft Limit : 3000.0
Transaction Succesfull 
Account Balance is : 3000.0
*/

/*  Tested with Negative Values
Saving Account Operations
Account No. : 8383220
Balance : 1000.0
Interest Rate : 5.5
Total Interest Rate on Balance is : 55.0
Total Balance after adding Interest : 1055.0

Checking Account Operations
Account No. : -9926788
Balance : 4000.0
Overdraft Limit : -3000.0
Invalid Input Account Number, Overdraft Limit and Amount
*/