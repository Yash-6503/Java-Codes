/*
Que-1)
Write a java which program the sum of digits of the given two digit number.
program determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, print 7
if the given value is negative, print -3
if the given value is greater than 99, print -2
if the given value is in between 0 and 9, print -1
*/

package com.classes;

public class SumOfTwoDigitNum
{
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);

        if(num > 9 && num < 100)
        {
            int sum = (num % 10) + (num / 10);
            System.out.println("Sum of Two digit number "+num+" is "+sum);
        }
        else if(num < 0)
        {
            System.out.println("-3");
        }
        else if(num > 99)
        {
            System.out.println("-2");
        }
        else if(num >= 0 && num <= 9)
        {
            System.out.println("-1");
        }
    }
}

/*
java SumOfTwoDigitNum.java 34
Sum of Two digit number 34 is 7

java SumOfTwoDigitNum.java -34
-3

java SumOfTwoDigitNum.java 101
-2

java SumOfTwoDigitNum.java 5
-1
*/