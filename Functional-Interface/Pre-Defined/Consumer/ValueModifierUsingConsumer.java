/*
Program to create a Value Modifier using Consumer interface
*/

package com.classes;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifierUsingConsumer 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Consumer<String> stringConsumer = str -> System.out.println("After converting "+str+" to uppercase is "+str.toUpperCase());
		Consumer<Integer> integerConsumer = num -> System.out.println("Square of "+num+" is "+(num*num));
		
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		
		stringConsumer.accept(word);
		integerConsumer.accept(number);
	}
}

/*
Enter a word: 
hello
Enter a number: 
3
After converting hello to uppercase is HELLO
Square of 3 is 9
*/
