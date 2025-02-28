/*
Given a list of sentences (Strings), use flatMap to create a list of all unique words in lowercase.
*/

package classes;

import java.util.*;
import java.util.stream.*;

public class Example4
{
    public static void main(String args[])
    {
        List<String> sentences = Arrays.asList(
            "Java is a coding Language",
            "Java is powerful",
            "Streams are powerful in java"
        );

        sentences.stream().flatMap(str -> Arrays.stream(str.split("\\s+"))).map(s -> s.toLowerCase()).distinct().forEach(System.out::println);
    }
}

/*
java
is
a
coding
language
powerful
streams
are
in
*/