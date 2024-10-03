/*
Write a program to find out the area of circle by taking the value
    from Command line arguments
*/

public class AreaOfCircle
{
	public static void main(String args[])
	{
		double pi = 3.14;
		double area;
		int r;
		
		r = Integer.parseInt(args[0]);
		
		area = pi * r * r;
	
		System.out.println("Area of Circle is " +area);	
	}
}

/*
C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\October\3-Oct-2024>java AreaOfCircle 5
Area of Circle is 78.5
*/