/*
2) Write a program to find out the area of Rectangle where length and  breadth of the Rectangle must be taken from user from command line argument..
*/

public class AreaOfRectangleCMD
{
    public static void main(String[] args)
    {
        int area, length, breadth;

        length = Integer.parseInt(args[0]);
        breadth = Integer.parseInt(args[1]);

        area = length * breadth;

        System.out.println("Area of Rectangle is "+area);
    }
}

/*
b\Daily-Tasks Java\October\4-Oct-2024> java AreaOfRectangleCMD 5 5  
Area of Rectangle is 25
*/