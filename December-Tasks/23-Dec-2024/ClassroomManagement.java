/*
Program to Adjust Classroom Chairs Using UnaryOperator
*/

import java.util.*;
import java.util.function.*;

class Classroom
{
    private int chairs;

    public Classroom(int chairs){
        this.chairs = chairs;
    }

    public void setChairs(int chairs){
        this.chairs = chairs;
    }

    public int getChairs(){
        return chairs;
    }

   @Override
	public String toString() {
		return "Classroom [chairs=" + chairs + "]";
	}

    public static UnaryOperator<Classroom> adjustChairs(Classroom cls){
        return classroom -> {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of Students: ");
            int students = sc.nextInt();

            if(students > cls.getChairs()){
                System.out.println("You need to arrange the chairs..");
                int total = students - cls.getChairs();
                cls.setChairs(total);
            }else if(students < cls.getChairs()){
                System.out.println("You need to decrease the chairs..");
                int total = cls.getChairs() - students;
                cls.setChairs(total);
            }else if(students == cls.getChairs()){
                System.out.println("No need to arrange the chairs..");
            }
            return classroom;
        };
    }
}

public class ClassroomManagement
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter chairs available in class: ");
        int chairs = sc.nextInt();

        Classroom room = new Classroom(chairs);

        UnaryOperator<Classroom> adjust = Classroom.adjustChairs(room);

        room = adjust.apply(room);

        System.out.println(room);
    }
}

/*
Enter chairs available in class: 
100
Enter number of Students: 
200

You need to arrange the chairs..
Classroom [chairs=100]
*/

/*
Enter chairs available in class: 
100
Enter number of Students: 
50
You need to decrease the chairs..
Classroom [chairs=50]
*/

/*
Enter chairs available in class: 
100
Enter number of Students: 
100
No need to arrange the chairs..
Classroom [chairs=100]
*/