package com.tnsif.programs.assgn;

public class Continent {
	
	private String continentName;
	private long area;
	private long population;
	
	public Continent(String continentName, long area, long population) {
		super();
		this.continentName = continentName;
		this.area = area;
		this.population = population;
	}
	
	public String getContinentName() {
		return continentName;
	}
	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	
	public void displayContinentInfo() {
        
		System.out.println("-----------------");
		System.out.println("Continent Name: " + continentName);
        System.out.println("Area: " + area + " sq km");
        System.out.println("Population: " + population);
		System.out.println("-----------------");
	}
	
}
