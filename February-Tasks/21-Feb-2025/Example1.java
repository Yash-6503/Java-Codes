//Java program that uses a PriorityQueue to manage a collection of strings. 

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Example1 {

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Red", "Green", "Orange", "White", "Black");
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.addAll(list);
		
		System.out.println("Priority Queue: "+pq);
	}

}

/*
Priority Queue: [Black, Green, Orange, White, Red]
*/