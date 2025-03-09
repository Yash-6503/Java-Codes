//Insert elements into array list

package com.classes;

import java.util.*;

public class InsertIntoArrayList
{
    public static void main(String args[])
    {
        ArrayList<String> list = new ArrayList<>();

        list.add("Virat");
        list.add("Rohit");
        list.add("Abhi");
        list.add("Kartik");
        list.add("Sarthak");

        System.out.println("Player Names : "+list);

        //another approach

        ArrayList<String> fruits = new ArrayList<>(
            Arrays.asList(
            "Mango",
            "Grapes",
            "Apple",
            "Orange",
            "Banana"
        ));

        System.out.println("Fruits Names : "+fruits);
    }
}

/*
Player Names : [Virat, Rohit, Abhi, Kartik, Sarthak]
Fruits Names : [Mango, Grapes, Apple, Orange, Banana]
*/