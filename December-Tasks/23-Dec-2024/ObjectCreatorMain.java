/*
Program that utilizes a custom functional interface 
for object creation and updates object attributes using a Consumer.
*/

import java.util.function.*;
import java.util.*;

@FunctionalInterface
interface ObjectCreator
{
    Student create(int id, String name);
}

class Student
{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "Student = [id = "+id+", name = "+name+"]";
    }

    public void updateName(Consumer<String> nameUpdater)
    {
        nameUpdater.accept(name);
    }
}

public class ObjectCreatorMain
{
    public static void main(String args[])
    {
        ObjectCreator creator = (id,name)-> new Student(id,name);

        Student student = creator.create(1,"John");

        System.out.println("Original Student Details: "+student);

        Consumer<String> nameUpdater = (name) -> student.setName(name);

        nameUpdater.accept("John Updated");

        System.out.println("Updated Student Details: "+student);
    }
}

/*
Original Student Details: Student = [id = 1, name = John]
Updated Student Details: Student = [id = 1, name = John Updated]
*/