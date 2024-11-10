/*
write a java pogram to check given program is armstrong number or not ?  
 153   (1^3 + 5^3 + 3^3 equals 153.) , 371
*/

import BLC.*;

import java.util.*;

public class FindArmStrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		ArmStrong a = new ArmStrong(num);
		
		a.isArmStrong();
		
	}
}
