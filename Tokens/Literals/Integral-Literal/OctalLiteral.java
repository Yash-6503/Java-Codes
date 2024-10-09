/*
If any Integer literal starts with 0 (Zero) then it will become octal literal. 
Here base is 8 so it will accept 8 digits i.e 0 to 7.
*/

package com.classes;

public class OctalLiteral
{
	public static void main(String args[])
	{
		int a = 0123;		//Octal literal
		int b = 0;			//Octal literal
		int c = 0777;		//Octal literal
		int d = 000;		//Octal literal
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}