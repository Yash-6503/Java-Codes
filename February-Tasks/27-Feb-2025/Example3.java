/*
Given a list of strings, sort them by length first and lexicographically second. 
Implement this using sorted.
*/

package classes;

import java.util.*;
import java.util.stream.*;

public class Example3
{
    public static void main(String args[])
    {
        List<String> list = Arrays.asList("Orange","Apple","Kiwi","Banana","Pear","Grapes","Mango");

        list.stream().sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
    }
}

/*
Kiwi
Pear
Apple
Mango
Banana
Grapes
Orange
*/