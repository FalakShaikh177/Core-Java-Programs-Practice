/*Manager class extends Employee class with additional attributes such as department and qualification*/

package com.falak.assignment.employees;

public class Manager extends Employee {
	
	private String department;
	private String qualification;

	
	public Manager(String name, int employeeId, double salary, String department,String qualification) {
        super(name, employeeId, salary);
        this.department = department;
        this.qualification=qualification;
    }

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

}
