//Write a program to perform addition using command line Argument.


public class Addition
{
	public static void main(String args[])
	{
		int num1, num2;
		
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
	
		System.out.println("Addition of "+num1+" and "+num2+" : " +(num1+num2));
	}
}

/*
C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\3-Oct-2024>java Addition 10 5
Addition of 10 and 5 : 15
*/