//BLC class of Example1 -> Calculator.java

package pkg.blc;

public class Calculator
{

    //Methods without return type

    // public void add(int num1, int num2)
    // {
    //     int sum = num1 + num2;
    //     System.out.println("Sum of (int) "+num1+" and "+num2+" is "+sum);
    // }

    // public void add(double num1, double num2)
    // {
    //     double sum = num1 + num2;
    //     System.out.println("Sum of (double) "+num1+" and "+num2+" is "+sum);
    // }

    // public void multiply(int num1, int num2)
    // {
    //     int mul = num1 * num2;
    //     System.out.println("Multiplication of (int) "+num1+" and "+num2+" is "+mul);
    // }

    // public void multiply(double num1, double num2)
    // {
    //     double mul = num1 * num2;
    //     System.out.println("Multiplication of (double) "+num1+" and "+num2+" is "+mul);
    // }


    //Methods with return type

    public int add(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    public double add(double num1, double num2)
    {
        double sum = num1 + num2;
        return sum;
    }

    public int multiply(int num1, int num2)
    {
        int mul = num1 * num2;
        return mul;
    }

    public double multiply(double num1, double num2)
    {
        double mul = num1 * num2;
        return mul;
    }
}