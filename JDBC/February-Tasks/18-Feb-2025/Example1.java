//Write a JDBC program to insert employee details into database table.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

public class Example1 
{
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;) {
            //reading properties file to get db details
            //properties file is in different location
			FileReader reader = new FileReader("C:\\Users\\Yash Walke\\Documents\\NareshIT Java Tasks\\December_Tasks\\JDBC_Tasks\\src\\com\\jdbc\\Task6\\Db.properties");
			
			Properties p = new Properties();
			p.load(reader);
			
			String driver = p.getProperty("driver");
			String connString = p.getProperty("conString");
			String username = p.getProperty("userName");
			String password = p.getProperty("password");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(connString,username,password);
			
			PreparedStatement ps = con.prepareStatement("insert into emp_info1 values(?,?,?,?,?,?)");
			
			System.out.println("Enter employee id: ");
			int empId = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter employee Name");
			String empName = sc.nextLine();
			
			System.out.println("Enter employee Address: ");
			String empAddress = sc.nextLine();
			
			System.out.println("Enter employee emailId: ");
			String empMail = sc.nextLine();
			
			System.out.println("Enter employee Phone: ");
			String empPhone = sc.nextLine();
			
			System.out.println("Enter location(path) of resume file: ");
			String path = sc.nextLine();
			
			File file = new File(path);
			if(file.exists()) {
				FileInputStream fis = new FileInputStream(path);
				ps.setInt(1, empId);
				ps.setString(2, empName);
				ps.setString(3, empAddress);
				ps.setString(4, empMail);
				ps.setString(5, empPhone);
				ps.setBinaryStream(6, fis, file.length());
				int k = ps.executeUpdate();
				if(k > 0) {
					System.out.println("Employee Details inserted successfully...");
				}else {
					System.out.println("Employee details not inserted..");
				}
			}else {
				System.out.println("File not found");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
Enter employee id: 
111
Enter employee Name
Virat
Enter employee Address: 
Delhi
Enter employee emailId: 
virat@gmail.com
Enter employee Phone: 
1234567890
Enter location(path) of resume file: 
C:\Users\Yash Walke\Desktop\YashWalke_Resume.pdf
Employee Details inserted successfully...
*/
