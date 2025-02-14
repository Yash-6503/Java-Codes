/*
With the help of TreeSet constructor using Comparator interface, write the logic to sort the Product data on the following basis
 
1) Sort based on the pid in ascending order.
2) Sort based on the pid in descending order.
3) Sort based on the name in Alphabetical order.
4) Sort based on the name in Reverse order.
*/

import java.util.Comparator;
import java.util.TreeSet;

record Product(Integer pid,String pname)
{
	public Product(Integer pid, String pname) {
		if(pid < 0) {
			throw new IllegalArgumentException();
		}else {
			this.pid = pid;
			this.pname = pname;
		}
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + "]";
	}


}

public class TestProduct 
{
	public static void main(String[] args) 
	{
		//ascending sorted pid
		TreeSet<Product> t1 = new TreeSet<>((p1,p2) -> p1.pid().compareTo(p2.pid()));
		t1.add(new Product(333,"Laptop"));
		t1.add(new Product(111, "Mobile"));
		t1.add(new Product(222, "AirBuds"));
		System.out.println("Sorted pid in ascending");
		t1.forEach(System.out::println);
		
		//descending sorted pid
		TreeSet<Product> t2 = new TreeSet<>((p1,p2) -> Integer.compare(p2.pid(), p1.pid()));
		t2.add(new Product(333,"Laptop"));
		t2.add(new Product(111, "Mobile"));
		t2.add(new Product(222, "AirBuds"));
		System.out.println("\nSorted pid in descending");
		t2.forEach(System.out::println);
		
		//alphabetical order pname
		TreeSet<Product> t3 = new TreeSet<>((p1,p2) -> p1.pname().compareTo(p2.pname()));
		t3.add(new Product(333,"Laptop"));
		t3.add(new Product(111, "Mobile"));
		t3.add(new Product(222, "AirBuds"));
		System.out.println("\nSorted name based on alphabetical order");
		t3.forEach(System.out::println);
		
		//reverse order pname
		TreeSet<Product> t4 = new TreeSet<>((p1,p2) -> p2.pname().compareTo(p1.pname()));
		t4.add(new Product(333,"Laptop"));
		t4.add(new Product(111, "Mobile"));
		t4.add(new Product(222, "AirBuds"));
		System.out.println("\nSorted name based on reverse order");
		t4.forEach(System.out::println);
		
	}

}
