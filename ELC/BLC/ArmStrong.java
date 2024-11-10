package BLC;

public class ArmStrong 
{
	int num;
	public ArmStrong(int num)
	{
		this.num = num;
	}
	
	public void isArmStrong()
	{
		int m = num;
		int sum = 0;
		while(m!=0)
		{
			int digit = m%10;
			sum += Math.pow(digit,3); 
			m=m/10;
		}
		if(sum == num)
		{
			System.out.println(num+" is a Armstrong Number");
		}else {
			System.out.println(num+" is not a Armstrong Number");
		}
	}
}
