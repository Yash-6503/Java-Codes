// WAP to remove Negative Numbers from an Integer Array.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 
{
	public static void main(String[] args) 
	{
		Integer arr[] = {-10, -5, 0, 5, 10, 15, -20};
		
		System.out.println("Original array: "+Arrays.toString(arr));
		
		List<Integer> list = Arrays.stream(arr).filter(num -> num > 0).collect(Collectors.toList());
		
		System.out.println("Positive Numbers: "+list);
	}

}

/*
Original array: [-10, -5, 0, 5, 10, 15, -20]
Positive Numbers: [5, 10, 15]
*/
