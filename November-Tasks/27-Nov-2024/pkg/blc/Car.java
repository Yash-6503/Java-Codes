package pkg.blc;

public class Car
{
	private String brand;
 	private String model;
 	private int year;
 	private Driver driver;

 	public Car(String brand, String model, int year, Driver driver)
 	{
 		if(year <= 0){
 			System.out.println("Error Invalid Year");
 			return;
 		}
 		this.brand = brand;
 		this.model = model;
 		this.year = year;
 		this.driver = driver;
 	}

 	public Car(Car other)
 	{
 		this.brand = other.brand;
 		this.model = other.model;
 		this.year = other.year;
 		this.driver = new Driver(other.driver);
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

 	public void setYear(int year){
 		if(year <= 0){
 			System.out.println("Error Invalid Year");
 		}else{
 			this.year = year;
 		}
 	}

 	public Driver getDriver(){
 		return driver;
 	}

 	public void setDriver(Driver driver) {
        this.driver = driver;
    }

 	public void changeDriver(Driver newDriver)
 	{
 		this.driver = newDriver;
 	}

 	public void printDetails()
 	{
 		System.out.println("Car Brand : "+brand);
 		System.out.println("Car Model : "+model);
 		System.out.println("Car Year : "+year);
 		System.out.println("Driver Name : "+driver.getName());
 		System.out.println("Driver Age : "+driver.getAge());
 	}

}