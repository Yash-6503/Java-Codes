package ELC;

import BLC.*;

import java.util.*;

public class FindFibonacii 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number upto where to find Fibonacii Series: ");
		int num = sc.nextInt();
		
		Fibonacii f = new Fibonacii(num);
		
		f.fibonaciiSeries();
		
	}
}

/*
Enter a number upto where to find Fibonacii Series: 
5
Fibonacii Series is 
0 1 1 2 3 
*/