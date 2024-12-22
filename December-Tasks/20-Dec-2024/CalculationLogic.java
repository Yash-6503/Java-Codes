/*
Program that defines a method testPredicate to test a given number 
against a provided predicate.
*/

import java.util.function.*;
import java.util.*;

public class CalculationLogic {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = sc.nextInt();
		
		//Num is even or not using predicate
		Predicate<Integer> isEven = (Integer num)-> num%2==0;

		//Num is greater than 10 or not 
		Predicate<Integer> isGreater = (Integer num) -> num > 10;
		
		//Num is prime or not
		Predicate<Integer> isPrime = (Integer num) -> {
			int count = 0;
			for(int i=1; i<=num; i++) {
				if(num%i == 0) {
					count++;
				}
			}
			if(count == 2) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(number+" is even: "+testPredicate(number,isEven));
		System.out.println(number+" is greater than 10: "+testPredicate(number,isGreater));
		System.out.println(number+" is prime: "+testPredicate(number,isPrime));

	}
	
	public static boolean testPredicate(int num, Predicate<Integer> predicate) {
		if(num > 0) {
			return predicate.test(num);
		}else {
			System.err.println("Error: Invalid Number");
			System.exit(0);
			return false;
		}
	}

}

/*
Enter a Number: 
13
13 is even: false
13 is greater than 10: true
13 is prime: true
*/

/*
Enter a Number: 
6
6 is even: true
6 is greater than 10: false
6 is prime: false
*/

/*
Enter a Number: 
3
3 is even: false
3 is greater than 10: false
3 is prime: true
*/

/*
Enter a Number: 
-11
Error: Invalid Number
 */
