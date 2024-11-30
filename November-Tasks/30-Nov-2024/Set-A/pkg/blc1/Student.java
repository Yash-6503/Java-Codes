//BLC class of StudentTeacher -> Student.java

package pkg.blc1;

public class Student extends Person
{
    int rollNumber;

    public Student(String name, int age, int rollNumber)
    {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    public void study()
    {
        System.out.println(name+" is studying");
    }
}