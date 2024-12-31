/*
Program that demonstrates how to handle ArrayStoreException. The program should include a 
method that attempts to store objects of incompatible types into an array of String[]. 
*/

package com.classes;

import java.util.Scanner;

public class ArrayStoreExample extends Exception
{
	public static void main(String[] args) 
	{
		try {
			storeObjects();
			System.out.println("Objects stored successfully.");
		}catch(ArrayStoreException e) {
			//System.out.print("ArrayStoreException Caught: Incompatible type: "+e.getMessage()+" cannot be stored in an array of java.lang.String");
			System.out.println(e.getMessage());
		}
	}
	
	public static void storeObjects()
	{
		Object[] stringArray = {"Hello","Hii","java",10};
		
		Scanner sc = new Scanner(System.in);
				
		String str[] = new String[5];
		
		int i=0;
		for(Object O : stringArray) {
			if(O instanceof String) {
				str[i] = (String) O;
			}else {
				throw new ArrayStoreException("Incompatble types");
			}
		}
		
	}

}

/*
ArrayStoreException Caught: Incompatible type: java.lang.Integer cannot be stored in an array of java.lang.String
*/
