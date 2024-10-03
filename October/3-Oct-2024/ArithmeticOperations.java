public class ArithmeticOperations
{
    
    public static void main(String args[])
    {
	        int num1, num2, result;

            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);

            result = num1 + num2;

            System.out.println("Addition of " +num1+ " and " +num2+ " : " +result);

            result = num1 - num2;

            System.out.println("Substraction of " +num1+ " and " +num2+ " : " +result);

            result = num1 * num2;

            System.out.println("Multiplication of " +num1+ " and " +num2+ " : " +result);

            result = num1 / num2;

            System.out.println("Division of " +num1+ " and " +num2+ " : " +result);
		
    }
}

/*
C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\3-Oct-2024>java ArithmeticOperations 10 5
Addition of 10 and 5 : 15
Substraction of 10 and 5 : 5
Multiplication of 10 and 5 : 50
Division of 10 and 5 : 2
*/