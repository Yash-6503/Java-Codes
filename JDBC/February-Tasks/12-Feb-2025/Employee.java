
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

class emp
{
	
	int id;
	String name;
	int age;
	double salary;
	
	public emp(int id, String name, int age, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	  @Override
	    public String toString() {
	        return id + "\t" + name + "\t" + age + "\t" + salary;
	    }
	
}

public class Employee 
{
	public static void main(String[] args) 
	{
		List<emp> empList = new ArrayList<>(); 

		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NARESH","NARESH");
			
			PreparedStatement ps1 = con.prepareStatement("select * from employee");
			
//			PreparedStatement ps2
			ResultSet rs = ps1.executeQuery();
			
			while(rs.next()) {
				empList.add(new emp(
							rs.getInt("id"),
							rs.getString("name"),
							rs.getInt("age"),
							rs.getDouble("salary")
						));
			}
			
			System.out.println("Original Employee table:");
			System.out.println("eid\tname\tage\tsalary");
			empList.forEach(System.out::println);
			
			System.out.println("\nEmployee older than 25:");
			System.out.println("eid\tname\tage\tsalary");
			for(emp e : empList) {
				if(e.age > 25) {
					System.out.println(e);
				}
			}
			
			
			System.out.println("\nEmployee younger than 25:");
			System.out.println("eid\tname\tage\tsalary");
          empList.stream().filter(emp -> emp.age < 25).forEach(System.out::println);

			
			//stream api concept			
//            empList.stream().filter(emp -> emp.age > 25).forEach(System.out::println);

			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
