package BLC;

public class Prime {
	
	int num;
	
	public Prime(int num)
	{
		this.num = num;
	}
	
	public void checkPrime()
	{
		if(num <= 1)
        {
            System.out.println("1 is Prime number");
            return;
        }

        int count = 0;
        for(int i=1; i<=num; i++)
        {
            if(num%i == 0)
            {
                count++;
            }
        }
        
        if(count == 2)
        {            
        	System.out.println(num+" is a Prime number");
        }else{
            System.out.println(num+" is not a Prime number");
        }
	}
}
