package com.blc;

//ELC class

import java.util.*;

public class BankCustomer
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Bank Name: ");
        String bankName = sc.nextLine();

        System.out.println("Enter Customer Name: ");
        String bankCustomerName = sc.nextLine();

        System.out.println("Enter Bank Address: ");
        String bankAddress = sc.nextLine();

        System.out.println("Enter IFSC code: ");
        String bankIFSCCode = sc.nextLine();

        System.out.println("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.println("Enter Current Balance: ");
        int currentBalance = sc.nextInt();

        Customer cust = new Customer();
        cust.setDetails(bankName,bankCustomerName,bankAddress,bankIFSCCode,accountNumber,currentBalance);

        int choice;

        do
        {
            System.out.println("\nBank Operations");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Display Details");
            System.out.println("5.Exit");

            System.out.println("Enter your Choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Enter Amount to Deposit: ");
                    int deposit = sc.nextInt();
                    cust.Deposit(deposit);
                    break;

                case 2:
                    System.out.println("Enter Amount to withdraw: ");
                    int withdrawl = sc.nextInt();
                    cust.withdraw(withdrawl);
                    break;

                case 3:
                    cust.currentBalance();
                    break;

                case 4:
                    System.out.println(cust.displayDetails());
                    break;

                case 5:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 5);
    }
}
