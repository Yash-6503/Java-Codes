//ELC (main) class of Student, ScienceStudent, HistoryStudent -> StudentTester.java

package pkg.blc1;

public class StudentTester
{
    public static void main(String args[])
    {
        ScienceStudent sc = new ScienceStudent("Rahul", "10th", 101, 90, 80, 70);
        System.out.println(sc.getPercentage());

        HistoryStudent history = new HistoryStudent("Rahul", "10th", 101, 90, 80);
        System.out.println(history.getPercentage());
        
    }
}

/*  Tested with Positive values
Science Student Percentage: 80
History Student Percentage: 85  
*/

/*  Tested with Negative values
Marks should be between 0 and 100   
*/