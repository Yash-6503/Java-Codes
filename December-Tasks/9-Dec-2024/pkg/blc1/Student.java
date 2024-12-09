//BLC class of StudentTester -> Student.java

package pkg.blc1;

abstract class Student
{
    protected String studentName;
    protected String studentClass;
    protected static int totalNoOfStudents;

    public Student(String studentName, String studentClass, int totalNoOfStudents)
    {
        this.studentName = studentName;
        this.studentClass = studentClass;
        this.totalNoOfStudents = totalNoOfStudents;
    }

    public Student(){}

    public abstract int getPercentage();

    public static int getTotalNoStudents()
    {
        return totalNoOfStudents;
    }

}