//BLC

public class Employee
{
    private String name;
    private int age;
    private String department;
    private double salary;
    private String performance;

    public Employee(String name, int age, String department, double salary, String performance)
    {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.performance = performance;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        if(age > 0){
            return age;
        }else{
            return -1;
        }
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        if(salary > 0){
            return salary;
        }else{
            return -1;
        }
    }

    public String getPerformance(){
        if(performance.equals("good") || performance.equals("average") || performance.equals("ok")){
            return performance;
        }else{
            return "-1";
        }
    }

    public double updateSalary(){
        if(performance.equals("good")){
            return getSalary() + 10000;
        }else if(performance.equals("average")){
            return getSalary() + 5000;
        }else{
            return 0;
        }
    }
}
