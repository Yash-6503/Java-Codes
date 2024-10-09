/*
If any integric literal starts with 0X or 0x (Zero capital X Or 0 small x) 
then it is hexadecimal literal. Here base is 16 so it will accept 16 digits 
i.e 0 to 9 and A to F OR [a to f]
*/

package com.classes;

public class HexaDecimalLiterals
{
	public static void main(String args[])
	{
		int a = 0x123;	//291
		int b = 0X33;	//51
		int c = 0xadd;	//2781
		//int d = 0XAge;	//Invalid

		System.out.println(a);		
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);	//error
	}
}

/*
291
51
2781
*/