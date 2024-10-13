/*
Que-2)
Write a java program which print the next multiple of 100 for the given number.
Program is determined by the following rules:

if the given value is negative or zero, return -1
if the given value is positive, return the next multiple of the given number. Example: if x = 123, return 200.
*/

package com.classes;

public class Next100MultipleOfNumber
{
    public static void main(String args[])
    {
        int num = Integer.parseInt(args[0]);

        if(num <= 0)
        {
            System.out.println("-1");
        }
        else{
            int nextMul = (num/100+1)*100;
            System.out.println("Next 100 Multiple of "+num+" is "+nextMul);
        }    
    }
}

/*
java Next100MultipleOfNumber.java 123
Next 100 Multiple of 123 is 200

java Next100MultipleOfNumber.java -10
-1
*/