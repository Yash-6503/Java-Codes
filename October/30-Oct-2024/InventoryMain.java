//Design a inventory system for a retail store 

//ELC
public class InventoryMain
{
    public static void main(String args[])
    {
        //Test case 1
        System.out.println("\nTest Case 1");
        InventoryItem item1 = new InventoryItem("Apple",10,15);
        item1.displayItemDetails();

        //Test case 2
        System.out.println("\nTest Case 2");
        InventoryItem item2 = new InventoryItem("Oranges",-5.0,20);
        item2.displayItemDetails();

        //Test case 3
        System.out.println("\nTest Case 3");
        InventoryItem item3 = new InventoryItem("Bananas",5.0,-10);
        item3.displayItemDetails();

        //Test case 4
        System.out.println("\nTest Case 4");
        InventoryItem item4 = new InventoryItem("",8.0,10);
        item4.displayItemDetails();
    }
}

/* Test case 1
Item Name : Apple
Price per Unit : 10.0
Quantity in Stock : 15
Total Value of Apples in Stock : 150.0
*/

/* Test case 2
Item Name : Oranges
Error message indicating invalid price.
Quantity in Stock : 20
*/

/* Test case 3
Item Name : Bananas
Price per Unit : 5.0
Error message indicating invalid quantity.
*/

/* Test case 4
Error message indicating invalid item name.
Price per Unit : 8.0
Quantity in Stock : 10
*/