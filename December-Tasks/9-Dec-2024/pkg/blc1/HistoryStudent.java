//BLC class of StudentTester -> HistoryStudent.java

package pkg.blc1;

public class HistoryStudent extends Student
{
    private int historyMarks;
    private int civicsMarks;

    public HistoryStudent(String studentName, String studentClass, int totalNoOfStudents, int historyMarks, int civicsMarks)
    {
        super(studentName, studentClass, totalNoOfStudents);
        if(historyMarks < 0 || historyMarks > 100 || civicsMarks < 0 || civicsMarks > 100)
        {
            System.out.println("Marks should be between 0 and 100");
            System.exit(0);
        }else{
            this.historyMarks = historyMarks;
            this.civicsMarks = civicsMarks;
        }
    }

    @Override
    public int getPercentage(){
        int percent = (historyMarks + civicsMarks) / 2;
        System.out.print("History Student Percentage: ");
        return percent;
    }
}