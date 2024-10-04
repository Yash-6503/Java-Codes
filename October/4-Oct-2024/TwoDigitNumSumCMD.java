/*
4) Write a program to accept a two digit number from command line argument and find the sum of digit. (Example : 54   5 + 4 =9)
*/

public class TwoDigitNumSumCMD
{
    public static void main(String args[])
    {
        int num, sum;

        num = Integer.parseInt(args[0]);

        sum = num/10 + num%10;

        System.out.println("Sum of "+num+" is "+num/10+" + "+num%10+" = "+sum);
    }
}

/*
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\4-Oct-2024> java  TwoDigitNumSumCMD.java 54      
Sum of 54 is 5 + 4 = 9
*/