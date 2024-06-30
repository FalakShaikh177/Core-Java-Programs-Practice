package com.tnsif.programs.day3and4;

public class Student extends Citizen {
	
	private int rollNo;
	private String collegeName;
	
	public Student() {    //Default constructor
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructor
	public Student(String name, long adhaarNo, String address, long phno,int rollNo,String collegeName) {
		super(name, adhaarNo, address, phno);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdhaarNo()=" + getAdhaarNo() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

}
