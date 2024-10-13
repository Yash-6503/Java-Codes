/*
Que-3)
Write a java program which print the given three digit number is palindrome or not 

Program is determined by the following rules:

if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0
if 1 then print a message that the number is pallindrome
if 0 then print a message that the number is not a pallindrome
if the given number is negative or zero, print -1
if -1 then print a message that the given number is -ve kindly provide the +ve number only
if the given number is not an three digit number, print -2
if -2 then print the message that this program can check the operation for the 3 number only.
*/

package com.classes;

public class Find3DigitNumisPalindromeOrNot
{
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);

        if(num > 99 && num < 1000)
        {
            int n = num;
            int palindrome;
            int digit, rev=0;
            while(n!=0)
            {
                digit = n%10;
                rev = rev * 10 + digit;
                n= n / 10;
            }
            if(rev == num)
            {   
                palindrome = 1;
            }else{
                palindrome = 0;
            }

            if(palindrome == 1)
            {
                System.out.println(num+" is Palindrome");
            }else{
                System.out.println(num+" is not a Palindrome");
            }
        }
        else if(num <= 0)
        {
            int negative = -1;
            if(negative == -1)
            {
                System.out.println("given number "+num+" is -ve kindly provide the +ve number only");
            }
        }
        else
        {
            int n = -2;
            if(n == -2)
            {
                System.out.println("This program can check the operation for the 3 Digit number only.");
            }
        }
    }
}

/*
java Find3DigitNumisPalindromeOrNot.java 123
123 is Palindrome

java Find3DigitNumisPalindromeOrNot.java -120
given number -120 is -ve kindly provide the +ve number only

java Find3DigitNumisPalindromeOrNot.java 1200
This program can check the operation for the 3 Digit number only.
*/