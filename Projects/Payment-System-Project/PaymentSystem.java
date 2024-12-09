//ELC (main) class of Payment, BankTransfer, UPIPayment, DebitCard, CreditCard -> PaymentSystem.java
//Program to create a Payment System using Inheritance, Polymorphism and Abstraction.

package pkg;

import java.util.*;

public class PaymentSystem 
{
	static double balance;
	public static void main(String[] args) 
	{
		int choice, lastFourDigits, pinNumber;
		double amount;
		
		Scanner sc = new Scanner(System.in);
		
		do 
		{
			System.out.println("\nPayment System");
			System.out.println("1.Bank Transfer");
			System.out.println("2.UPI Payment");
			System.out.println("3.Debit-Card Payment");
			System.out.println("4.Credit-Card Payment");
			System.out.println("5.Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			System.out.println("Enter money to set initial balance: ");
			balance = sc.nextDouble();
			
			switch(choice)
			{
				case 1:
					System.out.println("Enter Account Number of Reciever: ");
					int recieverAccountNo = sc.nextInt();
					System.out.println("Enter Amount to Transfer: ");
					amount = sc.nextDouble();
					
					BankTransfer bank = new BankTransfer(balance,recieverAccountNo,amount);
					acceptPayment(bank,amount);
					break;
					
				case 2:
					System.out.println("Enter UPI-ID of Reciever: ");
					sc.next();
					String upiId = sc.nextLine();
					System.out.println("Enter Amount to Pay: ");
					amount = sc.nextDouble();
					
					UPIPayment upi = new UPIPayment(balance,upiId,amount);
					acceptPayment(upi, amount);
					break;
					
				case 3:
					System.out.println("Enter Last Four Digits of Debit-Card: ");
					lastFourDigits = sc.nextInt();
					System.out.println("Enter Amount to Pay: ");
					amount = sc.nextDouble();
					System.out.println("Enter Debit-Card Pin Number: ");
					pinNumber = sc.nextInt();
					
					DebitCard debit = new DebitCard(balance,lastFourDigits,pinNumber,amount);
					acceptPayment(debit, amount);
					break;
					
				case 4:
					System.out.println("Enter Last Four Digits of Credit-Card: ");
					lastFourDigits = sc.nextInt();
					System.out.println("Enter Amount to Pay: ");
					amount = sc.nextDouble();
					System.out.println("Enter Credit-Card Pin Number: ");
					pinNumber = sc.nextInt();
					
					CreditCard credit = new CreditCard(balance,lastFourDigits,pinNumber,amount);
					acceptPayment(credit, amount);
					break;
					
				case 5:
					System.exit(0);
				
				default :
					System.out.println("Invalid Choice");
			}
		}while(choice != 5);
	}
	
	public static void acceptPayment(Payment payments, double amount)
	{
		payments.makePayment(amount);
		System.out.println(payments.showBalance());
	}

}
