//BLC class of BookTester -> Book.java

package pkg.blc2;

abstract class Book
{
    String title;

    public Book(){}

    public abstract void setTitle(String title);

    public String getTitle(){
        return "The title of book is: "+title;
    }
}