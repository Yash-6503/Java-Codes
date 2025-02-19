/*
create a simple Student Grade Book application in Java. 
The program should allow users to maintain a list of students along with their grades, 
add new students and grades, remove existing students, and exit the application.
*/

import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		HashMap<String,String> gradeBook = new HashMap<String,String>();
		do {
			System.out.println("\nStudent Grade Application");
			System.out.println("1. Add Student Grade");
			System.out.println("2. Remove Student Grade");
			System.out.println("3. Display student and their grades");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
		
			
				switch(choice) {
					case 1:
						System.out.println("Enter student name: ");
						sc.nextLine();
						String name = sc.nextLine();
						System.out.println("Enter student grade: ");
						String grade = sc.nextLine();
						gradeBook.put(name, grade);
						System.out.println("grade has been added for the student.");
						break;
						
					case 2:
						if(gradeBook.isEmpty()) {
							
						}else {
							System.out.println("Enter student name whose grade you want to remove: ");
							sc.nextLine();
							String sName = sc.nextLine();
							if(gradeBook.containsKey(sName)) {								
								gradeBook.remove(sName);
								System.out.println("Student and grade removed successfully");
							}else {
								System.out.println("Student not found");
							}
						}
						break;
						
					case 3:
						 if (gradeBook.isEmpty()) {
		                        System.out.println("There are no students and grades to display.");
		                    } else {
		                        System.out.println("Student Grades: ");
		                        gradeBook.forEach((k,v)->System.out.println(k+" : "+v));
		                    }
		                    break;
						
					case 4:
						System.out.println("Exiting....");
						System.exit(0);
						
					default:
						System.out.println("Invalid Choice");
				}

		}while(choice != 4);
	}

}

/*

Student Grade Application
1. Add Student Grade
2. Remove Student Grade
3. Display student and their grades
4. Exit
Enter your choice: 
1
Enter student name: 
Scott
Enter student grade: 
A
grade has been added for the student.

Student Grade Application
1. Add Student Grade
2. Remove Student Grade
3. Display student and their grades
4. Exit
Enter your choice: 
1
Enter student name: 
Smith
Enter student grade: 
O+
grade has been added for the student.

Student Grade Application
1. Add Student Grade
2. Remove Student Grade
3. Display student and their grades
4. Exit
Enter your choice: 
3
Student Grades: 
Smith : O+
Scott : A

Student Grade Application
1. Add Student Grade
2. Remove Student Grade
3. Display student and their grades
4. Exit
Enter your choice: 
2
Enter student name whose grade you want to remove: 
Alex
Student not found

Student Grade Application
1. Add Student Grade
2. Remove Student Grade
3. Display student and their grades
4. Exit
Enter your choice: 
2
Enter student name whose grade you want to remove: 
Scott
Student and grade removed successfully

Student Grade Application
1. Add Student Grade
2. Remove Student Grade
3. Display student and their grades
4. Exit
Enter your choice: 
3
Student Grades: 
Smith : O+

Student Grade Application
1. Add Student Grade
2. Remove Student Grade
3. Display student and their grades
4. Exit
Enter your choice: 
4
Exiting....
*/
