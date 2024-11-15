
class Animal 
{
	private String name;
	private int age;
	
	public Animal(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public void makeSound()
	{
		System.out.println("The animal makes a generic sound.");
	}
	
	public void displayInfo()
	{
		System.out.print("Name = "+name);
		if(age > 0) {
			System.out.print(", Age = "+age+"\n");
		}else {
			System.err.println("\nInvalid Age Error");
		}
	}	
}

class Lion extends Animal 
{
	private int maneLength;

	Lion(String name, int age, int maneLength)
	{
		super(name,age);
		this.maneLength = maneLength;
	}
	
	public int getManeLength()
	{
		return maneLength;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("The lion roars loudly.");
	}
	
	public void displayManeLength()
	{
		if(maneLength > 0) {
			System.out.println("Mane Length = "+maneLength+" cm");
		}else {
			System.err.println("Invalid Mane Lenght Error");
		}
	}
}

class Elephant extends Animal 
{
	private float tuskLength;
	
	public Elephant(String name, int age, float tuskLength)
	{
		super(name,age);
		this.tuskLength = tuskLength;
	}
	
	@Override
	public void makeSound()
	{
		System.out.println("The elephant trumpets.");
	}
	
	public void displayTuskLength()
	{
		if(tuskLength > 0) {
			System.out.println("Tusk Length = "+tuskLength+" meters");
		}else {
			System.err.println("Invalid Tusk Lenght Error");
		}
	}
	
}


public class ZooManagement 
{

	public static void main(String[] args) 
	{
		Lion lion = new Lion("Simba",5,20);
		Elephant elephant = new Elephant("Jumbo",10,(float) 2.5);
		
		System.out.println("Lion Details");
		lion.displayInfo();
		lion.makeSound();
		lion.displayManeLength();
		
		System.out.println("\nElephant Details");
		elephant.displayInfo();
		elephant.makeSound();
		elephant.displayTuskLength();
	}
}

/*
Lion Details
Name = Simba, Age = 5
The lion roars loudly.
Mane Length = 20 cm

Elephant Details
Name = Jumbo, Age = 10
The elephant trumpets.
Tusk Length = 2.5 meters
*/