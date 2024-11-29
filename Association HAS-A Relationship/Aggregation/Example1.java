//Program on Aggregation

// Employee class
class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getDetails() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

// Department class
class Department {
    private String deptName;
    private Employee employees;

    public Department(String deptName, Employee employees) {
        this.deptName = deptName;
        this.employees = employees;
    }

    public void showDepartmentDetails() {
        System.out.println("Department: " + deptName + ", "+employees.getDetails());   
    }
}

// Main class to test
public class Example1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John Doe", 101);
        
        Department dept = new Department("IT", emp1);
        dept.showDepartmentDetails();
    }
}
