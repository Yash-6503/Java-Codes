/*
Write a java program to find the ASCII value of a character
For Example
Output sholud be in below formart
The ASCII value of a is :97
*/

package com.classes;

public class FindAsciiValue
{
    public static void main(String args[])
    {
        //direct initialization
        // char ch = 'a';
        // int i = ch;
        // System.out.println("ASCII value of "+ch+" is "+i);

        //taking input from cmd
        for (String arg : args) {
                if (arg.length() == 1) {
                    char c = arg.charAt(0); 
                    
                    int ascii = c;
                    System.out.println("ASCII value of "+c+" is "+ascii);
                }
        }
        
    }
}

/*
ASCII value of a is 97

ASCII value of b is 98

ASCII value of A is 65
*/