/*
Program to Create two user-defined functional interfaces and perform operations.
*/

@FunctionalInterface
interface Operation
{
    int perform(int a, int b);   
}

@FunctionalInterface
interface Greeting
{
    void greet(String name, int age);
}

public class Example1
{
    public static void main(String args[])
    {
        Operation opr = new Operation(){
            @Override
            public int perform(int a, int b){
                if(a>0 && b>0){
                    return (a*a)+(b*b);
                }else{
                    return a+b;
                }
            }
        };

        System.out.println(opr.perform(5,10));
        System.out.println(opr.perform(5,-10));

        Greeting greeting = new Greeting(){
            @Override 
            public void greet(String name, int age){
                if(age>=18){
                    System.out.println("Person is an Adult");
                }else if(name.length() > 5 && age < 18){
                    System.out.println("person has a long name and is not an adult yet.");
                }else{
                    System.out.println("Please provide appropriate message");
                }
            }
        };

        greeting.greet("Virat",40);
        greeting.greet("Anushka",15);
        greeting.greet("Raj",10);

    }
}

/*
125
-5

Person is an Adult
person has a long name and is not an adult yet.
Please provide appropriate message
*/