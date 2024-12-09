// ELC (main) class of Book, MyBook -> BookTester.java
//Program to initialize properties of abstract parent class using child class with setters and getters

package pkg.blc2;

public class BookTester
{
    public static void main(String args[])
    {
        MyBook book = new MyBook();
        book.setTitle("A tale of two cities");
        System.out.println(book.getTitle());
    }
}

/*
The title of my book is: A tale of two cities
*/