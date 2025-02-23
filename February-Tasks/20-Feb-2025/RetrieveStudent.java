//  RetrieveStudent.java

import java.io.*;
import java.util.*;

public class RetrieveObject 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\Yash Walke\\Desktop\\student.txt");
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			ArrayList<Student> studentList = (ArrayList<Student>) ois.readObject();
//			ArrayList<Student> studentList = new ArrayList<>();
//			studentList.add((Student) ois.readObject());
			
			for(Student student: studentList) {
				System.out.println(student);
			}
		}catch(Exception e) {
			e.printStackTrace();		}
	}

}
