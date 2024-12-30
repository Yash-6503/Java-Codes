/*
Program that demonstrates how to handle ClassCastException.
*/

package com.classes;

public class ClassCastExceptionDemo 
{
	public static void main(String[] args) 
	{
		handleClassCastException();
	}
	
	public static void handleClassCastException()
	{
		try {
			//for Succesfull casting
			System.out.println("Succesfull Casting");
			Object []objects1 = {"Hello", "World", "Java"};
			for(Object o : objects1) {
				String str = (String) o;
				System.out.println("Casting successful: "+str);
			}
			
			//for Unuccesfull casting
			System.out.println("\nUnsuccesfull Casting");
			Object []objects2 = {"Hello", 123, "Java"};
			for(Object o : objects2) {
				String str = (String) o;
				System.out.println("Casting successful: "+str);
			}
			
			//for Mixed type 
			System.out.println("\nMixed Types");
			Object []objects3 = {"Hello", true, "Java"};
			for(Object o : objects3) {
				String str = (String) o;
				System.out.println("Casting successful:"+str);
			}
			
		}catch(ClassCastException e) {
			System.err.println("ClassCastException: "+e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}

/*
Succesfull Casting
Casting successful: Hello
Casting successful: World
Casting successful: Java
*/

/*
Unsuccesfull Casting
Casting successful: Hello
ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')
	at Tasks/com.Dec_30_Tasks.ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:25)
	at Tasks/com.Dec_30_Tasks.ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:7)
*/

/*
Mixed Types
Casting successful:Hello
ClassCastException: class java.lang.Boolean cannot be cast to class java.lang.String (java.lang.Boolean and java.lang.String are in module java.base of loader 'bootstrap')
java.lang.ClassCastException: class java.lang.Boolean cannot be cast to class java.lang.String (java.lang.Boolean and java.lang.String are in module java.base of loader 'bootstrap')
	at Tasks/com.Dec_30_Tasks.ClassCastExceptionDemo.handleClassCastException(ClassCastExceptionDemo.java:33)
	at Tasks/com.Dec_30_Tasks.ClassCastExceptionDemo.main(ClassCastExceptionDemo.java:7)
*/
