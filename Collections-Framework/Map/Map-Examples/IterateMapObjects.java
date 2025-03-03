//Program to iterate the Map elements and display it

import java.util.*;

public class IterateMapObjects
{
    public static void main(String args[])
    {
        Map<Integer,String> map = new HashMap<>();

        map.put(111,"Hello");
        map.put(222,"Java");
        map.put(333,"Coders");

        //direct by using toString() method of map
        System.out.println("Iterating directly by using toString() method of map");
        System.out.println(map);

        //by using forEach() method of map
        System.out.println("\nIterating by using forEach() method of map");
        map.forEach((k,v) -> System.out.println("key = "+k+", value = "+v));

        //by using StreamApi
        System.out.println("\nIterating by using StreamApi");
        map.entrySet().stream().forEach(entry -> 
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }
}

/*
Iterating directly by using toString() method of map
{333=Coders, 222=Java, 111=Hello}

Iterating by using forEach() method of map
key = 333, value = Coders
key = 222, value = Java
key = 111, value = Hello

Iterating by using StreamApi
Key: 333, Value: Coders
Key: 222, Value: Java
Key: 111, Value: Hello
*/