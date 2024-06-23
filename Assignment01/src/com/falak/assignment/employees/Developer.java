/*Developer class extends Employee class with additional attributes such as skillSet and experience*/

package com.falak.assignment.employees;

public class Developer extends Employee {
	
	private String skillSet;
	private int experience;
	
	public Developer(String name, int employeeId, double salary, String skillSet, int experience) {
        super(name, employeeId, salary);
        this.skillSet = skillSet;
        this.experience = experience;
    }
	
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
}
