//JDBC Program to perform Student Operations

import java.sql.*;
import java.sql.DriverManager;
import java.util.Scanner;

public class StudentOperations 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc;){
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NARESH","NARESH");
			
			PreparedStatement ps1 = con.prepareStatement("insert into student values(?,?,?,?,?,?,?)"); 
			PreparedStatement ps2 = con.prepareStatement("select rollno from student where rollno = ?");
			PreparedStatement ps2_1 = con.prepareStatement("select * from student where percentage > 60");
			PreparedStatement ps2_2 = con.prepareStatement("update student set mailid = ?, phoneno = ? where rollno = ?");
			PreparedStatement ps3 = con.prepareStatement("delete from student where percentage between 30 and 60");
			PreparedStatement ps4 = con.prepareStatement("select * from student where percentage > 80");
			int choice;
			
			do {
				System.out.println("\nStudent Registration & Login Process");
				System.out.println("1.Register");
				System.out.println("2.Login");
				System.out.println("3.Exit");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				switch(choice) {
					case 1:
						System.out.println("Enter rollno: ");
						int roll = sc.nextInt();
						System.out.println("Enter name: ");
						sc.nextLine();
						String name = sc.nextLine();
						System.out.println("Enter percentage: ");
						float percent = sc.nextFloat();
						System.out.println("Enter First name: ");
						sc.nextLine();
						String fname = sc.nextLine();
						System.out.println("Enter Last name: ");
						String lname = sc.nextLine();
						System.out.println("Enter mailId: ");
						String mail = sc.nextLine();
						System.out.println("Enter phone no: ");
						String phone = sc.nextLine();
						ps1.setInt(1, roll);
						ps1.setString(2, name);
						ps1.setFloat(3, percent);
						ps1.setString(4, fname);
						ps1.setString(5, lname);
						ps1.setString(6, mail);
						ps1.setString(7, phone);
						int k = ps1.executeUpdate();
						if(k>=0) {
							System.out.println("Registered successfully...");
							System.out.println("Login to continue...");
						}else {
							System.out.println("Not Registered..");
						}
						break;
						
					case 2:
						System.out.println("Enter rollno to Login: ");
						int rollNo = sc.nextInt();
						ps2.setInt(1, rollNo);
						ResultSet rs1 = ps2.executeQuery();
						if(rs1.next()) {
							if(rs1.getInt(1) == rollNo) {
								System.out.println("Login SuccessFull...");
								int option;
								do {
									System.out.println("\n--------------Student Operations----------------");
									System.out.println("1.Show Student whose percentage > 60%");
									System.out.println("2.Update MailId and Phoneno based on Rollno");
									System.out.println("3.Delete student whose percentage between 30% to 60%");
									System.out.println("4.Find how many students got more than 80%");
									System.out.println("5.Exit");
									System.out.println("Enter your choice: ");
									option = sc.nextInt();
									switch(option) {
										case 1:
											ResultSet rs2_1 = ps2_1.executeQuery();
											System.out.println("---------------Student Table---------------");
											System.out.println("Roll\tName\t\tPercent\tFname\tLname\tMailId\t\t\tPhone");
											while(rs2_1.next()) {
												System.out.println(rs2_1.getInt(1)+"\t"
														+rs2_1.getString(2)+"\t"
														+rs2_1.getFloat(3)+"\t"
														+rs2_1.getString(4)+"\t"
														+rs2_1.getString(5)+"\t"
														+rs2_1.getString(6)+"\t"
														+rs2_1.getString(7));
											}
											break;
											
										case 2:
											System.out.println("Enter new mailId: ");
											sc.nextLine();
											String mail2 = sc.nextLine();
											System.out.println("Enter new phoneno: ");
											String phone2 = sc.nextLine();
											ps2_2.setString(1, mail2);
											ps2_2.setString(2, phone2);
											ps2_2.setInt(3, rollNo);
											int up = ps2_2.executeUpdate();
											if(up > 0) {
												System.out.println("mailId & phoneNo updated successfully...");
											}else {
												System.out.println("mailId & phoneNo not updated..");
											}
											break;
											
										case 3:
											int del = ps3.executeUpdate();
											if(del > 0) {
												System.out.println("students deleted successfully....");
											}else {
												System.out.println("students not deleted..");
											}
											break;
											
										case 4:
											ResultSet rs4 = ps4.executeQuery();
											int count = 0;
											System.out.println("---------------Student Table---------------");
											System.out.println("Roll\tName\t\tPercent\tFname\tLname\tMailId\t\t\tPhone");
											while(rs4.next()) {
												System.out.println(rs4.getInt(1)+"\t"
														+rs4.getString(2)+"\t"
														+rs4.getFloat(3)+"\t"
														+rs4.getString(4)+"\t"
														+rs4.getString(5)+"\t"
														+rs4.getString(6)+"\t"
														+rs4.getString(7));
												count++;
											}
											System.out.println("Total "+count+" students got more than 80%");
											break;
											
										case 5:
											System.exit(0);
											
										default:
											System.out.println("Invalid choice");
											
									}
								}while(option != 5);
								
							}else {
								System.out.println("Invalid Rollno...");
							}
						}else {
							System.out.println("Invalid Process");
						}
						break;
						
					case 3:
						System.exit(0);
					
					default:
						System.out.println("Invalid Input");
				}
			}while(choice != 3);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
