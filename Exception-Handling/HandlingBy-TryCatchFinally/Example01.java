// Program to Handle Exception and close resource using Finally Block.
// package com.classes;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Main method started...");
        try{
            System.out.println("Try Block Started.");
            System.out.println("Enter a value: ");
            int a = sc.nextInt();
            System.out.println("Enter b value: ");
            int b = sc.nextInt();
            System.out.println("Division of " + a + " and " + b + " is : " + (a / b));
            System.out.println("Try Block Executed.");
        } catch (Exception e) {
            System.out.println("Catch Block Executed.");
            e.printStackTrace();
        } finally {
            sc.close();
            System.out.println("Finally Executed.");
        }
        System.out.println("Main method Ended...");
    }    
}


/*
 * Output:
 * 1.
 * Main method started...
 * Try Block Started.
 * Enter a value:
 * 10
 * Enter b value:
 * 2
 * Division of 10 and 2 is : 5
 * Try Block Executed.
 * Finally Executed.
 * Main method Ended...
 * 
 * 
 * 2.
 * Main method started...
 * Try Block Started.
 * Enter a value:
 * 10
 * Enter b value:
 * 0
 * Catch Block Executed.
 * java.lang.ArithmeticException: / by zero
 * at Example01.main(Example01.java:17)
 * at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(
 * DirectMethodHandleAccessor.java:104)
 * at java.base/java.lang.reflect.Method.invoke(Method.java:565)
 * at jdk.compiler/com.sun.tools.javac.launcher.SourceLauncher.execute(
 * SourceLauncher.java:258)
 * at
 * jdk.compiler/com.sun.tools.javac.launcher.SourceLauncher.run(SourceLauncher.
 * java:138)
 * at
 * jdk.compiler/com.sun.tools.javac.launcher.SourceLauncher.main(SourceLauncher.
 * java:76)
 * Finally Executed.
 * Main method Ended...
 */