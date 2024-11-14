package com.classes;

//Student Fee Management System

class Student 
{
	protected int studentId;
	protected String name;
	protected double examFee;
	
	public Student(int studentId, String name, double examFee)
	{
		if (studentId <= 0) {
	            System.err.println("Error Invalid Input of Student Id");
	    }else if(examFee <= 0) {
	    	System.err.println("Error Invalid Input of Exam Fee");
	    }
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	
	public String toString()
	{
		return "[name = "+name+", studentId = "+studentId+", exam fee = "+examFee+"]";
	}
	
	public double payFee(int amount) {
		if (amount <= 0) {
            System.err.println("Provided Amount is Invalid : "+amount);
            return -1;
        }
		
		if(examFee == amount && examFee > 0)
		{
			System.out.println("All Fees are clear");
			System.out.println("Paid Amount is "+amount);
		}else if(examFee < amount && examFee > 0){
			System.out.println("All Fees are clear\nRemaining amount to pay you is "+(amount - examFee));
		}else if(examFee > amount && examFee > 0){
			System.out.println("Paid amount is "+amount);
			System.out.println("Remaining amount to pay is "+(examFee - amount));
		}else {
			System.out.println("Provided ExamFee is Invalid : "+examFee);
		}
		return 0;
	}
}

class DayScholar extends Student 
{
	protected double transportFee;
	
	public DayScholar(int studentId, String name, double examFee, double transportFee)
	{
		super(studentId,name,examFee);
		if(transportFee <= 0) {
			System.err.println("Invalid Input Error of Transport Fee");
		}
		this.transportFee = transportFee;
	}
	
	public String displayDayScholar()
	{
		return "[transport fee = "+transportFee+", name = "+name+", studentId = "+studentId+", exam fee = "+examFee+"]";
	}
	
	@Override
	public double payFee(int amount) {
		if (amount <= 0) {
            System.err.println("Provided Amount is Invalid : "+amount);
            return -1;
        }
		
		double total = examFee + transportFee;
		if(total == amount && transportFee > 0 && examFee > 0)
		{
			System.out.println("All Fees are clear");
		}else if(total < amount && transportFee > 0 && examFee > 0){
			System.out.println("All Fees are clear\nRemaining amount to pay you is "+(amount - total));
		}else if(total > amount && transportFee > 0 && examFee > 0) {
			System.out.println("Remaining amount to pay is "+(total - amount));
		}else {
			if(transportFee < 0 && examFee > 0) {
				System.out.println("Provided Transport Fee is Invalid : "+transportFee);
			}else if(examFee < 0 && transportFee > 0) {
				System.out.println("Provided Exam Fee is Invalid : "+examFee);
			}else if(transportFee < 0 && examFee < 0) {
				System.out.println("Provided Transport Fee and Exam Fee is Invalid : "+transportFee+", "+examFee);
			}
		}
		
		return 0;
	}

}

class Hosteller extends Student 
{
	protected double hostelFee;
	
	public Hosteller(int studentId, String name, double examFee, double hostelFee)
	{
		super(studentId,name,examFee);
		if(hostelFee <= 0) {
			System.err.println("Invalid Input Error of Hostel Fee");
		}
		this.hostelFee = hostelFee;
	}
	
	public String displayHosteller()
	{
		return "[hostel fee = "+hostelFee+", name = "+name+", studentId = "+studentId+", exam fee = "+examFee+"]";	
	}
	
	@Override
	public double payFee(int amount) {
		if (amount <= 0) {
            System.err.println("Provided Amount is Invalid : "+amount);
            return -1;
        }
		
		double total = examFee + hostelFee;
		if(total == amount && hostelFee > 0  && examFee > 0)
		{
			System.out.println("All Fees are clear");
			System.out.println("Paid Amount is "+amount);
		}else if(total < amount && hostelFee > 0  && examFee > 0){
			System.out.println("All Fees are clear\nRemaining amount to pay you is "+(amount - total));
		}else if(total > amount && hostelFee > 0  && examFee > 0) {
			System.out.println("Paid amount is "+amount);
			System.out.println("Remaining amount to pay is "+(total - amount));
		}else {
			if(hostelFee < 0 && examFee > 0) {
				System.out.println("Provided Hostel Fee is Invalid : "+hostelFee);
			}else if(examFee < 0 && hostelFee > 0) {
				System.out.println("Provided Exam Fee is Invalid : "+examFee);
			}else if(hostelFee < 0 && examFee < 0) {
				System.out.println("Provided Hostel Fee and Exam Fee is Invalid : "+hostelFee+", "+examFee);
			}		
		}
		
		return 0;
	}
	
}


public class Example3 {

	public static void main(String[] args) 
	{
		Student s = new Student(1,"John Smith",25000);
		DayScholar d = new DayScholar(2,"Brian Lara",25000,5000);
		Hosteller h = new Hosteller(3,"Virat Kohli",25000,8000);
		
		System.out.println("Student "+s);
		s.payFee(25000);
		
		System.out.println("\nDayScholar "+d.displayDayScholar());
		d.payFee(-33000);
		
		
		System.out.println("\nHosteller "+h.displayHosteller());
		h.payFee(25000);
			
	}
}

/* Tested with Positive Values
Student [name = John Smith, studentId = 1, exam fee = 25000.0]
All Fees are clear
Paid Amount is 25000

DayScholar [transport fee = 5000.0, name = Brian Lara, studentId = 2, exam fee = 25000.0]
All Fees are clear
Remaining amount to pay you is 3000.0

Hosteller [hostel fee = 8000.0, name = Virat Kohli, studentId = 3, exam fee = 25000.0]
Paid amount is 25000
Remaining amount to pay is 8000.0
*/

/* Tested with Negative values
Error Invalid Input of Exam Fee
Error Invalid Input of Exam Fee
Error Invalid Input of Exam Fee
Invalid Input Error of Hostel Fee
Student [name = John Smith, studentId = 1, exam fee = -25000.0]
Provided ExamFee is Invalid : -25000.0

DayScholar [transport fee = 5000.0, name = Brian Lara, studentId = 2, exam fee = -25000.0]
Provided Exam Fee is Invalid : -25000.0

Hosteller [hostel fee = -8000.0, name = Virat Kohli, studentId = 3, exam fee = -25000.0]
Provided Hostel Fee and Exam Fee
*/
