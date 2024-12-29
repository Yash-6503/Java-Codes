/*
Program to Create an abstract class named BankAccount with inherits SavingsAccount class to perform 
banking operations.
*/

import java.util.*;

abstract class BankAccount
{
    String accountHolder;
    double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract String displayAccountInfo();
    abstract String displayBalance();

    public BankAccount(String accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount
{
    double interestRate;

    public SavingsAccount(String accountHolder, double balance, double interestRate)
    {
        super(accountHolder,balance);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Invalid Input");
        }
    }

    @Override
    public void withdraw(double amount){
        if(balance > amount && amount > 0){
            balance -= amount;
        }else{
            System.out.println("Invalid Input");
        }
    }

    @Override
    public String displayAccountInfo(){
        return "SavingsAccount Details\nAccount Holder : "+accountHolder+"\nBalance : "+balance+"\nInterest Rate : "+interestRate;
    }

    @Override
    public String displayBalance(){
        return "Your Balance is : "+balance;
    }
}

public class Example2
{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount("Virat Kohli",2000,5.5);

        System.out.println(savings.displayAccountInfo());

        System.out.println("\nEnter Amount to Deposit: ");
        double deposit = sc.nextDouble();
        savings.deposit(deposit);
        System.out.println("After deposit "+savings.displayBalance());

        System.out.println("\nEnter Amount to Withdraw: ");
        double withdraw = sc.nextDouble();
        savings.withdraw(withdraw);
        System.out.println("After withdrawl "+savings.displayBalance());

    }
}

/*
SavingsAccount Details
Account Holder : Virat Kohli
Balance : 2000.0
Interest Rate : 5.5

Enter Amount to Deposit: 
3000
After deposit Your Balance is : 5000.0

Enter Amount to Withdraw: 
2000
After withdrawl Your Balance is : 3000.0
*/