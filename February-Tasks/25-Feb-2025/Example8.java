// WAP to convert all the names of String array into uppercase 

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example8 
{
	public static void main(String[] args) 
	{
	    String[] names = {"Virat", "Sanju", "Rohit", "Bumrah"};
	    
	    System.out.println("Names: "+Arrays.toString(names));
	    
	    List<String> list = Arrays.stream(names).map(str -> str.toUpperCase()).collect(Collectors.toList());
	    
	    System.out.println("Output: "+list);
	}
}

/*
Names: [Virat, Sanju, Rohit, Bumrah]
Output: [VIRAT, SANJU, ROHIT, BUMRAH]
*/
