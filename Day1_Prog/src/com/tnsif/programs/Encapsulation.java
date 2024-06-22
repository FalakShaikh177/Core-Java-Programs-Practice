/* Program to demonstrate Encapsulation 
   Encapsulation refers to integrate data members(variables) and member function(methods)
*/

package com.tnsif.programs;

public class Encapsulation {
	
	int serialnum;  //data members
	String name;
	int age;
	
	public void show() {         //member function
		
		System.out.println("Serialnumber: "+serialnum+"\t Name: "+name+"\t Age: "+age);
	}

	
	/*Getters and Setters are used to access private data members*/
	public int getSerialnum() {
		return serialnum;
	}

	public void setSerialnum(int serialnum) {
		this.serialnum = serialnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	/*tostring() method belongs to the object & string class both for representing the values of object in string format */
	@Override
	public String toString() {
		return "Encapsulation [serialnum=" + serialnum + ", name=" + name + ", age=" + age + "]";
	}

}
