/*
Program that demonstrates method overriding where the superclass method throws a checked 
exception (ClassNotFoundException), and the subclass overrides this method to handle various cases and 
throw appropriate exceptions (IllegalArgumentException).
*/

import java.util.Scanner;

class ParentClass
{
	public void loadingClass(String className) throws ClassNotFoundException
	{
		Class.forName(className);
		System.out.println("Class loaded successfully");
	}
}

class ChildClass extends ParentClass
{
	@Override
	public void loadingClass(String className)
	{
		if(className.equalsIgnoreCase("")) {
			throw new IllegalArgumentException("Class Name cannot be Empty.");
		}else {			
			try {
				super.loadingClass(className);
			}catch(ClassNotFoundException e) {
				System.out.println("Error loading class in ChildClass. Converting to unchecked exception.");
				System.out.println("ClassNotFoundException caught: Unchecked Exception: RuntimeException from ChildClass");
				
			}
			
		}
		
	}
}

public class Tester 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		ChildClass child = new ChildClass();
		
		System.out.println("Enter a class name: ");
		String className = sc.nextLine();
		
		try {
			child.loadingClass(className);
		}catch(Exception e){
			System.out.println(e);
		}
	}

}

/*
Enter a class name: 
java.lang.Object
Class loaded successfully
*/

/*
Enter a class name: 
hello
Error loading class in ChildClass. Converting to unchecked exception.
ClassNotFoundException caught: Unchecked Exception: RuntimeException from ChildClass
*/

/*
Enter a class name: 

java.lang.IllegalArgumentException: Class Name cannot be Empty.
*/
