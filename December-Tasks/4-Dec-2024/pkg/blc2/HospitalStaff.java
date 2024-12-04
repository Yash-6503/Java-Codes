//BLC class of HospitalManagementSystem -> HospitalStaff.java

package pkg.blc2;

public class HospitalStaff
{
    private String name;
    private int age;
    private String role;

    public HospitalStaff(String name, int age, String role)
    {
        if(age > 0){
            this.name = name;
            this.age = age;
            this.role = role;
        }else{
            System.out.println("Error: Invalid Age");
            System.exit(0);
        }
    }

    public void work()
    {
        System.out.println(role+" "+name+" is working");
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return role;
    }

    public int getAge(){
        return age;
    }
}