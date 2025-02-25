// WAP to print all the names from String array which contains letter 'a' in the name.

import java.util.*;
import java.util.stream.Collectors;

public class Example2 
{
	public static void main(String[] args) 
	{
		String names[] = {"Rahul", "Raj", "Arnav", "Scott", "Smith"};
		System.out.println("Names: "+Arrays.toString(names));
		
		List<String> list = Arrays.stream(names).filter(str -> str.contains("a")).collect(Collectors.toList());
		
		System.out.println("Names Containing 'A' or 'a' : "+list);
	}

}

/*
Names: [Rahul, Raj, Arnav, Scott, Smith]
Names Containing 'A' or 'a' : [Rahul, Raj, Arnav]
*/
