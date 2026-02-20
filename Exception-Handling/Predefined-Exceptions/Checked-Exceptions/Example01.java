// Program to handle checked predefined exception
// package com.classes;

import java.io.FileReader;
import java.io.IOException;

public class Example01 {

    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data1.txt"); // may throw IOException
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
    }
}

/* Output:
 * 1.
 * File opened successfully
 * 
 * 2.
 * Exception handled: data1.txt (The system cannot find the file specified)
 */