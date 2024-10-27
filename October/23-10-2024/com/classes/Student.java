package com.classes;

public class Student 
{
    private int studentId;
    private String name;
    private int marks;
    private char grade;

    public void setStudentData(int studentId, String name, int marks)
    {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }

    public void calculateGrade()
    {
        if(marks > 90 && marks <= 100)
        {
            grade = 'A';
        }
        else if(marks > 80 && marks <= 90)
        {
            grade = 'B';
        }
        else if(marks > 70 && marks <= 80)
        {
            grade = 'C';
        }
        else if(marks > 60 && marks <= 70)
        {
            grade = 'D';
        }
        else{
            grade = 'E';
        }
    }

    public String displayDetails()
    {
        // Student [name=John Smith, studentId=123, marks=95, grade=A] 
        return "Student [name = "+name+", studentId = "+studentId+", marks = "+marks+", grade = "+grade+"]";
    }
}