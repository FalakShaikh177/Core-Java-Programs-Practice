package com.falak.assignment1.utilities;

/*import all the classes in employees package so as to use methods of Employee*/
import com.falak.assignment1.employees.*;

public class EmployeeUtilities {
	
	public static void printEmpInfo(Employee emp) {

		// Print common employee details
		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee ID: " + emp.getEmployeeId());
		System.out.println("Employee Salary: " + emp.getSalary());
		
		/*using instanceof to check the type of Employee and cast it to the specific subclass*/
		
		if (emp instanceof Manager) {
			
            Manager mn = (Manager) emp;
            System.out.println("Department: " + mn.getDepartment());
            System.out.println("Qualification: " + mn.getQualification());
        
		} else if (emp instanceof Developer) {
			
            Developer dev = (Developer) emp;
            System.out.println("Programming Languages: " + dev.getSkillSet());
            System.out.println("Years of Experience: " + dev.getExperience());
            
        }
	}
	
}