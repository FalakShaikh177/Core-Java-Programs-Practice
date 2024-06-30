package com.tnsif.programs.day2;

import java.util.Scanner;

public class DayTwo {

	public static void main(String[] args) {

		//Default constructor is invoked when a object is created
		//Customer obj1=new Customer(); 
		//System.out.println("---DEFAULT CONSTRUCTOR---");
		//System.out.println(obj1);
		
		//Understanding the Scanner class for taking input from users
		Scanner sc=new Scanner(System.in);
		
		String name,city;
		int id;
		System.out.println("Enter the id: ");
		id=sc.nextInt();
		sc.nextLine(); // Consume the leftover newline character
		System.out.println("Enter the name of Customer: ");
		name=sc.nextLine();
		System.out.println("Enter the city of Customer: ");
		city=sc.nextLine();
		
		Customer obj2=new Customer(id,name,city); 
		System.out.println("---PARAMETERISED CONSTRUCTOR---");
		System.out.println(obj2);
	
	}

}
