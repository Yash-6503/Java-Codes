
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
		System.out.println("Product Name = "+name);
		if(price > 0) {
			System.out.println("Price = $"+price);
		}else {
			System.err.println("Error Invalid Price");
		}
	}
	
	public double calculateTotalCost(int quantity)
	{
		return price * quantity;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
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
		super.displayInfo();
		System.out.println("Brand = "+brand);
		
	}
	
	public String getBrand()
	{
		return brand;
	}

	@Override
	public String toString() {
		return "Electronics [name=" + name + ", price=" + price + ", brand=" + brand + "]";
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
		super.displayInfo();
		System.out.println("Size = "+size);
	}
	
	public String getSize()
	{
		return size;
	}

	@Override
	public String toString() {
		return "Clothing [name=" + name + ", price=" + price + ", size=" + size + "]";
	}
	
}


public class OnlineShopping 
{
	
	public static void main(String[] args) 
	{
		Electronics electronics = new Electronics("Laptop",50000.22,"HP");
		Clothing clothing = new Clothing("T-Shirt",250.55,"XL");
		
		System.out.println("Electronics Details");
		electronics.displayInfo();
		System.out.println("Total Cost of Electronics Products : $"+electronics.calculateTotalCost(2));
		System.out.println(electronics);
		
		System.out.println("\nClothing Details");
		clothing.displayInfo();
		System.out.println("Total Cost of Clothing Products : $"+clothing.calculateTotalCost(2));
		System.out.println(clothing);
	}
}

/* Tested with Positive values
Electronics Details
Product Name = Laptop
Price = $50000.22
Brand = HP
Total Cost of Electronics Products : $100000.44
Electronics [name=Laptop, price=50000.22, brand=HP]

Clothing Details
Product Name = T-Shirt
Price = $250.55
Size = XL
Total Cost of Clothing Products : $501.1
Clothing [name=T-Shirt, price=250.55, size=XL]
*/

/* Tested with Negative values
Electronics Details
Product Name = Laptop
Error Invalid Price
Brand = HP
Total Cost of Electronics Products : $-100000.44
Electronics [name=Laptop, price=-50000.22, brand=HP]

Clothing Details
Product Name = T-Shirt
Error Invalid Price
Size = XL
Total Cost of Clothing Products : $-501.1
Clothing [name=T-Shirt, price=-250.55, size=XL]
*/

