//jdbc program to transfer money from one account to another account using transaction management

import java.util.Scanner;
import java.sql.*;

class InvalidAccountException extends Exception
{
	public InvalidAccountException() {
		super();
	}
	
	public InvalidAccountException(String message) {
		super(message);
	}
}

class InvalidAmountException extends RuntimeException
{
	public InvalidAmountException() {
		super();
	}
	
	public InvalidAmountException(String message) {
		super(message);
	}
}

class InsufficientFundsException extends RuntimeException
{
	public InsufficientFundsException() {
		super();
	}
	
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class MoneyTransfer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NARESH","NARESH");
			
			PreparedStatement ps1 = con.prepareStatement("select * from bank71 where accno=?");
			PreparedStatement ps2 = con.prepareStatement("update bank71 set balance=balance+? where accno=?");
			PreparedStatement ps3 = con.prepareStatement("select balance from bank71 where accno=?");
			
			//commit status
//			System.out.println("Commit status: "+con.getAutoCommit());
			//set commit status
			con.setAutoCommit(false);
//			System.out.println("Commit status: "+con.getAutoCommit());
			//Savepoint
			Savepoint sp = con.setSavepoint();
			
			int choice;
			do {
				System.out.println("\n---------Transaction System--------");
				System.out.println("1.Transfer Money");
				System.out.println("2.Check Balance");
				System.out.println("3.Exit");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				switch(choice) {
					case 1:
						//Enter details for transfer
						System.out.println("Enter your Account No: ");
						long hAccNo = sc.nextLong();
						ps1.setLong(1, hAccNo);
						ResultSet rs1 = ps1.executeQuery();
						if(rs1.next()) {
							float bal = rs1.getFloat(3);
							System.out.println("Enter beneficiary account No: ");
							long bAccNo = sc.nextLong();
							ps1.setLong(1, bAccNo);
							ResultSet rs2 = ps1.executeQuery();
							if(rs2.next()) {
								System.out.println("Enter amount to transfer: ");
								float amt = sc.nextFloat();
								if(amt > 0 && amt <= bal) {
									ps2.setFloat(1, -amt);
									ps2.setLong(2, hAccNo);
									int p1 = ps2.executeUpdate();
									
									ps2.setFloat(1, +amt);
									ps2.setLong(2, bAccNo);
									int p2 = ps2.executeUpdate();
									
									if(p1 == p2) {
										con.commit();
										System.out.println("Transaction Succesfull...");
									}else {
										con.rollback(sp);
										System.out.println("Transaction Failed...");
									}
									
								}else if(amt <= 0) {
									throw new InvalidAmountException("Invalid Amount");
								}else {
									throw new InsufficientFundsException("Insufficient funds...");
								}
							}else {
								throw new InvalidAccountException("Invalid Beneficiary Account Number");
							}
						}else {
							throw new InvalidAccountException("Invalid Your Account Number");
						}		
						break;
						
					case 2:
						System.out.println("Enter your Account No: ");
						long accNo = sc.nextLong();
						ps3.setLong(1, accNo);
						ResultSet rs_2 = ps3.executeQuery();
						if(rs_2.next()) {
							float balance = rs_2.getFloat("balance"); // Ensure the correct column name
						    System.out.println("Balance: Rs " + balance);
//							System.out.println("Balance: Rs."+rs_2.getFloat(3));
						}else {
							throw new InvalidAccountException("Invalid Account Number");
						}
						break;
						
					case 3:
						System.out.println("Exiting Transaction.....");
						System.exit(0);
					
					default:
						System.out.println("Invalid choice");
				}
				
				
			}while(choice != 3);
			
		}catch(InvalidAccountException | InvalidAmountException | InsufficientFundsException e) {
			System.out.println(e.getMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/* Proper execution 
---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
1
Enter your Account No: 
5123456
Enter beneficiary account No: 
6123456
Enter amount to transfer: 
5000
Transaction Succesfull...

---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
2
Enter your Account No: 
5123456
Balance: Rs 15000.11

---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
2
Enter your Account No: 
6123456
Balance: Rs 10500.66

---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
3
Exiting Transaction.....
*/

/* execution with errors

---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
1
Enter your Account No: 
1233
Invalid Your Account Number


---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
1
Enter your Account No: 
6123456
Enter beneficiary account No: 
1234
Invalid Beneficiary Account Number


---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
1
Enter your Account No: 
6123456
Enter beneficiary account No: 
5123456
Enter amount to transfer: 
-1001
Invalid Amount


---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
1
Enter your Account No: 
6123456
Enter beneficiary account No: 
5123456
Enter amount to transfer: 
20000
Insufficient funds...


---------Transaction System--------
1.Transfer Money
2.Check Balance
3.Exit
Enter your choice: 
2
Enter your Account No: 
1113
Invalid Account Number

*/
