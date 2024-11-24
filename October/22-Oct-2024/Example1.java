package com.blc;

public class Example1
{
    public static void main(String[] args)
    {
        Product product1 = new Product();
        product1.setProductData(101, "Laptop", 45000.00);
        product1.displayProductData();
    }
}

/*
Product ID: 101
Product Name: Laptop
Product Price: 45000.0
*/