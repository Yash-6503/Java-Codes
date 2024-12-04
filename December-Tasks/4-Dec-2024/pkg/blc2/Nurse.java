//BLC class of HospitalManagementSystem -> Nurse.java

package pkg.blc2;

public class Nurse extends HospitalStaff
{
    private int yearsOfExperience;

    public Nurse(String name, int age, String role, int yearsOfExperience)
    {   
        super(name,age,role);
        if(yearsOfExperience > 0){
            this.yearsOfExperience = yearsOfExperience;
        }else{
            System.out.println("Error: Invalid Experience");
            System.exit(0);
        }
    }

    @Override
    public void work()
    {
        System.out.println(getRole()+" "+getName()+" with "+yearsOfExperience+" years of experience is taking care of patients.");
    }
}