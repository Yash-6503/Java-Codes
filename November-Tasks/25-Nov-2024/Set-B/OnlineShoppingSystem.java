//Online Shopping System

package com.classes;

class Product
{
    protected String name;
    protected double price;

    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void displayInfo()
    {
        System.out.println("Product Name : "+name);
        System.out.println(price <= 0 ? "Invalid Input Price" : "Price : "+price);
    }    

    public void calculateTotalCost(int quantity)
    {
        if(quantity > 0 && price > 0){
            double total = price * quantity;
            System.out.println("Total Price of "+quantity+" Products is : "+total);
        }else if(quantity > 0 && price <= 0){
            System.out.println("Please Provide Valid Price to Calculate Total Price");
        }else if(price > 0 && quantity <= 0){
            System.out.println("Invalid Input Quantity");
        }else{
            System.out.println("Invalid Input Quantity and Price");
        }
    }
}

class Electronics extends Product
{
    private String brand;

    public Electronics(String name, double price, String brand)
    {
        super(name,price);
        this.brand = brand;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("\nElectronics Product Details");
        System.out.println("---------------------------------------");
        super.displayInfo();
        System.out.println("Brand : "+brand);
    }
}

class Clothing extends Product
{
    private String size;

    public Clothing(String name, double price, String size)
    {
        super(name,price);
        this.size = size;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("\nClothing Product Details");
        System.out.println("---------------------------------------");
        super.displayInfo();
        System.out.println("Size : "+size);
    }
}

public class OnlineShoppingSystem
{
    public static void main(String[] args)
    {
        Electronics ele = new Electronics("Laptop",-50000,"HP");
        Clothing clt = new Clothing("T-Shirts",-250.25,"XL");

        ele.displayInfo();
        ele.calculateTotalCost(1);

        clt.displayInfo();
        clt.calculateTotalCost(-2);
    }
}

/*  Tested with Positive Values
Electronics Product Details
---------------------------------------
Product Name : Laptop
Price : 50000.0
Brand : HP
Total Price of 1 Products is : 50000.0

Clothing Product Details
---------------------------------------
Product Name : T-Shirts
Price : 250.25
Size : XL
Total Price of 2 Products is : 500.5
*/

/*  Tested with Negative Values
Electronics Product Details
---------------------------------------
Product Name : Laptop
Invalid Input Price
Brand : HP
Please Provide Valid Price to Calculate Total Price

Clothing Product Details
---------------------------------------
Product Name : T-Shirts
Invalid Input Price
Size : XL
Invalid Input Quantity and Price
*/