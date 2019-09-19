package org.dgp;

public class Customer extends Person {
	private Double income;	// annual income in thousands of dollars

	public Customer() {
		super();
		this.income = 24.0;
	}

	public Customer(int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age);
		this.income = gpa;
	}

	public Double getGpa() {
		return income;
	}

	public void setGpa(Double gpa) {
		this.income = gpa;
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString());
		info.append(", is a customer with an annual gross income of: $").append(this.getGpa()).append(" K");
		return info.toString();
	}
}
