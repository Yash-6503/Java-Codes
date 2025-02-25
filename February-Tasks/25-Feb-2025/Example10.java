// WAP to extract First Letter of Each Word from String Array

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example10 
{
	public static void main(String[] args) 
	{
	     String []names = {"James", "Aryan", "Vibha", "Aniket"};
	     
	     System.out.println("Names: "+Arrays.toString(names));
	     
	     List<Character> list = Arrays.stream(names).map(str -> str.charAt(0)).collect(Collectors.toList());
	     
	     System.out.println("First Letters: "+list);
	}
}

/*
Names: [James, Aryan, Vibha, Aniket]
First Letters: [J, A, V, A]
*/
