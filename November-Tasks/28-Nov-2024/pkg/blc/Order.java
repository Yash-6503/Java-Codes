//BLC class Order

package pkg.blc;

public class Order
{
    private int orderId;
    private String itemName;
    private double itemPrice;   

    public Order(int orderId, String itemName, double itemPrice)
    {
        if(orderId <= 0 && itemPrice <= 0){
            System.out.println("Error Invalid Input Order Id and Item Price");
            return;
        }else if(orderId > 0 && itemPrice <= 0){
            System.out.println("Error Invalid Input Item Price");
            return;
        }else if(itemPrice > 0 && orderId <= 0){
            System.out.println("Error Invalid Input Order Id");
            return;
        }else{
            this.orderId = orderId;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }
    }

    @Override
    public String toString()
    {
        return "Order Id : "+orderId+", Item Name : "+itemName+", Item Price : "+itemPrice;
    }
}