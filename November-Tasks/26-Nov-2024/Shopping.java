//ELC class of Shopping

package pkg.blc;

public class Shopping
{
    public static void main(String args[])
    {
        Order order = new Order("123456","Laptop");
        Customer cust = new Customer("James Bond","jamesbond07@gmail.com",order);

        System.out.println(cust);
    }
}

/*
Customer Name : James Bond, Email : jamesbond07@gmail.com, Order Id : 123456, Product Name : Laptop
*/