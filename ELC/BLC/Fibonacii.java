package BLC;

public class Fibonacii 
{
	int num1;
	public Fibonacii(int num)
	{
		this.num1 = num;
	}
	
	public void fibonaciiSeries()
	{
		int r1 = 0;
		int r2 = 1;
		int sum = 0;
		System.out.println("Fibonacii Series is ");
		for(int i=0; i<num1; i++)
		{
			System.out.print(r1+" ");
			sum = r1 + r2;  //1 2 3 5 8
			r1 = r2;		//1 1 2 3 5
			r2 = sum;		//1	2 3 5 8
		}
	}
}
