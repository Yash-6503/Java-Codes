/*
Write a program to handle NumberFormatException and NullPointerException in a single catch block.
*/

package com.classes;

import java.util.Scanner;

public class ExceptionHandlingDemo 
{
	public static void handleExceptions(String str) {
		
		try {
			if(str.equals("null")) {
				str = null;
			}
			System.out.println("Length of the input string: "+str.length());
			int intString = Integer.parseInt(str);
			System.out.println("Converted Number: "+intString);
		}catch(NumberFormatException | NullPointerException ne) {
			if(ne instanceof NumberFormatException) {
				System.out.println("NumberFormatException: Invalid input, not a number.");
				ne.printStackTrace();
			}else {
				System.out.println("NullPointerException: Attempted to operate on a null object.");
				ne.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to convert to an integer: ");
		String str = sc.nextLine();
		
		handleExceptions(str);
	}

}

/*
Enter a string to convert to an integer: 
123
Length of the input string: 3
Converted Number: 123
*/

/*
Enter a string to convert to an integer: 
abc
Length of the input string: 3
NumberFormatException: Invalid input, not a number.
java.lang.NumberFormatException: For input string: "abc"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at com.classes.ExceptionHandlingDemo.handleExceptions(ExceptionHandlingDemo.java:14)      
        at com.classes.ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:32)
        at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)
        at java.base/java.lang.reflect.Method.invoke(Method.java:578)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.execute(Main.java:435)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.run(Main.java:205)
        at jdk.compiler/com.sun.tools.javac.launcher.Main.main(Main.java:132)
*/

/*
Enter a string to convert to an integer: 
null
NullPointerException: Attempted to operate on a null object.
java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	at Tasks/com.Dec_26_Tasks.ExceptionHandlingDemo.handleExceptions(ExceptionHandlingDemo.java:11)
	at Tasks/com.Dec_26_Tasks.ExceptionHandlingDemo.main(ExceptionHandlingDemo.java:30)
*/



