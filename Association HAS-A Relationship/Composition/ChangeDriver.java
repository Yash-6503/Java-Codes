//Program to Change Driver name using Composition HAS-A Relationship

class Driver
{
    private String name;
    private int age;

    public Driver(String name, int age)
    {
        if(age > 0){
            this.name = name;
            this.age = age;
        }else{
            System.out.println("Error Invalid Input Driver age");
            System.exit(0);
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("Error Invalid Input Driver age");
            System.exit(0);
        }
    }

    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
}

class Car
{
    private String brand;
    private String model;
    private int year;
    private Driver driver;

    public Car(String brand, String model, int year, String driverName, int driverAge)
    {
        if(year > 0 && driverAge > 0){
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.driver = new Driver(driverName,driverAge);
        }else if(year > 0 && driverAge <= 0){
            System.out.println("Error Invalid Input Driver Age");
            System.exit(0);
        }else if(driverAge > 0 && year <= 0){
            System.out.println("Error Invalid Input Year");
            System.exit(0);
        }else{
            System.out.println("Error Invalid Input Year and Driver Age");
            System.exit(0);
        }
    }


    public void printDetails(){
        System.out.println("Car Brand : "+brand);
        System.out.println("Car Model : "+model);
        System.out.println("Year : "+year);
        System.out.println("Driver Name : "+driver.getName());
        System.out.println("Driver Age : "+driver.getAge());
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }
    
    public void setYear(int year){
        if(year > 0){
            this.year = year;
        }else{
            System.out.println("Error Invalid Input Year");
            System.exit(0);
        }
    }

    public void setDriver(String driverName, int driverAge){
        if(driverAge > 0){
            this.driver = new Driver(driverName,driverAge);
        }else{
            System.out.println("Error Invalid Input Driver Age");
            System.exit(0);
        }
    }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public Driver getDriver(){
        return driver;
    }
}

public class ChangeDriver
{
    public static void main(String args[])
    {
        Car car1 = new Car("Hyundai", "Creta", 2020, "John", 35);

        System.out.println("Car and Driver Details");
        car1.printDetails();
        
        System.out.println("\nChanging Car Driver");

        car1.setDriver("Smith",40);

        car1.printDetails();
    }
}

/*
Car and Driver Details
Car Brand : Hyundai
Car Model : Creta
Year : 2020
Driver Name : John
Driver Age : 35

Changing Car Driver
Car Brand : Hyundai
Car Model : Creta
Year : 2020
Driver Name : Smith
Driver Age : 40
*/