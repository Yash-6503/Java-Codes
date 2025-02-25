// WAP to print all the unique numbers from the Array.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 
{
	public static void main(String[] args) 
	{
	    Integer[] numbers = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4};
	    
	    System.out.println("Numbers: "+Arrays.toString(numbers));
	    
	    List<Integer> list = Arrays.stream(numbers).distinct().collect(Collectors.toList());
	    
	    System.out.println("Output: "+list);
	}
}

/*
Numbers: [1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 4]
Output: [1, 2, 3, 4, 5, 6, 7, 8]
*/