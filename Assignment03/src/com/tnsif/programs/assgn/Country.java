package com.tnsif.programs.assgn;

public class Country extends Continent {
	
	private String countryName;
	private String capitalName;
	private String currency;
	
	public Country(String continentName, long area, long population, String countryName, String capitalName,
			String currency) {
		super(continentName, area, population);
		this.countryName = countryName;
		this.capitalName = capitalName;
		this.currency = currency;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCapitalName() {
		return capitalName;
	}

	public void setCapitalName(String capitalName) {
		this.capitalName = capitalName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public void displayCountryInfo() {
		
		displayContinentInfo();
		System.out.println("Country Name: " + countryName);
        System.out.println("Capital City: " + capitalName);
        System.out.println("Currency: " + currency);
		System.out.println("-----------------");
		
	}

}
