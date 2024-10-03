/*
Write a Java program to calculate the factorial of a number where number must be taken from command line argument.
*/

public class Factorial
{
	public static void main(String args[])
	{
		int fact=1, num1, n;
			
		num1 = Integer.parseInt(args[0]);

		n=num1;

		while(num1 != 0)
		{
			fact *= num1;
			num1--;
		}
		System.out.println("Factorial of "+n+" is " +fact);
	}
}

/*
C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\3-Oct-2024>java Factorial.java 4
Factorial of 4 is 24
*/