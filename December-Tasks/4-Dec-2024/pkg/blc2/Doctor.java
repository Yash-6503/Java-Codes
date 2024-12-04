//BLC class of HospitalManagementSystem -> Doctor.java

package pkg.blc2;

public class Doctor extends HospitalStaff
{
    private String specialization;

    public Doctor(String name, int age, String role, String specialization)
    {
        super(name, age, role);
        this.specialization = specialization;
    }

    @Override
    public void work()
    {
        System.out.println(getRole()+" "+getName()+" with specialization in "+specialization+" is treating patients.");
    }
}