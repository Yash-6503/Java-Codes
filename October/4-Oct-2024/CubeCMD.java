/*
1) Write a program to find out the cube of a number where number must be    taken from command line argument.
*/



public class CubeCMD
{
    public static void main(String[] num)
    {
        int x = Integer.parseInt(num[0]);

        int cube = x*x*x;

        System.out.println("The cube of "+x+" is "+cube);
    }
}

/*
b\Daily-Tasks Java\October\4-Oct-2024> java CubeCMD 5    
The cube of 5 is 125
*/