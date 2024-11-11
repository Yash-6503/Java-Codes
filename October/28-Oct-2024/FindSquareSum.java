//Q1

package com.classes;

import java.util.*;

public class FindSquareSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("\n"+num+" numbers square sum is "+calculateDifference(num));
    }

    public static int calculateDifference(int num)
    {
        int sum = 0;

        for(int i=1; i<=num; i++)
        {
            sum += Math.pow(i,2);
            // System.out.print(sum+" ");
        }

        return sum;
    }
}

/*
Enter a number : 
10

10 numbers square sum is 385
*/

/*
Enter a number : 
5

5 numbers square sum is 55
*/