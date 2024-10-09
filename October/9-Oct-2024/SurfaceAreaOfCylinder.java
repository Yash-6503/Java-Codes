/*
write a java program to calculate the total surface area of a cylinder? 
 Formula : 2 pi square r * 2 pi r h (take the pi as 3.14).

 formula : Total Surface Area = 2πr(h + r)
*/

package com.classes;

public class SurfaceAreaOfCylinder
{
    public static void main(String args[])
    {
        final double pi = 3.14;
        int r = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);

        double surfaceArea = 2*pi*r*(h+r);

        System.out.println("Total Surface Area of Cylinder is "+surfaceArea);
    }
}

/*
Total Surface Area of Cylinder is 226.08
*/