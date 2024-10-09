
package com.dev.classes;

public class SquareCube
{
    public static void main(String args[])
    {
        SC obj1 = new SC();

        int sqr = Integer.parseInt(args[0]);
        int cube = Integer.parseInt(args[1]);

        System.out.println(obj1.sq(sqr));
        System.out.println(obj1.cb(cube));
    }
}

/*
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\Packages> javac -d . SquareCube.java
PS C:\Users\Yash Walke\Documents\NareshIT Lab\Daily-Tasks Java\Packages> java SquareCube.java  10 10
100
1000
*/