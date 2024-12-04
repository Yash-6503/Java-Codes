//ELC (main) class of Doctor, Nurse, HospitalStaff -> HospitalManagementSystem.java
package pkg.blc2;

public class HospitalManagementSystem
{
    public static void main(String args[])
    {
        System.out.println("Doctor Details:");
        Doctor doctor = new Doctor("Gandhi",40,"Doctor","Heart Surgeon");
        doctor.work();

        System.out.println("\nNurse Details:");
        Nurse nurse = new Nurse("Janhvi Kapoor",30,"Nurse",10);
        nurse.work();

    }
}

/*  Tested with Positive Test Cases 
Doctor Details:                                   
Doctor Gandhi with specialization in Heart Surgeon is treating patients.

Nurse Details:
Nurse Janhvi Kapoor with 10 years of experience is taking care of patients.
*/

/*  Tested with Negative Test Cases 
Doctor Details:
Error: Invalid Age
*/

/*  Tested with Negative Test Cases 
Doctor Details:
Doctor Gandhi with specialization in Heart Surgeon is treating patients.

Nurse Details:
Error: Invalid Experience
*/