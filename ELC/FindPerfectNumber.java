/*write a java pogram to check given program is perfect number or not ?
  A perfect number is a positive integer that is equal to the sum of its positive proper divisors, or divisors excluding the number itself.
  For example, 6 is a perfect number because 1 + 2 + 3 = 6.      
  other ex: 28, 496, and 8128.
*/

package ELC;

import java.util.*;

import BLC.*;

public class FindPerfectNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		Perfect p = new Perfect(num);
		
		p.isPerfect();
	}
}
