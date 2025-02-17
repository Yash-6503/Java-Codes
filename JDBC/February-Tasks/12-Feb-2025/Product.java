/*
Program1:Write a jdbc program as follows:
Note:Create a table:-Product (U can create table from database).
              Table Columns:-productId,productName,productPrice,productQty.
Give Option to the user:
          1.Insert productdetails into product table.
          2.Retrieve productdetails in forward direction.
          3.Retrieve productdetails in reverse direction.
          4.Retrieve 3rd record from top.
          5.Retrieve 3rd record from bottom. 
          6.Retrieve last three record from product table.       
*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Product 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try(sc;) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","NARESH","NARESH");
			
			PreparedStatement ps1 = con.prepareStatement("insert into product values(?,?,?,?)");
			PreparedStatement ps2 = con.prepareStatement("select * from product",ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
			PreparedStatement ps3 = con.prepareStatement("select * from product",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			PreparedStatement ps4 = con.prepareStatement("select * from product",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			PreparedStatement ps5 = con.prepareStatement("select * from product",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			PreparedStatement ps6 = con.prepareStatement("select * from product",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			int choice;
			do {
				System.out.println("\n------------Product Table Operations---------");
				System.out.println("1.Insert productdetails into product table.");
		        System.out.println("2.Retrieve productdetails in forward direction.");
		        System.out.println("3.Retrieve productdetails in reverse direction.");
		        System.out.println("4.Retrieve 3rd record from top.");
		        System.out.println("5.Retrieve 3rd record from bottom."); 
		        System.out.println("6.Retrieve last three record from product table.");
		        System.out.println("7.Exit");
		        System.out.println("Enter your choice: ");
		        choice = sc.nextInt();
		        switch(choice) {
		        	case 1:
		        		System.out.println("Enter Product id: ");
		        		int pid = sc.nextInt();
		        		System.out.println("Enter Product name: ");
		        		sc.nextLine();
		        		String pName = sc.nextLine();
		        		System.out.println("Enter Product price: ");
		        		float pPrice = sc.nextFloat();
		        		System.out.println("Enter Product quantity: ");
		        		int pQty = sc.nextInt();
		        		ps1.setInt(1, pid);
		        		ps1.setString(2, pName);
		        		ps1.setFloat(3, pPrice);
		        		ps1.setInt(4, pQty);
		        		int ins = ps1.executeUpdate();
		        		if(ins > 0) {
		        			System.out.println("Product inserted successfully...");
		        		}else {
		        			System.out.println("Product not inserted..");
		        		}
		        		break;
		        		
		        	case 2:
		        		ResultSet rs2 = ps2.executeQuery();
		        		System.out.println("-------------Product Table Forward------------");
		        		System.out.println("Pid\tName\tPrice\t\tQty");
		        		while(rs2.next()) {
		        			System.out.println(rs2.getInt(1)+"\t"
		        					+rs2.getString(2)+"\t"
		        					+rs2.getFloat(3)+"\t"
		        					+rs2.getInt(4));
		        		}
		        		break;
		        		
		        	case 3:
		        		ResultSet rs3 = ps3.executeQuery();
		        		System.out.println("-------------Product Table Reverse------------");
		        		System.out.println("Pid\tName\tPrice\t\tQty");
		        		if(rs3.last()) {
		        			do {
		        				System.out.println(rs3.getInt(1)+"\t"
			        					+rs3.getString(2)+"\t"
			        					+rs3.getFloat(3)+"\t"
			        					+rs3.getInt(4));
		        			}while(rs3.previous());
		        		}else {
		        			System.out.println("Product details not found");
		        		}
		        		break;
		        			        		
		        	case 4:
		        		ResultSet rs4 = ps4.executeQuery();
		        		System.out.println("-------------Product Table 3rd Row from Top------------");
		        		System.out.println("Pid\tName\tPrice\t\tQty");
		        		if(rs4.absolute(3)) {
		        			   System.out.println(rs4.getInt(1)+"\t"
			        					+rs4.getString(2)+"\t"
			        					+rs4.getFloat(3)+"\t"
			        					+rs4.getInt(4));
		        			
		        		}else {
		        			System.out.println("Product details not found");
		        		}
		        		break;
		        			        		
		        	case 5:
		        		ResultSet rs5 = ps5.executeQuery();
		        		System.out.println("-------------Product Table 3rd Row from Botttom------------");
		        		System.out.println("Pid\tName\tPrice\t\tQty");
		        		if(rs5.last() && rs5.relative(-2)) {		        			
		        				System.out.println(rs5.getInt(1)+"\t"
			        					+rs5.getString(2)+"\t"
			        					+rs5.getFloat(3)+"\t"
			        					+rs5.getInt(4));
		        			
		        		}else {
		        			System.out.println("Product details not found");
		        		}
		        		break;
		        		
		        	case 6:
		        		ResultSet rs6 = ps6.executeQuery();
		        		System.out.println("-------------Product Table Last 3 Rows------------");
		        		System.out.println("Pid\tName\tPrice\t\tQty");
		        		if(rs6.last()){
		        			int count =0;
		        			do {
		        				System.out.println(rs6.getInt(1)+"\t"
			        					+rs6.getString(2)+"\t"
			        					+rs6.getFloat(3)+"\t"
			        					+rs6.getInt(4));
		        				count++;
		        			}while(rs6.previous() && count < 3);
		        			
		        		}
		        		break;
		        		
		        	case 7:
		        		System.exit(0);
		        		
		        	default:
		        		System.out.println("Invalid choice");
		        }
				
			}while(choice != 7);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
