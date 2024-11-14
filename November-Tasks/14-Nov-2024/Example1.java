package com.classes;

//A Hierarchical Model of Animals

class Animal
{
	private String name;
	
	public Animal(String name)
	{
		this.name = name;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void displayDetails()
	{
		System.out.println("Animal Name = "+name);
	}

}

class Mammal extends Animal 
{
	private boolean hasFur;
	
	public Mammal(String name, boolean hasFur)
	{
		super(name);
		this.hasFur = hasFur;
	}

	
	public boolean isHasFur() {
		return hasFur;
	}

	
	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		if(hasFur) {			
			System.out.println("Has Fur = Yes");
		}else {
			System.out.println("Has Fur = No");
		}
	}
	
}

class Dog extends Mammal 
{
	private String breed;
	
	public Dog(String name, boolean hasFur, String breed)
	{
		super(name,hasFur);
		this.breed = breed;
	}
	
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Breed = "+breed);
	}
}

public class Example1 {

	public static void main(String[] args) 
	{
		Dog d = new Dog("Buddy", true, "Golden Retriever");
		
		System.out.println("Dog Details");
		d.displayDetails();

	}
}

/*
Dog Details
Animal Name = Buddy
Has Fur = Yes
Breed = Golden Retriever
*/

/*
Dog Details
Animal Name = Sheru
Has Fur = No
Breed = Indian
*/