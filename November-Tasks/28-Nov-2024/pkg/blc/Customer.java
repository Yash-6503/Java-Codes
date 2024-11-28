//BLC class Customer

package pkg.blc;

public class Customer
{
    private int customerId;
    private String customerName;
    private String customerAddress;
    private Order order; 

    public Customer(int customerId, String customerName, String customerAddress, Order order)
    {
        if(customerId <= 0){
            System.out.println("Error Invalid Input Customer Id");
            return;
        }else{
            this.customerId = customerId;
            this.customerName = customerName;
            this.customerAddress = customerAddress;
            this.order = order;
        }
    }

    @Override
    public String toString()
    {
        return "Customer Id : "+customerId+", Name : "+customerName+", Address : "+customerAddress+", "+order;
    }
}