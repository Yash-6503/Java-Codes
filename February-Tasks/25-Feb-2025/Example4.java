//WAP to print all the names from String array where the length of the name must be greater than 3.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example4 
{
	public static void main(String[] args) 
	{
		String[] words = {"Raj", "Rohit", "Smirti", "Richa", "Sky"};
		
		System.out.println("Names: "+Arrays.toString(words));
		
		List<String> list = Arrays.stream(words).filter(str -> str.length() > 3).collect(Collectors.toList());
		
		System.out.println("Output: "+list);
	}

}

/*
Names: [Raj, Rohit, Smirti, Richa, Sky]
Output: [Rohit, Smirti, Richa]
*/