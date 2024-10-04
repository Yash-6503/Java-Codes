/*
3) Write a program to find the sum and average of three numbers where  number must be taken from command line argument.
*/

public class SumAvgCMD
{
    public static void main(String args[])
    {
        int num1, num2, num3, sum;
        float avg;

        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        num3 = Integer.parseInt(args[2]);

        sum = num1 + num2 + num3;
        avg = sum/3;

        System.out.println("Sum of 3 numbers is "+sum);
        System.out.println("Average of 3 numbers is "+avg);
    }
}

/*
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\4-Oct-2024> java  SumAvgCMD.java 10 20 30
Sum of 3 numbers is 60
Average of 3 numbers is 20.0
*/