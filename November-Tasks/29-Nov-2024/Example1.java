//ELC class -> Main class

package pkg.blc;

public class Example1
{
    public static void main(String args[])
    {
        Calculator calc = new Calculator();

        //calling method without return type
        // calc.add(10,20);

        // calc.add(10.5,20.5);

        // calc.multiply(10,10);

        // calc.multiply(10.5,20.5);


        //calling methods with return type
        System.out.println("Sum of int numbers = "+calc.add(10,20));

        System.out.println("Sum of double numbers = "+calc.add(10.5,20.5));
        
        System.out.println("Multiplication of int numbers = "+calc.multiply(10,10));

        System.out.println("Multiplication of double numbers = "+calc.multiply(10.5,20.5));
    }
}


/*  Method without any return type (void only)
Sum of (int) 10 and 20 is 30
Sum of (double) 10.5 and 20.5 is 31.0
Multiplication of (int) 10 and 10 is 100
Multiplication of (double) 10.5 and 20.5 is 215.25
*/

/*  Method with specific return type i.e int, double
Sum of int numbers = 30
Sum of double numbers = 31.0
Multiplication of int numbers = 100
Multiplication of double numbers = 215.25
*/