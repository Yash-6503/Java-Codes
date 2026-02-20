// Program to handle unchecked predefined exception
// package com.classes;

public class Example01 {
    public static void main(String[] args) {
        
        // Here, ArithmeticException will be handled by JVM's default Exception handler
        System.out.println(10 / 0);

    }
}

/* Output:
 * Exception in thread "main" java.lang.ArithmeticException: / by zero
 * at Example01.main(Example01.java:8)
*/