//BLC class of Example2 -> ShapeCalculator.java

package pkg.blc;

public class ShapeCalculator
{
    public int calculateArea(int sideLength){
        if(sideLength <= 0){
            System.out.println("Side Length must be non-negative");
            System.exit(0);
            return 0;
        }else{
            return sideLength * sideLength;
        }
    }

    public int calculateArea(int length, int width){
        if(length > 0 && width > 0){
            return length * width;
        }else if(length > 0 && width <= 0){
            System.out.println("Width must be non-negative.");
            System.exit(0);
            return 0;
        }else if(width > 0 && length <= 0){
            System.out.println("Length must be non-negative.");
            System.exit(0);
            return 0;
        }else{
            System.out.println("Length and width must be non-negative.");
            System.exit(0);
            return 0;
        }
    }

    public double calculateArea(double radius){
        if(radius > 0){
            return 3.14 * (radius * radius);
        }else{
            System.out.println("Radius must be non-negative.");
            System.exit(0);
            return 0;
        }
    }
}