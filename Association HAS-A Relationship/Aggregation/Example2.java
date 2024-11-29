//Example of Changing car driver using a Aggregation

class Driver
{
    private String name;
    private int age;

    public Driver(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(int age){
        this.age = age;
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
    private Driver driver;

    public Car(String brand, Driver driver)
    {
        this.brand = brand;
        this.driver = driver;
    }

    //copy
    public Car(Car object)
    {
        this.brand = object.brand;
        this.driver = new Driver(object.driver.getName(),object.driver.getAge());
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    public String getBrand(){
        return brand;
    }

    public void changeDriver(Driver newDriver)
    {
        this.driver = newDriver;
    }

    public void printDetails(){
        System.out.println("Car Brand : "+brand);
        System.out.println("Driver Name : "+driver.getName());
        System.out.println("Driver Age : "+driver.getAge());
    }
}

class Example2
{
    public static void main(String args[])
    {
        Driver d1 = new Driver("John",35);

        Car car1 = new Car("Suzuki",d1);

        //copy
        Car copy = new Car(car1);

        System.out.println("Original Car details");
        car1.printDetails();

        System.out.println("\nCopied Car Details");
        copy.printDetails();

        Driver d2 = new Driver("Smith",40);
        car1.changeDriver(d2);

        System.out.println("\nOriginal Car Details After changing Driver");
        car1.printDetails();

        System.out.println("\nCopied Car Details After changing Driver");
        copy.printDetails();


    }
}