//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeOperations 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		try(sc;){
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NARESH","NARESH");
			
			PreparedStatement ps1 = con.prepareStatement("insert into employee_info values(?,?,?,?,?,?)");
			PreparedStatement ps2 = con.prepareStatement("select * from employee_info");
			PreparedStatement ps3 = con.prepareStatement("select * from employee_info where empname like 'S%'");
			PreparedStatement ps4 = con.prepareStatement("select * from employee_info where empsalary between 10000 and 20000");
			PreparedStatement ps5 = con.prepareStatement("update employee_info set empsalary = ? where empid = ?");
			PreparedStatement ps6 = con.prepareStatement("delete from employee_info where empsalary = (select max(empsalary) from employee_info)");
			PreparedStatement ps7 = con.prepareStatement("delete from employee_info where empname like '%a'");
			int choice;
			do {
				System.out.println("\n-----------Employee Operations-----------");
				System.out.println("1.Insert data into Employee Table.");
				System.out.println("2.Retrieve all Employee data.");
				System.out.println("3.Retrieve employee whose name stats with 'S'.");
				System.out.println("4.Retrieve employees whose salary between 10000 to 20000.");
				System.out.println("5.Update employee salary with the help of eid.");
				System.out.println("6.delete employee who is getting maximum salary.");
				System.out.println("7.delete employee whose name ends with 'a';");
				System.out.println("8.Exit.");
				System.out.println("Enter your choice: ");
				choice = sc.nextInt();
				switch(choice)
				{
					case 1:
						System.out.println("Enter employee Id: ");
						int empId = sc.nextInt();
						System.out.println("Enter employee name: ");
						sc.nextLine();
						String empName = sc.nextLine();
						System.out.println("Enter employee salary: ");
						double empSalary = sc.nextDouble();
						System.out.println("Enter employee address: ");
						sc.nextLine();
						String empAddress = sc.nextLine();
						System.out.println("Enter employee mailId: ");
						String empMail = sc.nextLine();
						System.out.println("Enter employee phoneNo: ");
						String empPhone = sc.nextLine();
						ps1.setInt(1, empId);
						ps1.setString(2, empName);
						ps1.setDouble(3, empSalary);
						ps1.setString(4, empAddress);
						ps1.setString(5, empMail);
						ps1.setString(6, empPhone);
						
						int ins = ps1.executeUpdate();
						if(ins > 0) {
							System.out.println(ins+" employee inserted successfully..");
						}else {
							System.out.println("employee not inserted..");
						}
						break;
						
					case 2:
						ResultSet rs2 = ps2.executeQuery();
						System.out.println("----------Employee_Info Table-------------");
						System.out.println("EmpId\tName\tSalary\t\tAddress\tMailId\t\tPhone");
						while(rs2.next())
						{
							System.out.println(rs2.getInt(1)+"\t"
									+rs2.getString(2)+"\t"
									+rs2.getDouble(3)+"\t"
									+rs2.getString(4)+"\t"
									+rs2.getString(5)+"\t"
									+rs2.getString(6));
							
						}
						break;
						
					case 3:
						ResultSet rs3 = ps3.executeQuery();
						System.out.println("----------Employee_Info Table-------------");
						System.out.println("EmpId\tName\t\tSalary\t\tAddress\tMailId\t\t\tPhone");
						while(rs3.next()) {
							System.out.println(rs3.getInt(1)+"\t"
									+rs3.getString(2)+"\t"
									+rs3.getDouble(3)+"\t"
									+rs3.getString(4)+"\t"
									+rs3.getString(5)+"\t"
									+rs3.getString(6));
						}
						break;
						
					case 4:
						ResultSet rs4 = ps4.executeQuery();
						System.out.println("----------Employee_Info Table-------------");
						System.out.println("EmpId\tName\t\tSalary\tAddress\tMailId\t\t\tPhone");
						while(rs4.next()) {
							System.out.println(rs4.getInt(1)+"\t"
									+rs4.getString(2)+"\t"
									+rs4.getDouble(3)+"\t"
									+rs4.getString(4)+"\t"
									+rs4.getString(5)+"\t"
									+rs4.getString(6));
						}
						break;
						
					case 5:
						System.out.println("Enter Employee Id: ");
						int eid = sc.nextInt();
						System.out.println("Enter new Salary: ");
						double esal = sc.nextDouble();
						ps5.setDouble(1, esal);
						ps5.setInt(2, eid);
						int up = ps5.executeUpdate();
						if(up > 0) {
							System.out.println("Employee salary updated successfully...");
						}else {
							System.out.println("employee salary not updated..");
						}
						break;
						
					case 6:
						int del = ps6.executeUpdate();
						if(del > 0) {
							System.out.println("Employee who is getting maximum salary is deleted successfully...");
						}else {
							System.out.println("Employee not deleted..");
						}
						break;
						
					case 7:
						int del7 = ps6.executeUpdate();
						if(del7 > 0) {
							System.out.println("Employee whose name ends with 'a' is deleted successfully...");
						}else {
							System.out.println("Employee not deleted..");
						}
						break;
						
					case 8:
						System.exit(0);
						
					default:
						System.out.println("Invalid choice");
						
				}
			}while(choice != 8);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
