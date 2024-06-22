//This is the main class for Encapsulation class
package com.tnsif.programs;

public class EncapsulationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new is keyword that allocates memory
		Encapsulation obj=new Encapsulation();
				
		/*object class is base class for all classes that inherit same methods for every java class*/
		obj.serialnum=22;
		obj.name="ramya";
		obj.age=13;
				
		obj.show();
		
		System.out.println(obj);

	}

}
