//BLC class of EducationInstituteApp -> EducationInstitute.java
package pkg;

public class EducationInstitute 
{
	Course[] course;
	Offer[] offer;

	public EducationInstitute(Course[] course, Offer[] offer) {
		super();
		this.course = course;
		this.offer = offer;
	}
	
	public Course[] getCourses() {
		return course;
	}
	

	public Offer[] getOffers() {
		return offer;
	}
	
	public synchronized void enrollStudentInCourse(int courseId, String studentName)
	{
		boolean found = false;
		for(Course c : course) {
			if(c.getCourseId() == courseId) {
				System.out.println(studentName+" has enrolled in the course: "+c.getCourseName());
				found = true;
			}
		}
		if(!found) {
			System.out.println("For id "+courseId+" course not available.");
		}
	}
}
