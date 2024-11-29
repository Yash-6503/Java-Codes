//ELC class -> main class

package pkg.blc;

public class Example2
{
    public static void main(String args[])
    {
        ShapeCalculator sc = new ShapeCalculator();

        System.out.println("Area of Square = "+sc.calculateArea(4));

        System.out.println("Area of Rectangle = "+sc.calculateArea(10,10));
        
        System.out.println("Area of Circle = "+sc.calculateArea(7.0));
    }
}

/*  Tested with positive values
Area of Square = 16
Area of Rectangle = 100
Area of Circle = 153.86
*/

/*  Tested with negative values
Side Length must be non-negative

Length and width must be non-negative.

Radius must be non-negative.
*/