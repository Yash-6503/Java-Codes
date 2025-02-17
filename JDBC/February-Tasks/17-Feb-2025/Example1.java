//Java program named CallableStatementExample that connects to a Oracle database using JDBC.

import java.sql.*;

public class Example1 
{
	public static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String UserName = "NARESH";
	public static final String UserPassword = "NARESH";
	
	public static Connection con;
	
	public static void connect() throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection(URL,UserName,UserPassword);
		
		System.out.println("Connected to Database Successfully...");
		
	}
	
	public static void callFunction() throws Exception 
	{
		CallableStatement cs = null;
		
		String sql = "{? = call TotalEmployee()}";
		
		cs = con.prepareCall(sql);
		
		cs.registerOutParameter(1, Types.INTEGER);
		
		cs.execute();
		
		int totalEmp = cs.getInt(1);
		
		System.out.println("Total Employees : "+totalEmp);
		
		cs.close();

        System.out.println("CallableStatement is closed");
	}
	
	public static void main(String[] args) 
	{
		try {
			//connection to db
			connect();
			
			//call function
			callFunction();
			
			con.close();
			System.out.println("Connection is closed");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

/*
Connected to Database Successfully...
Total Employees : 5
CallableStatement is closed
Connection is closed
*/