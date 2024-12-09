//ELC (main) class of Student, ScienceStudent, HistoryStudent -> StudentTester.java

package pkg.blc1;

public class StudentTester
{
    public static void main(String args[])
    {
        System.out.println("Science Student Details");
        ScienceStudent sc = new ScienceStudent("Rahul", "10th", 10, 90, 80, 70);
        System.out.println(sc);
        System.out.println(sc.getPercentage()+"%");
        System.out.println("Total No. of Students: "+sc.getTotalNoStudents());

        System.out.println("\nHistory Student Details");
        HistoryStudent history = new HistoryStudent("Kiran", "10th", 10, 90, 80);
        System.out.println(history);
        System.out.println(history.getPercentage()+"%");
        System.out.println("Total No. of Students: "+history.getTotalNoStudents());
        
    }
}

/*  Tested with Positive values
Science Student Details
Student Name: Rahul
Student Class: 10th
Percentage: 80%
Total No. of Students: 10

History Student Details
Student Name: Kiran
Student Class: 10th
Percentage: 85%
Total No. of Students: 20
*/

/*  Tested with Negative values
Marks should be between 0 and 100   
*/