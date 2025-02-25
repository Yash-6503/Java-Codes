// WAP to convert Integer Array to String Representations

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 
{
	public static void main(String[] args) 
	{
	    Integer[] numbers = {10, 20, 30, 40, 50};
	    
	    System.out.println("Original numbers: "+Arrays.toString(numbers));
	    
	    List<String> list = Arrays.stream(numbers).map(num -> "Number:"+num).collect(Collectors.toList());
	    
	    System.out.println("Converted Strings: "+list);
	}

}

/*
Original numbers: [10, 20, 30, 40, 50]
Converted Strings: [Number:10, Number:20, Number:30, Number:40, Number:50]
*/