/*
Program to develop an education institute course enrollment system using Java. 
The system should provide courses and offers to students, allowing them to view available courses, 
ongoing offers, and enroll in their preferred courses.
*/

//ELC (main) class of Course, Offer, EducationInstitute, and Student classes -> EducationInstituteApp.java

package pkg;

public class EducationInstituteApp 
{
	public static void main(String[] args) throws InterruptedException 
    {

		Course course[] = {new Course(1, "Mathematics",1000), new Course(2, "Science", 1200), new Course(3,"English", 900)};
		Offer offers[] = {new Offer("Special discount: Get 20% off on all courses!"), new Offer("Limited time offer: Enroll in any two courses and get one course free!")};
		
		EducationInstitute edu = new EducationInstitute(course,offers);

		Student s1 = new Student("Virat", edu);
		Student s2 = new Student("Dhoni", edu);
		
		Thread t1 = new Thread(()->{
			s1.viewCoursesAndFees();
			s1.viewOffers();
			s1.enrollInCourse(1);
		});
		
		Thread t2 = new Thread(()->{
			s2.viewCoursesAndFees();
			s2.viewOffers();
			s2.enrollInCourse(2);
		});
		
		t1.start(); 
		t1.join();
		t2.start();
	}
}

/*

Available Cources
1. Mathematics - Fee: Rs.1000.0
2. Science - Fee: Rs.1200.0
3. English - Fee: Rs.900.0
Ongoing Offers: 
Offer : Special discount: Get 20% off on all courses!
Offer : Limited time offer: Enroll in any two courses and get one course free!
Virat has enrolled in the course: Mathematics

Available Cources
1. Mathematics - Fee: Rs.1000.0
2. Science - Fee: Rs.1200.0
3. English - Fee: Rs.900.0
Ongoing Offers: 
Offer : Special discount: Get 20% off on all courses!
Offer : Limited time offer: Enroll in any two courses and get one course free!
Dhoni has enrolled in the course: Science
*/

/*
Available Cources
1. Mathematics - Fee: Rs.1000.0
2. Science - Fee: Rs.1200.0
3. English - Fee: Rs.900.0
Ongoing Offers: 
Offer : Special discount: Get 20% off on all courses!
Offer : Limited time offer: Enroll in any two courses and get one course free!
For id 10 course not available.

Available Cources
1. Mathematics - Fee: Rs.1000.0
2. Science - Fee: Rs.1200.0
3. English - Fee: Rs.900.0
Ongoing Offers: 
Offer : Special discount: Get 20% off on all courses!
Offer : Limited time offer: Enroll in any two courses and get one course free!
For id 20 course not available.
*/

