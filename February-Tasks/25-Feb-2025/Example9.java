// WAP to convert boolean value to "Yes" or "No"

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 
{
	public static void main(String[] args) 
	{
	    Boolean[] flags = {true, false, true, false, true};
	    
	    System.out.println("Flags: "+Arrays.toString(flags));
	    
	    List<String> list = Arrays.stream(flags).map(str -> str ? "Yes" : "No").collect(Collectors.toList());
	    
	    System.out.println("Yes/No values: "+list);
	}
}

/*
Flags: [true, false, true, false, true]
Yes/No values: [Yes, No, Yes, No, Yes]
*/
