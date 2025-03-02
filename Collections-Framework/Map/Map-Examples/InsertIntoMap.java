//Program to insert values into Map Interface

package classes;

import java.util.*;

public class InsertIntoMap
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Map<Integer,String> map1 = new HashMap<>();

        map1.put(111,"Hello World");
        map1.put(222,"Hello Java");

        System.out.println(map1);
    }
}

/*
{222=Hello Java, 111=Hello World}
*/