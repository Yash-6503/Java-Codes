//ELC class of Person, Student and Teacher -> StudentTeacher.java

package pkg.blc1;

public class StudentTeacher
{
    public static void main(String args[])
    {
        System.out.println("Student Details");
        Student s1 = new Student("Rahul", 20, 101);
        s1.displayDetails();
        s1.study();

        System.out.println("\nTeacher Details");
        Teacher t1 = new Teacher("Rajesh", 30, "Maths");
        t1.displayDetails();
        t1.teach();
    }
}

/*
Student Details
Name : Rahul
Age : 20
Rahul is studying

Teacher Details
Name : Rajesh
Age : 30
Rajesh is teaching Maths
*/