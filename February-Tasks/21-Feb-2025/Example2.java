//Java program that demonstrates how to merge two PriorityQueue instances. 

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Example2 {

	public static void main(String[] args) 
	{
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		List<String> list1 = Arrays.asList("Red", "Green","Orange");
		queue1.addAll(list1);
		
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
		List<String> list2 = Arrays.asList("Pink", "White", "Black");
		queue2.addAll(list2);
		
		System.out.println("Priority Queue 1: "+queue1);
		
		System.out.println("\nPriority Queue 2: "+queue2);
	
		queue1.addAll(queue2);
		System.out.println("\nNew Priority Queue1: "+queue1);
	
	}
}

/*
Priority Queue 1: [Green, Red, Orange]

Priority Queue 2: [Black, White, Pink]

New Priority Queue1: [Black, Green, Orange, Red, White, Pink]
*/