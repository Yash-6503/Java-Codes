// Store Student objects in a file using Serialization

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StoreStudent
{
	public static void main(String[] args) 
	{
		ArrayList<Student> studentList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many Students you want to store: ");
		int count = sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			System.out.println("\nEnter student ("+i+") details: ");
			studentList.add(Student.getStudentObject());
		}
		
		System.out.println("\nStudent List");
		studentList.forEach(System.out::println);
		
		try {
			FileOutputStream Fin = new FileOutputStream("C:\\Users\\Yash Walke\\Desktop\\student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(Fin);
			oos.writeObject(studentList);
            System.out.println("\nStudent objects successfully serialized to Student.txt");
//			Fin.wr
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

/*
Enter how many Students you want to store: 
2

Enter student (1) details: 
Enter Student Id: 
111
Enter Student Name: 
Yash Walke
Enter Student Fees: 
30000
Enter Date of Admission (dd-MM-yyyy): 
06-07-2024

Enter student (2) details: 
Enter Student Id: 
222
Enter Student Name: 
Harsh Jadhav
Enter Student Fees: 
15000
Enter Date of Admission (dd-MM-yyyy): 
27-10-2023

Student List
Student [studentId=111, studentName=Yash Walke, studentFees=30000.0, dateOfAdmission=Sat Jul 06 00:00:00 IST 2024]
Student [studentId=222, studentName=Harsh Jadhav, studentFees=15000.0, dateOfAdmission=Fri Oct 27 00:00:00 IST 2023]

Student objects successfully serialized to Student.txt
*/
