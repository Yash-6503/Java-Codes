// Program to Handle Exception using Try-Catch block.
// package com.classes;

public class Example01{
    public static void main(String... args) {
        
        try{
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}

/* Output:
 * java.lang.ArithmeticException: / by zero
 * at Example01.main(Example01.java:7)
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
*/