//BLC class of ShapeDemo -> Circle.java

package pkg.blc1;

public class Circle extends Shape
{
    public Circle(){}

    @Override
    public void draw()
    {
        System.out.println("Circle draw");
    }

    @Override
    public void erase()
    {
        System.out.println("Circle erase");
    }
}