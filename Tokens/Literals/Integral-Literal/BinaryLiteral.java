/*
If a numeric literal starts with 0B (Zero capital B) or 
0b (Zero small b) then it will become Binary literal. 
Binary literal is available from JDK 1.7v.
Here base is 2 so it will accept 2 digits i.e 0 and 1.
*/

package com.classes;


public class BinaryLiteral
{
	public static void main(String args[])
	{
		int a = 0b101;	//5
		int b = 0B111;	//7
		//int c = 0B112;	//8 Invalid due to 2 it is out of range
		int d = 0b00;	//0

		System.out.println(a);
		System.out.println(b);
		// System.out.println(c);
		System.out.println(d);
	}
}

/*
5
7
0
*/