/*
Write a program to process a list of strings. Use a custom predicate to filter strings that start 
with a vowel and have a length greater than 5.
*/

package classes;

import java.util.*;
import java.util.stream.*;

public class Example1
{
    public static void main(String args[])
    {   
        List<String> list = Arrays.asList("Banana","Orange","Mango","Grapes","Apple","Litchy","Imly","Elephant");

        Set<Character> vowels = Set.of('a','e','i','o','u');

        list.stream().filter(str -> vowels.contains(Character.toLowerCase(str.charAt(0))) && str.length() > 5).forEach(System.out::println);
    }
}

/*
Orange
Elephant
*/