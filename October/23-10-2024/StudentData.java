/*
A BLC (Business Logic Class) called Student is given to you.
Instance Variables: 
studentId :private-int
studentName : private-String
marks: private-int
grade: private-char

method : calculateGrade():public:void

Create a method public void setStudentData() with the parameters: studentId, studentName, marks.

Note that grade is not set through method because it is a calculated value.

Methods :
displayDetails(): This method should return a String with  the details of the student in the following format:
Student [name=John Smith, studentId=123, marks=95, grade=A] 

calculateGrade(): This is a public method that calculates the grade based on the marks that is set. 
If marks is above 90, grade is set to A. 
If marks is between 81 and 90, grade is set to B, 
if marks is between 71 and 80, grade is set to C, 
if marks is between 61 and 70, grade is set to D, 
if marks is less than 61, grade is set to E.
Use this method when you need to set or reset grade.

An ELC(Executable Logic class) Tester with main method is given to you to test your code.

*/

package com.classes;

// import com.BLC;

public class StudentData
{
    public static void main(String args[])
    {
        Student s1 = new Student();
        s1.setStudentData(101,"John Smith",95);
        s1.calculateGrade();
        System.out.println(s1.displayDetails());
    }
}

