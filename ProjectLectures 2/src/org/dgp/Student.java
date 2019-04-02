package org.dgp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student extends Person implements Learnable {
	private double gpa;
	
	public Student() {
		super();
		this.init(0.0);
	}

	public Student(int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age);
		this.init(gpa);
	}

	public Student(List<String> stateList) {
		super(stateList);
		init(stateList);
	}

	public Student(String csvData) {
		super(csvData);
		String tokens[] = csvData.split(",");
		this.init(tokens);
	}

	/**
	 * Initialize the object state from a list of string tokens
	 * 
	 *  { "ID", "FirstName", "LastName", "Age", "GPA" }
	 *  
	 * @param list e.g. { "1", "Dan", "Peters", "17", "4.0" }
	 */
	private void init(List<String>list) {
		String[] tokens = list.toArray(new String[list.size()]);
		this.init(tokens);
		
	}
	/**
	 * Initialize the object state from an array of string tokens
	 * 
	 *  { "ID", "FirstName", "LastName", "Age", "GPA" }
	 *  
	 * @param list e.g. { "1", "Dan", "Peters", "17", "4.0" }
	 */
	private void init(String[] tokens) {
		double wage = 0;
		try {
			wage = Double.parseDouble(tokens[4]);
		} catch (NumberFormatException e) {
			System.out.println("Person: Double.parseDouble: ERROR: '" + tokens[4] + "' is NOT a number.");
			e.printStackTrace();
		}
		this.init(wage);
		
	}
	private void init(double gpa) {
		this.gpa = gpa;		
	}
	
	@Override
	public double getGpa() {
		return this.gpa;
	}

	@Override
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public double getDoubleKey() {
		return this.gpa;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", having a GPA of ").append(gpa);
		
		return sb.toString();
	}

	public static void demo() {
		System.out.println("\n\t" + Student.class.getName() + ".demo()...");
		List<AbstractPersonAPI> list = new ArrayList<>();
		
		PersonFactoryAPI factory = new StudentFactory();
		list.add(factory.getObject("46,Dan,Peters,17,3.95"));
		list.add(factory.getObject("2,John,Adams,90,4.0"));
		list.add(factory.getObject("1,George,Washington,67,3.75"));
		list.add(factory.getObject("3,Thomas,Jefferson,83,2.35"));
		list.add(factory.getObject("4,James,Madison,85,2.50"));
		list.add(factory.getObject("5,James,Monroe,73,3.55"));
		
		System.out.println(list.size() + " persons in list.");
		list.forEach(System.out::println);
		System.out.println("Sort by ID:");
		list.sort(Comparator.comparing(AbstractPersonAPI::getId));
		list.forEach(System.out::println);
		System.out.println("Sort by GPA:");
		list.sort((p1,p2) -> Double.compare(p1.getDoubleKey(),p2.getDoubleKey()));
		list.forEach(System.out::println);
		System.out.println("Sort by LAST NAME:");
		list.sort(null);
		list.forEach(System.out::println);
		System.out.println("Sort by Age:");
		list.sort(Comparator.comparing(AbstractPersonAPI::getAge));
		list.forEach(System.out::println);
		
		System.out.println("\n\t" + Student.class.getName() + ".demo()...");
	}
}
