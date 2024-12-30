/*
Program that demonstrates how to handle ClassNotFoundException. The program should prompt the 
user to enter a class name and attempt to load that class using reflection.
*/

package com.classes;

import java.util.Scanner;

public class ClassNotFoundExpDemo 
{
	public ClassNotFoundExpDemo(String classname) 
	{
		try {
			Class.forName(classname);
			System.out.println("Class "+classname+" found: "+classname);
		}catch(ClassNotFoundException e) {
			System.out.println("Class "+classname+" not found.");
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Classname to laod: ");
		String str = sc.nextLine();
		
		ClassNotFoundExpDemo c = new ClassNotFoundExpDemo(str);
	}

}

/*
Enter the Classname to laod: 
java.lang.String
Class java.lang.String found: java.lang.String
*/

/*
Enter the Classname to laod: 
NonExistentClass
Class NonExistentClass not found.
java.lang.ClassNotFoundException: NonExistentClass
	at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:641)
	at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:188)
	at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	at java.base/java.lang.Class.forName0(Native Method)
	at java.base/java.lang.Class.forName(Class.java:391)
	at java.base/java.lang.Class.forName(Class.java:382)
	at Tasks/com.Dec_30_Tasks.ClassNotFoundExpDemo.<init>(ClassNotFoundExpDemo.java:10)
	at Tasks/com.Dec_30_Tasks.ClassNotFoundExpDemo.main(ClassNotFoundExpDemo.java:26)
*/

