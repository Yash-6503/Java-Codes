/*
Program that defines a method applyFunction to apply a function to a 
given integer value.
*/

import java.util.*;
import java.util.function.*;

public class FunctionApplier {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		int number = sc.nextInt();
		
		//to add a number
		Function<Integer,Integer> add = num -> number + num;
		
		//to multiply a number
		Function<Integer,Integer> multiply = num -> number * num;
		
		//to substract a number
		Function<Integer,Integer> sub = num -> number - num;
		
		System.out.println("After adding 5: "+applyFunction(5, add));
		System.out.println("After multiplying by 2: "+applyFunction(2, multiply));
		System.out.println("After subtracting 3: "+applyFunction(3, sub));

	}
	
	public static int applyFunction(int value, Function<Integer,Integer> function) {
		return function.apply(value);
	}

}

/*
Enter Number: 
10
After adding 5: 15
After multiplying by 2: 20
After subtracting 3: 7
*/

/*
Enter Number: 
-15
After adding 5: -10
After multiplying by 2: -30
After subtracting 3: -18
*/

/*
Enter Number: 
100
After adding 5: 105
After multiplying by 2: 200
After subtracting 3: 97
*/

