package pkg.blc;

public class Example1
{
    public static void main(String args[])
    {
        Address add = new Address("Nashik","Nashik","Maharashtra");
        Employee emp = new Employee(101,"Virat Kohli",add);

        System.out.println(emp);
    }
}

/* Tested with positive values
Employee Id : 101, Name : Virat Kohli, City : Nashik, District : Nashik, State : Maharashtra
*/

/*  Tested with negative values
Error Invalid Employee Id
Employee Id : 0, Name : null, null
*/