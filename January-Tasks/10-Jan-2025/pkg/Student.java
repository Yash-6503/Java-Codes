//BLC class of EducationInstituteApp -> Student.java

package pkg;

public class Student
{
	private String name;
	EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) {
		this.name = name;
		this.institute = institute;
	}
	
	public synchronized void viewCoursesAndFees() {
		System.out.println("\nAvailable Cources");
		for(Course ob: institute.getCourses()) {
			System.out.println(ob.getCourseId()+". "+ob.getCourseName()+" - Fee: Rs."+ob.getCourseFee());
		}
	}
	
	public synchronized void viewOffers() {
		System.out.println("Ongoing Offers: ");
		for(Offer ob: institute.getOffers()) {
			System.out.println("Offer : "+ob.getOfferText());
		}
	}
	
	public synchronized void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, name);
	}
}
