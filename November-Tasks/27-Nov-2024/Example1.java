//Que 1 : Modeling Employee and Address Details 

package pkg.blc;

public class Example1
{
    public static void main(String args[])
    {
        Address add = new Address("Ameerpet","Hyderabad");

        Person person = new Person("Adi Reddy",add);

        System.out.println(person);


        Address address = new Address("123 Elm Street", "Springfield");
        Person per = new Person("John Doe", address);
        System.out.println(per);
    }
}

/*
Name : Adi Reddy, Street : Ameerpet, City : Hyderabad
Name : John Doe, Street : 123 Elm Street, City : Springfield
*/