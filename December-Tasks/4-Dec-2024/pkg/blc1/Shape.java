//BLC class of ShapeDemo -> Shape.java

package pkg.blc1;

import java.util.*;

public class Shape
{
    public Shape(){}

    public static Shape randShape()
    {
        int random = (int) (Math.random()*3);
        switch(random)
        {
            case 0 :
                    return new Circle();
            
            case 1:
                    return new Square();

            case 2:
                    return new Triangle();
            
            default:
                System.out.println("Default Shape");
                return new Shape();
        }
    }

    public void draw()
    {
        System.out.println("shape draw");
    }

    public void erase()
    {
        System.out.println("shape erase");
    }
}