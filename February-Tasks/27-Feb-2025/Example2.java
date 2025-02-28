/*
Use Stream.iterate or Stream.generate to create an infinite stream. Then filter and map the data to 
produce the first 10 odd squares.
*/

package classes;

import java.util.*;
import java.util.stream.*;

public class Example2
{
    public static void main(String args[])
    {
        List<Integer> s = Stream.iterate(1,n -> n+1).filter(num -> num%2!=0).map(n -> n*n).limit(10).collect(Collectors.toList());

        s.forEach(System.out::println);
    }
}

/*
1
9
25
49
81
121
169
225
289
361
*/