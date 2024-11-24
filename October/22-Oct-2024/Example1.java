package com.blc;

import java.util.Scanner;

public class Example1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Product Id: ");
        int productId = sc.nextInt();

        System.out.println("Enter the Product Name: ");
        sc.next();
        String productName = sc.nextLine();

        System.out.println("Enter the Product Price: ");
        double productPrice = sc.nextDouble();

        Product product1 = new Product();
        product1.setProductData(productId, productName, productPrice);
        product1.displayProductData();
    }
}

/*
Enter the Product Id: 
101
Enter the Product Name: 
Laptop
Enter the Product Price: 
50000
Product ID: 101
Product Name: 
Product Price: 50000.0
*/