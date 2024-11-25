//Book Management System

package com.classes;

class Book
{
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void getDetails()
    {
        System.out.println("Title : "+title);
        System.out.println("Author : "+author);
        System.out.println(price <= 0 ? "Invalid Input Price" : "Price : "+price);
    }

    public void applyDiscount(double percentage)
    {
        if(percentage > 0 && price > 0){
            System.out.println("Discount Applied : "+percentage+"%");
            double total = (price / 100) * percentage;
            System.out.printf("Total Price after appling Discount : %.2f\n",total);
        }else if(price > 0 && percentage <= 0){
            System.out.println("Invalid Input Percentage");
        }else if(percentage > 0 && price <= 0){
            System.out.println("Please provide Valid Price to apply discount");
        }else{
            System.out.println("Invalid Input Percentage and Price");
        }
    }
}

class EBook extends Book
{   
    protected double fileSize;
    protected String format;

    public EBook(String title, String author, double price, double fileSize, String format)
    {
        super(title,author,price);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void getDetails()
    {
        System.out.println("\nEBook Details");
        System.out.println("----------------------------------");
        super.getDetails();
        System.out.println(fileSize <= 0 ? "Invalid Input File Size" : "File Size : "+fileSize+" MB");
        System.out.println("Format : "+format);
    }    
}

class AudioBook extends Book
{
    protected double duration;
    protected String narrator;

    public AudioBook(String title, String author, double price, double duration, String narrator)
    {
        super(title,author,price);
        this.duration = duration;
        this.narrator = narrator;
    }

    @Override
    public void getDetails()
    {
        System.out.println("\nAudio Book Details");
        System.out.println("----------------------------------");
        super.getDetails();
        System.out.println(duration <= 0 ? "Invalid Input Duration" : "Duration : "+duration+" hours");
        System.out.println("Narrator : "+narrator);
    }    
}

public class BookManagementSystem
{
    public static void main(String args[])
    {
        Book book = new Book("Way to Success","R.K.Agarwal",-600.52);
        EBook ebook = new EBook("MYLife","M.K.Narayan",400,-10,"PDF");
        AudioBook audiobook = new AudioBook("Kesariya","Arjit Singh",-200,-1,"Arjit Singh");

        System.out.println("Book Details");
        System.out.println("----------------------------------");
        book.getDetails();
        book.applyDiscount(5);

        ebook.getDetails();
        ebook.applyDiscount(20);

        audiobook.getDetails();
        audiobook.applyDiscount(-50);
    }
}

/*  Tested with positive values
Book Details
----------------------------------
Title : Way to Success
Author : R.K.Agarwal
Price : 600.52
Discount Applied : 5.0%
Total Price after appling Discount : 30.03

EBook Details
----------------------------------
Title : MYLife
Author : M.K.Narayan
Price : 400.0
File Size : 10.0 MB
Format : PDF
Discount Applied : 20.0%
Total Price after appling Discount : 80.00        

Audio Book Details
----------------------------------
Title : Kesariya
Author : Arjit Singh
Price : 200.0
Duration : 1.0 hours
Narrator : Arjit Singh
Discount Applied : 50.0%
Total Price after appling Discount : 100.00
*/


/*  Tested with negative values
Book Details
----------------------------------
Title : Way to Success
Author : R.K.Agarwal
Invalid Input Price
Please provide Valid Price to apply discount      

EBook Details
----------------------------------
Title : MYLife
Author : M.K.Narayan
Price : 400.0
Invalid Input File Size
Format : PDF
Discount Applied : 20.0%
Total Price after appling Discount : 80.00

Audio Book Details
----------------------------------
Title : Kesariya
Author : Arjit Singh
Invalid Input Price
Invalid Input Duration
Narrator : Arjit Singh
Invalid Input Percentage and Price
*/