//BLC class of StudentTester -> ScienceStudent.java

package pkg.blc1;

public class ScienceStudent extends Student
{
    private int physicsMarks;
    private int chemistryMarks;
    private int mathsMarks;

    public ScienceStudent(String studentName, String studentClass, int totalNoOfStudents, int physicsMarks, int chemistryMarks, int mathsMarks)
    {
        super(studentName, studentClass, totalNoOfStudents);
        if(physicsMarks < 0 || physicsMarks > 100 || chemistryMarks < 0 || chemistryMarks > 100 || mathsMarks < 0 || mathsMarks > 100)
        {
            System.out.println("Marks should be between 0 and 100");
            System.exit(0);
        }else{
            this.physicsMarks = physicsMarks;
            this.chemistryMarks = chemistryMarks;
            this.mathsMarks = mathsMarks;
        }
    }

    @Override 
    public int getPercentage(){
        int percent = (physicsMarks + chemistryMarks + mathsMarks)/3;
        System.out.print("Science Student Percentage: ");
        return percent;
    }


}