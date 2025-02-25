// WAP to filter Palindrome Words from an Array.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example6 
{
	public static void main(String[] args) 
	{
		String[] words = {"madam", "hello", "racecar", "java", "level", "world"};
		
		System.out.println("Words: "+Arrays.toString(words));
		
		List<String> list = Arrays.stream(words).filter(str -> isPalindrome(str)).collect(Collectors.toList());
		
		System.out.println("Palindrome Words: "+list);
	}
	
	public static boolean isPalindrome(String name) 
	{
		String reverse = new StringBuilder(name).reverse().toString();
		return name.equals(reverse);
	}

}

/*
Words: [madam, hello, racecar, java, level, world]
Palindrome Words: [madam, racecar, level]
*/