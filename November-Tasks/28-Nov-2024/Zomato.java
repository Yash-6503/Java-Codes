//ELC class Zomato (main class)

package pkg.blc;

public class Zomato
{
    public static void main(String args[])
    {
        Order order = new Order(101,"Biryani",300);
        Customer cust = new Customer(1010,"Virat Kohli","Hyderabad",order);

        System.out.println(cust);
    }
}

/*  Tested with positive values
Customer Id : 1010, Name : Virat Kohli, Address : Hyderabad, Order Id : 101, Item Name : Biryani, Item Price : 300.0
*/

/*  Tested with negative values
Error Invalid Input Order Id and Item Price
Customer Id : 1010, Name : Virat Kohli, Address : Hyderabad, Order Id : 0, Item Name : null, Item Price : 0.0
*/

/*  Tested with negative values
Error Invalid Input Order Id and Item Price
Error Invalid Input Customer Id
Customer Id : 0, Name : null, Address : null, null
*/