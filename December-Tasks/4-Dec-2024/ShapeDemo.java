//ELC (main) class -> ShapeDemo.java

package pkg.blc1;

public class ShapeDemo
{
    public static void main(String args[])
    {
        for (int i = 0; i < 4; i++) 
        {
            Shape shape = Shape.randShape(); 
            shape.draw(); 
            shape.erase();
            System.out.println();
        }
    }
}

/*
Circle draw
Circle erase

Square draw
Square erase

Square draw
Square erase

Triangle draw
Triangle erase
*/