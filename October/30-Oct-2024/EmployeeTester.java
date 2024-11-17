//You've been assigned the task of developing a Java program to manage employee information and salary updates based on performance evaluations.
//ELC

public class EmployeeTester
{
    public static void main(String args[])
    {
        Employee e = new Employee("Virat Kohli",35,"Cricket",50000,"good");
        
        System.out.println("Name : "+e.getName());
        System.out.println(e.getAge() == -1 ? "Invalid Input Age" : "Age : "+e.getAge());
        System.out.println("Department : "+e.getDepartment());
        System.out.println(e.getSalary() == -1 ? "Invalid Input Salary" : "Salary : "+e.getSalary());
        System.out.println(e.getPerformance().equals("-1") ? "Invalid Input Performance It should be good, average or ok" : "Performance : " + e.getPerformance());
        System.out.println(e.updateSalary() == 0 ? "" : "Updated Salary : " + e.updateSalary());
    }
}

/* Tested with Positive and Correct Values
Name : Virat Kohli
Age : 35
Department : Cricket
Salary : 50000.0
Performance : good
Updated Salary : 60000.0
*/

/* Tested with Negative and Incorrect Values
Name : Ravi Shastri
Invalid Input Age
Department : Coaching
Invalid Input Salary
Invalid Input Performance It should be good, average or ok
*/