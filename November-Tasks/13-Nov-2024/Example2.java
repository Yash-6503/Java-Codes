package com.classes;

class Student
{
	protected String name;
	protected int rollNumber;
	
	Student(String name, int rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	public void displayDetails()
	{
		System.out.println("Name = "+name);
		System.out.println("Roll number = "+rollNumber);
	}
	
	
	public double calculatePercentage()
	{
		return 0;
	}
}

class ScienceStudent extends Student
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	
	ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks)
	{
		super(name,rollNumber);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Science Student Details");
		super.displayDetails();
		if(physicsMarks > 0) {			
			System.out.println("Physics Marks = "+physicsMarks);
		}else {
			System.err.println("Error Invalid Input");
		}
		
		if(chemistryMarks > 0) {			
			System.out.println("Chemistry Marks = "+chemistryMarks);
		}else {
			System.err.println("Error Invalid Input");
		}
		
		if(mathMarks > 0) {			
			System.out.println("Math Marks = "+mathMarks);
		}else {
			System.err.println("Error Invalid Input");
		}
	}
	
	@Override
	public double calculatePercentage()
	{
		return (physicsMarks + chemistryMarks + mathMarks) / 3;
	}
	
}

class ArtsStudent extends Student
{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	
	ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks)
	{
		super(name,rollNumber);
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}
	
	@Override
	public void displayDetails()
	{
		System.out.println("Arts Student Details");
		super.displayDetails();
		if(historyMarks > 0) {			
			System.out.println("History Marks = "+historyMarks);
		}else {
			System.err.println("Error Invalid Input");
		}
		
		if(geographyMarks > 0) {			
			System.out.println("Geography Marks = "+geographyMarks);
		}else {
			System.err.println("Error Invalid Input");
		}
		
		if(englishMarks > 0) {			
			System.out.println("English Marks = "+englishMarks);
		}else {
			System.err.println("Error Invalid Input");
		}
	}
	
	@Override
	public double calculatePercentage()
	{
		return (historyMarks + geographyMarks + englishMarks) / 3;
	}
	
}



public class Example2 
{
	public static void main(String[] args) {
		ScienceStudent s = new ScienceStudent("Anjali", 101, 85, 90, 80);
        ArtsStudent a = new ArtsStudent("Aryan", 102, 75, 80, 85);
        
        s.displayDetails();
		System.out.println("Science Student Percentage = "+s.calculatePercentage());
        
		System.out.println();
		
		a.displayDetails();
		System.out.println("Arts Student Percentage = "+a.calculatePercentage());
	}
}
