package com.tnsif.programs;

public class AssgnMain {

	public static void main(String[] args) {

		// Creating an object of Student to trigger the default constructor
        Student st = new Student();

        // Creating an object of Commission
        Commission com = new Commission();

        // Accepting details of the sales employee
        com.acceptDetails();

        // Displaying the details and commission
        com.displayDetails();

	}

}
