//ELC

package com.blc;

import java.util.*;

public class Example1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Two Digit Number: ");
        int num = sc.nextInt();

        TwoDigitsSum sum = new TwoDigitsSum();

        System.out.println("Sum of Two Digit Number "+num+" is : "+sum.getSumOfDigits(num));
    }
}

/*
Enter a Two Digit Number: 
34
Sum of Two Digit Number 34 is : 7
*/
