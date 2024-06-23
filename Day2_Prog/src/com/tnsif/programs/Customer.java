package com.tnsif.programs;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String customerCity;
	
	public Customer(int customerId,String customerName,String customerCity) {
		this.customerId=customerId;
		this.customerName=customerName;
		this.customerCity=customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}	
}
