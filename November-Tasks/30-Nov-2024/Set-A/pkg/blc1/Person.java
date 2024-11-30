//BLC class of StudentTeacher -> Person.java

package pkg.blc1;

public class Person
{
    String name;
    int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void displayDetails()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}