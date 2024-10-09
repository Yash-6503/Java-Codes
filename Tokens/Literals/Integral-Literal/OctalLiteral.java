/*
If any Integer literal starts with 0 (Zero) then it will become octal literal. 
Here base is 8 so it will accept 8 digits i.e 0 to 7.
*/

package com.classes;

public class OctalLiteral
{
	public static void main(String args[])
	{
		int a = 0123;		//Octal literal     //0123 = 1*8^2 + 2*8^1 + 3*8^0 = 83 
		int b = 0;			//Octal literal
		int c = 0777;		//Octal literal     //0777 = 7*8^2 + 7*8^1 + 7*8^0 = 511
		int d = 000;		//Octal literal
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

/*
83
0
511
0
*/