package pkg.blc;

public class Employee
{
    private int empId;
    private String empName;
    private Address address;

    public Employee(int empId, String empName, Address address)
    {
        if(empId <= 0){
            System.out.println("Error Invalid Employee Id");
        }else{
            this.empId = empId;
            this.empName = empName;
            this.address = address;
        }
    }

    @Override
    public String toString(){
        return "Employee Id : "+empId+", Name : "+empName+", "+address;
    }
}