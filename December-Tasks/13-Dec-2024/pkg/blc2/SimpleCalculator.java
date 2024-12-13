//BLC class of CalculatorTest -> SimpleCalculator.java

package pkg.blc2;

public class SimpleCalculator implements Calculator
{

	@Override
	public void calculateSum(int... x) {
		int sum = 0;
		System.out.print("\nSum of ");
		for(int num: x) {
			System.out.print(num+" ");
			sum += num;
		}
		System.out.print("is : "+sum);
//		System.out.println("Sum of the numbers: "+sum);
	}

}
