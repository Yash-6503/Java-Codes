// WAP to print all the Prime Numbers from an Integer Array.

package com.StreamAPI.Task1;

import java.util.*;
import java.util.stream.Collectors;

public class Example3 
{
	public static void main(String[] args) 
	{
	    Integer[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
	    
	    List<Integer> list = Arrays.stream(numbers).filter(Example3::isPrime).collect(Collectors.toList());
	    
	    System.out.println("Prime Numbers: "+list);
	}
	
	private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

/*
 Prime Numbers: [2, 3, 5, 7, 11]
*/

