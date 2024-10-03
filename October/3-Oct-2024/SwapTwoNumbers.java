/*
Write a program to swap to numbers without using 3rd variable using 
    command line argument.
*/

public class SwapTwoNumbers
{
	public static void main(String args[])
	{
		int num1,num2;
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);

		//num1 = num1 + num2 - num1;
		//num2 = num2 + num1 - num2;
		

		System.out.println("Before Swaping numbers are: ");
		System.out.println("Number 1 : " +num1);
		System.out.println("Number 2 : " +num2);

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("\nAfter Swaping numbers are: ");
		System.out.println("Number 1 : " +num1);
		System.out.println("Number 2 : " +num2);
	}
}

/*
C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\3-Oct-2024>java SwapTwoNumbers 10 20
Before Swaping numbers are:
Number 1 : 10
Number 2 : 20

After Swaping numbers are:
Number 1 : 20
Number 2 : 10
*/