/*
Write a Java program that processes a list of names to filter, sort, and print names with a length of exactly 4 characters.
Requirements:
Use a list of strings containing names as input.
Filter out names that are not exactly 4 characters long.
Sort the filtered names in lexicographical order (alphabetical order).
Limit the output to the first 2 names after sorting.
Print each name on a new line.
*/

package classes;

import java.util.*;
import java.util.stream.*;

public class Example5
{
    public static void main(String args[])
    {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");

        list.stream().filter(names -> names.length() < 5).sorted(Comparator.naturalOrder()).limit(2).forEach(System.out::println);
    }
}

/*
Alex
Anna
*/