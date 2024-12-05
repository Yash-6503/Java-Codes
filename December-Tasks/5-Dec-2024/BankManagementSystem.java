//ELC (main) class of Account, SavingsAccount and CheckingAccount classes -> BankManagementSystem.java
package pkg.blc2;

public class BankManagementSystem
{
    public static void main(String args[])
    {
        System.out.println("Savings Account Details");
        SavingsAccount sa = new SavingsAccount("1234567",5000,9.5);
        sa.generateStatement();

        System.out.println("\nChecking Account Details");
        CheckingAccount ca = new CheckingAccount("5677921",4000,3000);
        ca.generateStatement();
    }
}

/*
Savings Account Details
Account Number: 1234567
Balance: 5000.0
Interest Rate: 9.5

Checking Account Details
Account Number: 5677921
Balance: 4000.0
Overdraft Limit: 3000.0
*/