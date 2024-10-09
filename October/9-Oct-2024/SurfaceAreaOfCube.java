/*
Write a java program to calculate the curved surface area of a cube?
 Formula : 6*side Square.
*/

package com.classes;

public class SurfaceAreaOfCube
{
    public static void main(String args[])
    {
        int side = Integer.parseInt(args[0]);

        int surfaceArea = 6*(side*side);

        System.out.println("Curved Surface Area of cube is "+surfaceArea);
    }
}

/*
Curved Surface Area of cube is 96
*/