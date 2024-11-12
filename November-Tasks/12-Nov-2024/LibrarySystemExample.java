package com.classes;

class LibraryItem
{
    protected String title;
    LibraryItem(String title)
    {
        this.title = title;
    }

    public void displayInfo()
    {
        System.out.println("\nTitle = "+title);
    }
}

class Book extends LibraryItem
{
    protected String author;

    Book(String title, String author)
    {
        super(title);
        this.author = author;
    }

    public void displayBookInfo()
    {
        displayInfo();
        System.out.println("Author = "+author);
    }
}

class Ebook extends Book
{
    protected String fileFormat;

    Ebook(String title, String author, String fileFormat)
    {
        super(title,author);
        this.fileFormat = fileFormat;
    }

    public void displayEbookInfo()
    {
        displayBookInfo();
        System.out.println("File Format = "+fileFormat);
    }
}

public class LibrarySystemExample
{
    public static void main(String args[])
    {
        Ebook e1 = new Ebook("Java Programming","John Doe","PDF");

        e1.displayEbookInfo();
    }
}

/*
Title = Java Programming
Author = John Doe
File Format = PDF
*/