/*
Program that defines a method modifyValue to perform modifications on an 
integer value using a provided consumer.
*/

import java.util.function.*;
import java.util.*;

public class ValueModifier {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		
		//Double a number
		Consumer<Integer> doubleNum = (Integer num) -> System.out.println("After doubling the value: "+(num + num));
		modifyValue(number,doubleNum);
		
		//Increment number
		Consumer<Integer> incrementBy = (Integer num) -> System.out.println("After incrementing the value by 3: "+(num + 3));
		modifyValue(number,incrementBy);
		
		//Square a number
		Consumer<Integer> squareValue = (Integer num) -> System.out.println(number <= 0 ? "" : "After squaring the value: "+(num * num));
		modifyValue(number,squareValue);
	}

	public static void modifyValue(int value, Consumer<Integer> consumer) {
		consumer.accept(value);
	}
}

/*
Enter a Number: 
5
After doubling the value: 10
After incrementing the value by 3: 8
After squaring the value: 25
*/

/*
Enter a Number: 
-8
After doubling the value: -16
After incrementing the value by 3: -5
*/

/*
Enter a Number: 
0
After doubling the value: 0
After incrementing the value by 3: 3
*/
