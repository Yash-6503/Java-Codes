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
		return;
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
		super.displayInfo();
		System.out.println("Brand : "+brand);
	}
	
	@Override
	public void calculateTotalCost(int quantity)
	{
		double total = price * quantity;
		if(quantity > 0) {
			System.out.println("Quantity : "+quantity);
			System.out.println("Total Price of "+quantity+" "+name+" is : "+total);
		}else {
			System.out.println("Invalid Input Quantity");
		}
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
		super.displayInfo();
		System.out.println("Size : "+size);
	}
	
	@Override
	public void calculateTotalCost(int quantity)
	{
		double total = price * quantity;
		if(quantity > 0) {
			System.out.println("Quantity : "+quantity);
			System.out.println("Total Price of "+quantity+" "+name+" is : "+total);
		}else {
			System.out.println("Invalid Input Quantity");
		}
	}
}

public class OnlineShoppingSystem {

	public static void main(String[] args) 
	{
		Electronics electronics = new Electronics("Laptop", 50000, "HP");
		Clothing clothing = new Clothing("T-Shirts", 250, "XL");
		
		electronics.displayInfo();
		electronics.calculateTotalCost(1);
		
		clothing.displayInfo();
		clothing.calculateTotalCost(-2);
	}

}


/* Tested with Positive values
Electronics Product Details
Product Name : Laptop
Price : 50000.0
Brand : HP
Quantity : 1
Total Price of 1 Laptop is : 50000.0

Clothing Product Details
Product Name : T-Shirts
Price : 250.0
Size : XL
Quantity : 2
Total Price of 2 T-Shirts is : 500.0
*/

/* Tested with Negative values
Electronics Product Details
Product Name : Laptop
Price : 50000.0
Brand : HP
Quantity : 1
Total Price of 1 Laptop is : 50000.0

Clothing Product Details
Product Name : T-Shirts
Price : 250.0
Size : XL
Invalid Input Quantity
*/