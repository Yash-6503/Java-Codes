//BLC

public class InventoryItem
{
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;

    public InventoryItem(String itemName, double pricePerUnit, int quantityInStock)
    {
        this.itemName = itemName;
        this.pricePerUnit = pricePerUnit;
        this.quantityInStock = quantityInStock;
    }

    public String getItemName(){
        if(itemName.equals("")){
            return "-1";
        }else{
            return itemName;
        }
    }

    public double getPricePerUnit(){
        if(pricePerUnit > 0){
            return pricePerUnit;
        }else{
            return -1;
        }
    }

    public int getQuantityInStock(){
        if(quantityInStock > 0){
            return quantityInStock;
        }else{
            return -1;
        }
    }

    public double calculateTotalValue()
    {
        if(getPricePerUnit() != -1 && getQuantityInStock() != -1){
            return getPricePerUnit() * getQuantityInStock();
        }else{
            return 0;
        }
    }

    public void displayItemDetails()
    {
        System.out.println(getItemName().equals("-1") ? "Error message indicating invalid item name." : "Item Name : "+getItemName());
        System.out.println(getPricePerUnit() == -1 ? "Error message indicating invalid price." : "Price per Unit : "+getPricePerUnit());
        System.out.println(getQuantityInStock() == -1 ? "Error message indicating invalid quantity." : "Quantity in Stock : "+getQuantityInStock());
        System.out.println(calculateTotalValue() == 0 || getItemName().equals("-1") ? "" : "Total Value of "+ getItemName() +" in Stock : "+calculateTotalValue());
    }
}