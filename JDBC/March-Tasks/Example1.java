/*
You are given a task to retrieve data from an Oracle database table orders with the columns: 
order_id, customer_name, order_date, and total_amount.

Establish a JDBC connection to Oracle.
Execute a query to retrieve order_id, customer_name, order_date, and total_amount from the orders table.
Convert the ResultSet into a list of Order objects.  (2 marks)
->Filter the orders where the total_amount is greater than 1000. (2 marks)
->Sort the orders by order_id in ascending order. (2 marks)
->Group the orders by customer_name. (2 marks)
->Print the grouped orders, showing each customer’s name and the order details. 
*/

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

public class CustomerOrders 
{
	public static void main(String[] args) 
	{
		try {
			FileReader reader = new FileReader("C:\\Users\\Yash Walke\\Documents\\NareshIT Java Tasks\\December_Tasks\\JDBC_Tasks\\src\\com\\jdbc\\Private_Details\\Db.properties");
			
			Properties p = new Properties();
			p.load(reader);
			
			String dbDriver = p.getProperty("driver");
			String dbUrl = p.getProperty("conString");
			String dbUser = p.getProperty("userName");
			String dbPass = p.getProperty("password");
			
			Class.forName(dbDriver);
			
			Connection con = DriverManager.getConnection(dbUrl,dbUser,dbPass);
			
			PreparedStatement ps = con.prepareStatement("select * from orders");
			
			ResultSet rs = ps.executeQuery();
			
			List<OrderClass> list = new ArrayList<>();
			
			while(rs.next()) {
				list.add(new OrderClass(rs.getInt(1),rs.getString(2),rs.getDate(3),rs.getDouble(4)));
			}
			
			System.out.println("Orders from Order Table");
			list.forEach(System.out::println);
			
			//Filter the orders where the total_amount is greater than 1000
			List<OrderClass> l1 = list.stream().filter(str -> str.totalAmount > 1000).collect(Collectors.toList());
			System.out.println("\nFiltered orders where the total_amount is greater than 1000");
			l1.forEach(System.out::println);
			
			//Sort the orders by order_id in ascending order.
			List<OrderClass> l2 = list.stream().sorted((o1,o2) -> o1.orderId-o2.orderId ).collect(Collectors.toList());
			System.out.println("\nSorted orders by order_id in ascending order.");
			l2.forEach(System.out::println);
			
			//Group the orders by customer_name
			System.out.println("\nGrouped the orders by customer_name");
//			list.stream().map(str -> str.custName+" "+str).forEach(System.out::println);
			Map<String, List<OrderClass>> l3 = list.stream().collect(Collectors.groupingBy(OrderClass::getCustName));
			
			//Print the grouped orders, showing each customer’s name and the order details. 
			System.out.println("\nGroup the orders by customer_name and print order details");
			l3.forEach((k,v) -> System.out.println(k+" "+v));
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

/*
Orders from Order Table
OrderClass [orderId=111, custName=Virat Kohli, date=2020-10-10, totalAmount=2000.32]
OrderClass [orderId=264, custName=Rohit Sharma, date=2020-05-22, totalAmount=5022.52]
OrderClass [orderId=183, custName=MS Dhoni, date=2020-07-15, totalAmount=400.32]

Filtered orders where the total_amount is greater than 1000
OrderClass [orderId=111, custName=Virat Kohli, date=2020-10-10, totalAmount=2000.32]
OrderClass [orderId=264, custName=Rohit Sharma, date=2020-05-22, totalAmount=5022.52]

Sorted orders by order_id in ascending order.
OrderClass [orderId=111, custName=Virat Kohli, date=2020-10-10, totalAmount=2000.32]
OrderClass [orderId=183, custName=MS Dhoni, date=2020-07-15, totalAmount=400.32]
OrderClass [orderId=264, custName=Rohit Sharma, date=2020-05-22, totalAmount=5022.52]

Grouped the orders by customer_name

Group the orders by customer_name and print order details
Virat Kohli [OrderClass [orderId=111, custName=Virat Kohli, date=2020-10-10, totalAmount=2000.32]]
MS Dhoni [OrderClass [orderId=183, custName=MS Dhoni, date=2020-07-15, totalAmount=400.32]]
Rohit Sharma [OrderClass [orderId=264, custName=Rohit Sharma, date=2020-05-22, totalAmount=5022.52]]
*/
