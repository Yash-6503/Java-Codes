//BLC class of BookTester -> MyBook.java

package pkg.blc2;

public class MyBook extends Book
{
    public MyBook(){}

    @Override
    public void setTitle(String title)
    {
        super.title = title;
    }

    @Override
    public String getTitle(){
        return "The title of my book is: "+super.title;
    }
}