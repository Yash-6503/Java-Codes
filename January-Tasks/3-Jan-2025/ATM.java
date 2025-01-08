/*
Develop a Java program for a bank application that performs deposit, withdrawal, transfer, loan application, 
and balance check operations with proper input validation and error handling. The program should utilize a 
Bank interface, BankAccount and Customer classes, and an ATM class to demonstrate the application's functionality. 
Use custom exceptions, switch-case statements, try-with-resources, and multi-catch blocks for error handling.
*/

//ELC (main) class of the program -> ATM.java

package pkg;

import java.util.Scanner;

public class ATM 
{
	public static void main(String[] args) throws InsufficientFundsException, AccountNotFoundException 
	{
		Scanner sc = new Scanner(System.in);
		double amount;
		
		BankAccount bankAcc1 = new BankAccount(123648199,5000);
		BankAccount bankAcc2 = new BankAccount(99172901,3000);
		
		Customer customer = new Customer("Yash",bankAcc1);
		
		
		System.out.println("ATM Operations");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Transfer");
		System.out.println("4. Loan Application");
		System.out.println("5. Check Balance");
		System.out.println("6. Exit");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();	
		switch(choice)
		{
			case 1:
				try {
					System.out.println("Enter Amount to Deposit: ");
					amount = sc.nextDouble();
					customer.getAccount().deposit(amount);
					System.out.println("Your Balance is: "+customer.getAccount().getBalance());
				}catch(InvalidAmountException e) {
					System.out.println(e);
				}
				break;
				
			case 2:
				try {
					System.out.println("Enter Amount to Withdraw: ");
					amount = sc.nextDouble();
					customer.getAccount().withdraw(amount);
					System.out.println("Your Balance is: "+customer.getAccount().getBalance());
				}catch(InvalidAmountException e) {
					System.out.println(e);
				}catch(InsufficientFundsException e) {
					System.out.println(e);
				}
				break;
				
			case 3:
				try {
					sc.nextLine();
					System.out.println("Enter Recievers Bank Name: ");
					String name = sc.nextLine();
					System.out.println("Enter Amount to Transfer: ");
					amount = sc.nextDouble();
					if(name.equalsIgnoreCase("null")) {
						customer.getAccount().transfer(null, amount);
					}else {
						customer.getAccount().transfer(bankAcc2, amount);
					}
					System.out.println("Your Balance is: "+customer.getAccount().getBalance());
						
					System.out.println("Reciever's Account Balance is: "+bankAcc2.getBalance());
					
					
				}catch(InvalidAmountException e) {
					System.out.println(e);
				}catch(AccountNotFoundException e) {
					System.out.println(e);
				}catch(InsufficientFundsException e) {
					System.out.println(e);
				}
				break;
				
			case 4:
				try {
					System.out.println("Enter loan Amount to apply: ");
					amount = sc.nextDouble();
					customer.getAccount().applyForLoan(amount);
					System.out.println("Loan Approved");
					System.out.println("Your Balance is: "+customer.getAccount().getBalance());
				}catch(InvalidAmountException e) {
					System.out.println(e);
				}catch(LoanNotAllowedException e) {
					System.out.println(e);
				}
				break;
				
			case 5:
				System.out.println("Your Balance is: "+customer.getAccount().getBalance());
				break;
				
			case 6:
				System.exit(0);
				
			default:
				System.out.println("Invalid Choice");
		}	
	}
}

//Deposit Operation with Test cases
/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
1
Enter Amount to Deposit: 
1000
Your Balance is: 6000.0
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
1
Enter Amount to Deposit: 
-500
com.Jan_3_Tasks.InvalidAmountException: Invalid Amount for deposit
*/

//Withdraw Operation with Test cases
/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
2
Enter Amount to Withdraw: 
1000
Your Balance is: 4000.0
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
2
Enter Amount to Withdraw: 
10000
com.Jan_3_Tasks.InsufficientFundsException: Insufficient funds to withdraw
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
2
Enter Amount to Withdraw: 
-1000
com.Jan_3_Tasks.InvalidAmountException: Amount is Invalid
*/

//Transfer Operation with Test cases
/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
3
Enter Recievers Bank Name: 
SBI
Enter Amount to Transfer: 
1000
Your Balance is: 4000.0
Reciever's Account Balance is: 4000.0
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
3
Enter Recievers Bank Name: 
null
Enter Amount to Transfer: 
1000
com.Jan_3_Tasks.AccountNotFoundException: Account not Found
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
3
Enter Recievers Bank Name: 
SBI
Enter Amount to Transfer: 
-1000
com.Jan_3_Tasks.InvalidAmountException: Amount is Invalid
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
3
Enter Recievers Bank Name: 
SBI
Enter Amount to Transfer: 
10000
com.Jan_3_Tasks.InsufficientFundsException: Insufficient funds to withdraw
*/

//Loan Application Operation with Test cases
/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
4
Enter loan Amount to apply: 
30000
Loan Approved
Your Balance is: 35000.0
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
4
Enter loan Amount to apply: 
60000
com.Jan_3_Tasks.LoanNotAllowedException: Exceeds Loan Limit 
*/

/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
4
Enter loan Amount to apply: 
-10000
com.Jan_3_Tasks.InvalidAmountException: Invalid Amount
*/

//Check Balance Operation
/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
5
Your Balance is: 5000.0
*/

//Tested with invalid option
/*
ATM Operations
1. Deposit
2. Withdraw
3. Transfer
4. Loan Application
5. Check Balance
6. Exit
Enter your choice: 
8
Invalid Choice
*/
