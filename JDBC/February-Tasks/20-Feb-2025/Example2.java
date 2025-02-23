// Write a program to get the column names and their data types from the student_info table.

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Properties;

public class Example2 
{
	public static void main(String[] args) 
	{
		try {
			FileReader reader = new FileReader("C:\\Users\\Yash Walke\\Documents\\NareshIT Java Tasks\\December_Tasks\\JDBC_Tasks\\src\\com\\jdbc\\Private_Details\\Db.properties");
			
			Properties p = new Properties();
			p.load(reader);
			
			String driver = p.getProperty("driver");
			String conString = p.getProperty("conString");
			String userName = p.getProperty("userName");
			String password = p.getProperty("password");
			
			Class.forName(driver);
			Connection con = DriverManager.getConnection(conString,userName,password);
			
			PreparedStatement ps = con.prepareStatement("select * from student_info");
			
			ResultSet rs = ps.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int count = rsmd.getColumnCount();
			System.out.println("Total no. of columns: "+count);
			
			for(int i=1; i<=count; i++) {				
				System.out.println("Column ("+i+") Name: "+rsmd.getColumnName(i)+"\nColumn ("+i+") datatype: "+rsmd.getColumnTypeName(i));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
Total no. of columns: 5
Column (1) Name: STUDID
Column (1) datatype: NUMBER
Column (2) Name: STUDNAME
Column (2) datatype: VARCHAR2
Column (3) Name: STUDROLLNO
Column (3) datatype: NUMBER
Column (4) Name: STUDADDRESS
Column (4) datatype: VARCHAR2
Column (5) Name: DATEOFADMISSION
Column (5) datatype: DATE
*/
