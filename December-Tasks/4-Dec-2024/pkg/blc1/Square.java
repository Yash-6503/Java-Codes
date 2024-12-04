//BLC class of ShapeDemo -> Square.java

package pkg.blc1;

public class Square extends Shape
{
    public Square(){}

    @Override
    public void draw()
    {
        System.out.println("Square draw");
    }

    @Override
    public void erase()
    {
        System.out.println("Square erase");
    }
}