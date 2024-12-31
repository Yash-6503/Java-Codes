/*
Program that validates and processes financial transaction data entered by a user. 
Use a multi-catch block to handle exceptions related to input validation and processing.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

class FinancialTransaction
{
	public void processTransaction(double amount, long accountNumber)
	{
		try {
			if(amount < 0 || accountNumber < 0) {
				throw new NumberFormatException();
			}
			else {
				System.out.println("Processing transaction...");
				System.out.println("Transaction successful: Amount Rs."+amount+" transferred to account "+accountNumber);
			}
		}catch(NumberFormatException num) {
			System.out.println(num);
			System.out.println("Error processing transaction: Transaction amount must be positive.");
		}catch(IllegalArgumentException illegal) {
			System.out.println(illegal);
			System.out.println("Invalid input: Please enter a valid number for transaction amount.");
		}
	}
}

public class Transcation 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		FinancialTransaction ft = new FinancialTransaction();
		
		try {
			System.out.println("Enter Transaction Amount: ");
			double amount = sc.nextDouble();
			
			System.out.println("Enter Account Number: ");
			long accountNumber = sc.nextLong();
			
			ft.processTransaction(amount,accountNumber);
		}catch(InputMismatchException e) {
			System.out.println("Invalid input: Please enter a valid number for transaction amount.");
		}
		
	}

}

/*
Enter Transaction Amount: 
500
Enter Account Number: 
123456789
Processing transaction...
Transaction successful: Amount Rs.500.0 transferred to account 123456789
*/

/*
Enter Transaction Amount: 
-100
Enter Account Number: 
12435679
java.lang.NumberFormatException
Error processing transaction: Transaction amount must be positive.
*/

/*
Enter Transaction Amount: 
abc
Invalid input: Please enter a valid number for transaction amount.
*/