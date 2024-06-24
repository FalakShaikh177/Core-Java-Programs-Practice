/*Program to demonstrate Multilevel Inheritance
 * Continent--->Country--->State follow this scenario*/

package com.tnsif.programs.assgn;

public class AssgnMain {

	public static void main(String[] args) {
		
		System.out.println("Object1");
		//Continent is the parent class of both Country and State
		Continent con = new Continent("Asia", 44579000, 460137500);
		con.displayContinentInfo();
		
		System.out.println("Object2");
		//Country inherits attributes of continent only
		Country ct = new Country("Asia", 44579000, 460137500, "India", "New Delhi", "INR");
		ct.displayCountryInfo();

		System.out.println("Object3");
		//State inherits attributes of both country and continent
		State st=new State("Asia", 44579000, 460137500, "India", "New Delhi", "INR", "Maharashtra", "Marathi");
		st.displayStateInfo();

	}

}
