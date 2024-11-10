/*Program  to find a number is prime or not*/

package ELC;

import BLC.*;

import java.util.Scanner;

public class FindPrimeNumber
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        Prime p = new Prime(num);
        
        p.checkPrime();
    }
}
