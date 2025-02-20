/*
Write a JDBC program to retrieve empResume based on empPhNo and store that resume(file) 
at any location in your System.
*/

import java.sql.*;
import java.io.*;
import java.util.*;

public class Example2 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in);){
			FileReader reader = new FileReader("C:\\Users\\Yash Walke\\Documents\\NareshIT Java Tasks\\December_Tasks\\JDBC_Tasks\\src\\com\\jdbc\\Task6\\Db.properties");
			
			Properties p = new Properties();
			p.load(reader);
			
			String driver = p.getProperty("driver");
			String conString = p.getProperty("conString");
			String userName = p.getProperty("userName");
			String password = p.getProperty("password");
			
			Class.forName(driver);
			
			Connection con = DriverManager.getConnection(conString,userName,password);
			
			PreparedStatement ps = con.prepareStatement("select * from emp_info1 where empphno=?");
			
			System.out.println("Enter employee Phone: ");
			String empPhone = sc.nextLine();
			
			ps.setString(1, empPhone);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				Blob b = rs.getBlob(6);
				byte by[] = b.getBytes(1, (int) b.length());
				System.out.println("Enter location(path) to store employee resume file: ");
				String fpath = sc.nextLine();
				
				FileOutputStream fout = new FileOutputStream(fpath);
				fout.write(by);
				
				System.out.println("Employee Resume retrieved at location "+fpath);
				fout.close();
			}else {
				System.out.println("Employee not found..");
			}
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
Enter employee Phone: 
1234567890
Enter location(path) to store employee resume file: 
C:\Users\Yash Walke\Documents\Resume.pdf
Employee Resume retrieved at location C:\Users\Yash Walke\Documents\Resume.pdf
*/

/*
 * Enter employee Phone: 
1112
Employee not found..
*/
