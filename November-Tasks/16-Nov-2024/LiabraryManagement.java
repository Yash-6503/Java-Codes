//Liabrary Management System
package com.classes;

class Book 
{
	private String title;
	private String author;
	private double price;
	
	public Book(String title, String author, double price)
	{
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public double getPrice()
	{
		if(price > 0) {
			return price;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		if(getPrice() == -1) {
			return "Invalid Input Price";
		}else {
			return "Book : " + getTitle() + " by " + getAuthor() + ", Price : $" + getPrice();
		}
	}
}

class LiabraryMember 
{
	private String name;
	private int memberId;
	
	public LiabraryMember(String name, int memberId)
	{
		this.name = name;
		this.memberId = memberId;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getMemberId()
	{
		if(memberId > 0) {
			return memberId;
		}else {
			return -1;
		}
	}
}


class StudentMember extends LiabraryMember 
{
	private boolean isStudent;
	
	public StudentMember(String name, int memberId, boolean isStudent)
	{
		super(name,memberId);
		this.isStudent = isStudent;
	}
	
	public boolean isStudent()
	{
		return isStudent;
	}

	@Override
	public String toString() {
		if(getMemberId() == -1) {
			return "Invalid Input Member ID";
		}else {
			return "Student Member : " + getName() + ", Member Id : " + getMemberId() + ", Is Student : " + isStudent();
		}
	}
}

class PremiumMember extends LiabraryMember 
{
	private double membershipFee;
	
	public PremiumMember(String name, int memberId, double membershipFee)
	{
		super(name,memberId);
		this.membershipFee = membershipFee;
	}
	
	public double getMembershipFee()
	{
		if(membershipFee > 0) {
			return membershipFee;
		}else {
			return -1;
		}
	}

	@Override
	public String toString() {
		if(getMemberId() == -1 && getMembershipFee() == -1) {
			return "Invalid Input Member Id and Membership Fee";
		}else if(getMemberId() == -1) {
			return "Invalid Input Member Id";
		}else if(getMembershipFee() == -1) {
			return "Invalid Input Membership Fee";
		}else {
			return "Premium Member : " + getName() + ", Member Id : " + getMemberId() + ", Membership Fee : $" + getMembershipFee();
		}
	}	
}


public class LiabraryManagement {

	public static void main(String[] args) {

		Book book = new Book("Java Programming", "James Gosling", 500.0);  
		StudentMember student = new StudentMember("Alice", 101, true);  
		PremiumMember premium = new PremiumMember("Bob", 202, 1500.0);
		
		System.out.println(book);
		System.out.println(student);
		System.out.println(premium);
	}

}


/* Tested with Positive Values
Book : Java Programming by James Gosling, Price : $500.0
Student Member : Alice, Member Id : 101, Is Student : true
Premium Member : Bob, Member Id : 202, Membership Fee : $1500.0
*/

/* Tested with Negative Values
Invalid Input Price
Student Member : Alice, Member Id : 101, Is Student : true
Invalid Input Member Id and Membership Fee
*/