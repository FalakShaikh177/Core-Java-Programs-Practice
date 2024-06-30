/*Create a Package Structure: Create a Java package named com.yourname.assignment. •Inside this package, create two sub-packages named employees and utilities. 
 Employees Package: Inside the employees package, create a class named Employee. • Include private attributes such as name, employeeId, and salary. • Implement appropriate access modifiers (e.g., private, protected, public) for the class members. • Provide getter and setter methods to access and modify the private attributes
 Subclasses: • Create two subclasses within the employees package: Manager and Developer. • Each subclass should extend the Employee class. • Introduce additional attributes specific to managers and developers. • Implement getter and setter methods for the additional attributes. 
 Utilities Package: • Inside the utilities package, create a class named EmployeeUtilities. • Implement methods in EmployeeUtilities that use the employees from the employees package. • Demonstrate the proper usage of access modifiers within the EmployeeUtilities class. 
 Main Class: • Create a main class named AssignmentMain outside of any package. • In the AssignmentMain class, create instances of Manager and Developer. • Use the EmployeeUtilities methods to perform operations on the employee objects.  
 */

package com.falak.assignment1;

import com.falak.assignment1.employees.*;
import com.falak.assignment1.utilities.*;

public class AssignmentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager mn= new Manager("Mahesh",1232,85000,"Sales","Ph.D.");
		Developer dev=new Developer("Suman",1421,60000,"Java,Python,UI/UX",9);
		
		EmployeeUtilities.printEmpInfo(mn);
        System.out.println();
        EmployeeUtilities.printEmpInfo(dev);

	}
}
