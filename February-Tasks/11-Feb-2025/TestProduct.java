//TestProduct.java

import java.util.ArrayList;
import java.util.Collections;

record Product(int productNumber, String productName, double productPrice) implements Comparable<Product>
{
    @Override
	public int compareTo(Product o) {
		return this.productNumber - o.productNumber;
	}
	
	
}

public class TestProduct 
{
	public static void main(String[] args) 
	{
		Product p1 = new Product(333, "Laptop", 50000);
		Product p2 = new Product(111,"Mobile", 30000);
		Product p3 = new Product(222,"Tablet",15000);
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		Collections.sort(productList);
		productList.forEach(System.out::println);
		
	}

}
