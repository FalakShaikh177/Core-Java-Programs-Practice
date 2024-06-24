package com.tnsif.programs.assgn;

public class State extends Country {
	
	private String stateName;
	private String officialLanguage;
	
	public State(String continentName, long area, long population, String countryName, String capitalName,
			String currency, String stateName, String officialLanguage) {
		super(continentName, area, population, countryName, capitalName, currency);
		this.stateName = stateName;
		this.officialLanguage = officialLanguage;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getOfficialLanguage() {
		return officialLanguage;
	}

	public void setOfficialLanguage(String officialLanguage) {
		this.officialLanguage = officialLanguage;
	}
	
	public void displayStateInfo() {
		
		displayCountryInfo();
		System.out.println("State Name: " + stateName);
		System.out.println("Official Language: " + officialLanguage);
		System.out.println("-----------------");
		
	}
	
}
