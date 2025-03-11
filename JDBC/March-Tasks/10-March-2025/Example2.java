/*
Write a Java program to perform below operations:
Note:
-create table departments.
-Table's properties: id, name, location, and manager_id.
-Insert 5 records from sql command line.

Task to perform:Retrieves id, name, location, and manager_id from an Oracle database departments table.
Establishes a JDBC connection to Oracle.
Retrieves the department details from the departments table.
Converts the ResultSet into a list of Department objects.
1.Filters departments located in a specific city (e.g., "New York").
2.Sorts the departments by name in ascending order.
3.Limits the results to the top 3 departments based on manager_id.
4.Prints the list of top 3 departments with their details.
*/

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class DepartmentTester 
{
	public static void main(String[] args) 
	{
		
		Properties p = new Properties();
		
		
		ArrayList<DepartmentClass> list = new ArrayList<>();
		
		try {
			
			FileReader reader = new FileReader("C:\\Users\\Yash Walke\\Documents\\NareshIT Java Tasks\\December_Tasks\\JDBC_Tasks\\src\\com\\jdbc\\Private_Details\\Db.properties");
			p.load(reader);
			
			String dbDriver = p.getProperty("driver") ;
			String dbUrl = p.getProperty("conString");
			String dbUser = p.getProperty("userName");
			String dbPass = p.getProperty("password");
			
			Class.forName(dbDriver);
			
			Connection con = DriverManager.getConnection(dbUrl,dbUser,dbPass);
			
			PreparedStatement ps = con.prepareStatement("select * from department");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				list.add(new DepartmentClass(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			
			System.out.println("Department Table Records");
			list.forEach(System.out::println);
			
			//1.Filters departments located in a specific city (e.g., "Hyderabad").
			List<DepartmentClass> l1 = list.stream().filter(str -> str.location.equals("Hyderabad")).collect(Collectors.toList());
			System.out.println("\n1.Filters departments located in a specific city (e.g., \"Hyderabad\").");
			l1.forEach(System.out::println);
			
			//2.Sorts the departments by name in ascending order.
			System.out.println("\n2.Sorts the departments by name in ascending order.");
			list.stream().sorted((s1,s2) -> s1.name.compareTo(s2.name)).forEach(System.out::println);;
			
			
			//3.Limits the results to the top 3 departments based on manager_id.
			System.out.println("\n3.Limits the results to the top 3 departments based on manager_id.");
			List<DepartmentClass> top3 = list.stream().sorted((s1,s2) -> s1.managerId - s2.managerId).limit(3).collect(Collectors.toList());
			
			//4.Prints the list of top 3 departments with their details.
			top3.forEach(System.out::println);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
Department Table Records
DepartmentClass [id=101, name=Sales, location=Pune, managerId=997]
DepartmentClass [id=222, name=IT, location=Mumbai, managerId=1037]
DepartmentClass [id=992, name=Software, location=Hyderabad, managerId=623]
DepartmentClass [id=199, name=VoiceProcess, location=Hyderabad, managerId=883]
DepartmentClass [id=666, name=Salesforce, location=Banglore, managerId=772]

1.Filters departments located in a specific city (e.g., "Hyderabad").
DepartmentClass [id=992, name=Software, location=Hyderabad, managerId=623]
DepartmentClass [id=199, name=VoiceProcess, location=Hyderabad, managerId=883]

2.Sorts the departments by name in ascending order.
DepartmentClass [id=222, name=IT, location=Mumbai, managerId=1037]
DepartmentClass [id=101, name=Sales, location=Pune, managerId=997]
DepartmentClass [id=666, name=Salesforce, location=Banglore, managerId=772]
DepartmentClass [id=992, name=Software, location=Hyderabad, managerId=623]
DepartmentClass [id=199, name=VoiceProcess, location=Hyderabad, managerId=883]

3.Limits the results to the top 3 departments based on manager_id.
DepartmentClass [id=992, name=Software, location=Hyderabad, managerId=623]
DepartmentClass [id=666, name=Salesforce, location=Banglore, managerId=772]
DepartmentClass [id=199, name=VoiceProcess, location=Hyderabad, managerId=883]

*/
