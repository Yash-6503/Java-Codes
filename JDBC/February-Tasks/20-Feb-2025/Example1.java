// Write a program to get the metadata of a database using DatabaseMetaData interface.

import java.io.*;
import java.sql.*;
import java.util.*;

public class Example1 
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
			
			DatabaseMetaData dmd = con.getMetaData();
			
			System.out.println("Db product name: "+dmd.getDatabaseProductName());
			System.out.println("Db product version: "+dmd.getDatabaseProductVersion());
			System.out.println("Db driver name: "+dmd.getDriverName());
			System.out.println("Maximum columns in a table: "+dmd.getMaxColumnsInTable());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
Db product name: Oracle
Db product version: Oracle Database 21c Express Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0
Db driver name: Oracle JDBC driver
Maximum columns in a table: 1000
*/