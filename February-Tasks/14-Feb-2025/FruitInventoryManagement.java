//program that manages a collection of fruits and their quantities using a HashMap. 

import java.util.HashMap;
import java.util.Iterator;

public class FruitInventoryManagement 
{
	public static void main(String[] args) 
	{
		HashMap<String,Integer> fruitsMap = new HashMap<>();
		fruitsMap.put("Apple",50);
		fruitsMap.put("Banana",30);
		fruitsMap.put("Orange",20);
		
		//display/retrieve fruits
		fruitsMap.forEach((k,v)->System.out.println(k+": "+v));
		
		System.out.println("Total Number of entries: "+fruitsMap.size());
		
		System.out.println(fruitsMap.isEmpty() ? "HashMap is empty." : "HashMap is not empty.");
		
		System.out.println("\nQuantity for Apple: "+fruitsMap.getOrDefault("Apple", 0));
		System.out.println("Quantity for Banana: "+fruitsMap.getOrDefault("Banana", 0)+"\n");

		System.out.println(fruitsMap.containsKey("Orange") ? "Orange exists in the records." : "Orange not exists in the records.");
		System.out.println(fruitsMap.containsKey("Mango") ? "Mango exists in the records." : "Mango not exists in the records.");
		
		System.out.println();
		System.out.println(fruitsMap.containsValue(20) ? "Quantity 20 exists in the records." : "Quantity 20 does not exists in the records.");
		System.out.println(fruitsMap.containsValue(100) ? "Quantity 100 exists in the records." : "Quantity 100 does not exists in the records.");

	}
}

/*
Apple: 50
Orange: 20
Banana: 30
Total Number of entries: 3
HashMap is not empty.

Quantity for Apple: 50
Quantity for Banana: 30

Orange exists in the records.
Mango not exists in the records.

Quantity 20 exists in the records.
Quantity 100 does not exists in the records.
*/
