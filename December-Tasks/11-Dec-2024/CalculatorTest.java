//Program to calculate the sum of divisors of a given number using interface.

package com.classes;

interface AdvancedArithmetic
{
    public abstract int divisorSum(int n);
}

class MyCalculator implements AdvancedArithmetic
{
    @Override
    public int divisorSum(int n)
    {
        if(n < 0){
            System.out.println("Error: Input must be a positive integer.");
            return 0;
        }else if(n == 0){
            System.out.println("Error: Input must be a positive integer.");
            return 0;
        }else if(n > 0){
            int sum = 0;
            for(int i=1; i<=n; i++)
            {
                if(n%i == 0)
                {
                    sum = sum + i;
                }
            }
            return sum;
        }else{
            System.out.println("Invalid input. Please enter a valid positive integer.");
            return 0;
        }
    }

}

public class CalculatorTest
{
    public static void main(String args[])
    {
        MyCalculator calc = new MyCalculator();
        System.out.println("Divisor sum is: "+calc.divisorSum(-1));
    }
}