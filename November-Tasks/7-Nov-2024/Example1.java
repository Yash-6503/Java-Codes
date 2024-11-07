/*
1) create base class as Student

 Attribute :-
--------------

int studentId
string name
long mobile

define parametrized constructor to initialize the  instance variable

method:-
---------
return type:-void
method name:- display
behavior:- this method will print the detail of student

-----------

create derived class name as JobGuaranteeStudent

 Attribute :-

boolean placementGuarantee


define parametrized constructor to initialize the  instance variable
and also parent class properties


method:-

method:-
---------
return type:-void
method name:- displayStudentInfo
behavior:- this method will print the detail of student and also placementGuarantee true or false

------------------------------

define Tester class here use main method to test  your logic
*/

package com.classes;

class Student
{
    int studentId;
    String name;
    long mobile;
    public Student(int studentId, String name, long mobile)
    {
        this.studentId = studentId;
        this.name = name;
        this.mobile = mobile;
    }

    void display()
    {
        System.out.println("Student Id = "+studentId+", Name = "+name+", Mobile = "+mobile);
    }
}

class JobGuaranteeStudent extends Student
{
    boolean placementGuarantee;

    public JobGuaranteeStudent(int studentId, String name, long mobile, boolean placementGuarantee)
    {
        super(studentId,name,mobile);
        this.placementGuarantee = placementGuarantee;
    }

    void displayStudentInfo()
    {
        System.out.println("Student Id = "+studentId+", Name = "+name+", Mobile = "+mobile+", placementGuarantee = "+placementGuarantee);
    }
}


public class Example1
{
    public static void main(String args[])
    {
        JobGuaranteeStudent job = new JobGuaranteeStudent(101,"Virat Kohli",123456789,true);
        job.display();
        job.displayStudentInfo();
    }
}

/*
Student Id = 101, Name = Virat Kohli, Mobile = 123456789
Student Id = 101, Name = Virat Kohli, Mobile = 123456789, placementGuarantee = true
*/