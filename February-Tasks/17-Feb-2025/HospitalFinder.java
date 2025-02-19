/*
Create multiple Hospital objects and test with the methods of HospitalService class.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hospital
{
	public static int hospitalCodeCounter = 100;
	private int hospitalCode;
	private String hopspitalName;
	private List<String> listofTreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;
	
	public Hospital(String hopspitalName, List<String> listofTreatments, String contactPerson,
			String contactNumber, String location) {
		super();
		this.hospitalCode = hospitalCodeCounter++;
		this.hopspitalName = hopspitalName;
		this.listofTreatments = listofTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
		
	}

	public int getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHopspitalName() {
		return hopspitalName;
	}

	public void setHopspitalName(String hopspitalName) {
		this.hopspitalName = hopspitalName;
	}

	public List<String> getListofTreatments() {
		return listofTreatments;
	}

	public void setListofTreatments(List<String> listofTreatments) {
		this.listofTreatments = listofTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hopspitalName=" + hopspitalName + ", listofTreatments="
				+ listofTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}
		
}

class HospitalService
{
	ArrayList<Hospital> hospitalList = new ArrayList<>();
	public int addHospital(String hospitalName, List<String> listOfTreatments,
            String contactPerson, String contactNumber, String location) {
		 Hospital hospital = new Hospital(hospitalName, listOfTreatments, contactPerson, contactNumber, location);
		hospitalList.add(hospital);
		return hospital.getHospitalCode();
	}
	
	public Map<Integer,String> getHospitals() {
		HashMap<Integer, String> hospitalMap = new HashMap<>();
		for (Hospital h : hospitalList) {
            hospitalMap.put(h.getHospitalCode(), h.getHopspitalName());
        }
		return hospitalMap;
	}
	
	public Hospital getHospitalDetails(int hospitalCode) {
		for(Hospital h : hospitalList) {
			if(h.getHospitalCode() == hospitalCode) {
				return h;
			}
		}
		return null;
	}
}

public class HospitalFinder 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Cardiac");
		list.add("ENT");
		list.add("Ortho");
		list.add("Pediatric");
		list.add("Gastro");
		
		
		HospitalService hservice = new HospitalService();
		
		int hcode1 = hservice.addHospital("YASHODA", list, "MATHEWS", "9848222222", "HYD");
		int hcode2 = hservice.addHospital("APOLLO", Arrays.asList("Neurology", "Cancer", "Orthopedics"),"JACKSON", "9855551111", "Hyderabad");
		int hcode3 = hservice.addHospital("FORTIS", Arrays.asList("Urology", "Cardiac", "ENT"),"DAVID", "9888776655", "Bangalore");
				
		System.out.println("All Hospitals List \n"+hservice.getHospitals());
		
		System.out.println("\nHospital present at code no."+hcode1);
		System.out.println(hservice.getHospitalDetails(hcode1));
		
		System.out.println("\nHospital present at code no."+hcode2);
		System.out.println(hservice.getHospitalDetails(hcode2));
		
		System.out.println("Hospital present at code no."+hcode3);
		System.out.println(hservice.getHospitalDetails(hcode3));
		
	}
}


/*
All Hospitals List 
{100=YASHODA, 101=APOLLO, 102=FORTIS}

Hospital present at code no.100
Hospital [hospitalCode=100, hopspitalName=YASHODA, listofTreatments=[Cardiac, ENT, Ortho, Pediatric, Gastro], contactPerson=MATHEWS, contactNumber=9848222222, location=HYD]

Hospital present at code no.101
Hospital [hospitalCode=101, hopspitalName=APOLLO, listofTreatments=[Neurology, Cancer, Orthopedics], contactPerson=JACKSON, contactNumber=9855551111, location=Hyderabad]

Hospital present at code no.102
Hospital [hospitalCode=102, hopspitalName=FORTIS, listofTreatments=[Urology, Cardiac, ENT], contactPerson=DAVID, contactNumber=9888776655, location=Bangalore]
*/