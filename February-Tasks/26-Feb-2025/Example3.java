/*
write a Java program to filter out the students who are enrolled in the "Java" course and print 
their names using the forEach method and the stream API.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

record Student(String name, String course) {
	
}

public class Example4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		List<Student> list = new ArrayList<>();
		
		System.out.println("Enter number of students: ");
		int num = Integer.parseInt(sc.nextLine());
		
		String name, course;
		System.out.println("Enter "+num+" students: ");
		for(int i=0; i<num; i++)
		{
			name = sc.nextLine();
			course = sc.nextLine();
			list.add(new Student(name, course));
		}
		
		list.stream().filter(str -> str.course().equalsIgnoreCase("java")).map(str -> str.name()).forEach(System.out::println);		
	}
}

/*
Enter number of students: 
5
Enter 5 students: 
Alice
Java
Bob
Python
Charlie
Java
David
C++
Eve
Javascript
----------------
Alice
Charlie
*/