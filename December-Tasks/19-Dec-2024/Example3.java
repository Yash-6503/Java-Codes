/*
Program that utilizes the Supplier interface to generate random values. 
*/

import java.util.function.*;
import java.util.Random;
import java.util.Scanner;
import java.util.random.*;

public class Example3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Supplier<String> s1 = () -> {
			Random random = new Random();
			int randomNumber = random.nextInt(10000);
			return "NIT"+randomNumber;
		};
		
		System.out.println("Generated random string: "+s1.get());
		
		Supplier<Integer> s2 = () ->{
			Random random = new Random();
			int randomNumber = random.nextInt(57,92);
			return randomNumber;
		};
		
		System.out.println("Generated random integer: "+s2.get());
	}

}

/*
Generated random string: NIT3437
Generated random integer: 77
*/

/*
Generated random string: NIT1330
Generated random integer: 86
*/