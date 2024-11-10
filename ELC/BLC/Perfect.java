package BLC;

public class Perfect 
{
	int num;
	public Perfect(int num)
	{
		this.num = num;
	}
	
	public void isPerfect()
	{
		int sum = 0;
		for(int i=1; i<num; i++)
		{
			if(num%i == 0)
			{
				sum += i;
			}
		}
		if(sum == num)
		{
			System.out.println(num+" is a Perfect Number");
		}else {
			System.out.println(num+" is not a Perfect Number");
		}
	}
}
