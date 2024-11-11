//Q1

package com.classes;

class Product
{
    protected String name;
    protected double price;
    Product(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public void displayInfo()
    {
        System.out.println("Product Name = "+name);
        System.out.println("Product Price = "+price);
    }

    public void calculateTotalCost(int quantity, String category)
    {
        double total = quantity * price;
        System.out.println("Total of "+category+" Products");
        System.out.println("Total cost of purchased products is "+total);
        System.out.println("---------------------------------------------");
    }
}

class Electronics extends Product
{
    private String brand;
    Electronics(String name, double price, String brand)
    {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("---------------------------------------------");
        System.out.println("Electronics Product");
        super.displayInfo();
        System.out.println("Product Brand = "+brand);
    }
}

class Clothing extends Product
{
    private String size;
    Clothing(String name, double price, String size)
    {
        super(name, price);
        this.size = size;
    }

    @Override 
    public void displayInfo()
    {
        System.out.println("---------------------------------------------");
         System.out.println("Clothing Product");
        super.displayInfo();
        System.out.println("Product Size = "+size);
        System.out.println("---------------------------------------------");
    }
}

public class OnlineShopping 
{
    public static void main(String args[])
    {
        Electronics e = new Electronics("Laptop",50000.11,"HP");

        Clothing c = new Clothing("T-Shirt",250,"XL");

        System.out.println("Online Shopping");

        e.displayInfo();

        c.displayInfo();

        e.calculateTotalCost(1,"Electronics");

        c.calculateTotalCost(2,"Clothing");
    }
}

/*
Online Shopping
---------------------------------------------   
Electronics Product
Product Name = Laptop
Product Price = 50000.11
Product Brand = HP
---------------------------------------------   
Clothing Product
Product Name = T-Shirt
Product Price = 250.0
Product Size = XL
---------------------------------------------   
Total of Electronics Products
Total cost of purchased products is 50000.11    
---------------------------------------------   
Total of Clothing Products
Total cost of purchased products is 500.0       
--------------------------------------------- 
*/
