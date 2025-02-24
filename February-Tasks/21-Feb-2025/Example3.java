/* Create two PriorityQueue instances, queue1 and queue2, and add the following elements to them:
 queue1: Red, Green, Black, White
 queue2: Red, Pink, Black, Orange
 Print the elements of both queues.
 Compare the elements of both queues and print "Yes" if the element is present in both queues, otherwise print "No".
*/

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Example3 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
//		List<String> list1 = Arrays.asList("Red", "Green", "Black", "White");
//		queue1.addAll(list1);
		queue1.add("Red");
		queue1.add("Green");
		queue1.add("Black");
		queue1.add("White");
		
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
//		List<String> list2 = Arrays.asList("Red", "Pink", "Black","Orange");
//		queue2.addAll(list2);
		queue2.add("Red");
		queue2.add("Pink");
		queue2.add("Black");
		queue2.add("Orange");
		
		
		System.out.println("Priority Queue 1: "+queue1);
		
		System.out.println("\nPriority Queue 2: "+queue2);
	
		for(String str : queue1) {
			if(queue2.contains(str)) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}
		
	}
}

/*
Priority Queue 1: [Black, Red, Green, White]

Priority Queue 2: [Black, Orange, Pink, Red]
Yes
Yes
No
No
*/
