// Create a class Student with the following attributes: studentId, studentName, studentFees, dateOfAdmission.

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class Student implements Serializable
{
	private Integer studentId;
	private String studentName;
	private Double studentFees;
	private Date dateOfAdmission;
	
	
	public Student(Integer studentId, String studentName, Double studentFees, Date dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}
	
	public static Student getStudentObject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		int studId = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Student Name: ");
		String studName = sc.nextLine();
		System.out.println("Enter Student Fees: ");
		double studFees = Double.parseDouble(sc.nextLine());
		System.out.println("Enter Date of Admission (dd-MM-yyyy): ");
//		sc.nextLine();
		String admDate = sc.nextLine();
//		Date admDate = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyy");
		Date date = null;
		try {
			date = s.parse(admDate);
		}catch(Exception e) {
			e.printStackTrace();
		}
		Student student = new Student(studId,studName,studFees,date);
		return student;
		
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}
	
	
}
