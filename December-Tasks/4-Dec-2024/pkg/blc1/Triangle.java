//BLC class of ShapeDemo -> Triangle.java

package pkg.blc1;

public class Triangle extends Shape
{
    public Triangle(){}

    @Override
    public void draw()
    {
        System.out.println("Triangle draw");
    }

    @Override
    public void erase()
    {
        System.out.println("Triangle erase");
    }
}