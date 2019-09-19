package org.dgp;

import static java.lang.Double.parseDouble;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Worker extends Person implements Employable {
	private double wage;

	public Worker() {
		super();
		this.init(0.0);
	}

	public Worker(int id, String firstName, String lastName, int age, double wage) {
		super(id, firstName, lastName, age);
		this.init(wage);
	}

	public Worker(List<String> stateList) {
		super(stateList);
		init(stateList);
	}

	public Worker(String csvData) {
		super(csvData);
		String tokens[] = csvData.split(",");
		this.init(tokens);
	}

	/**
	 * Initialize the object state from a list of string tokens
	 * 
	 *  { "ID", "FirstName", "LastName", "Age", "Wage" }
	 *  
	 * @param list e.g. { "1", "Dan", "Peters", "17", "93.65" }
	 */
	private void init(List<String>list) {
		String[] tokens = list.toArray(new String[list.size()]);
		this.init(tokens);
		
	}
	/**
	 * Initialize the object state from an array of string tokens
	 * 
	 *  { "ID", "FirstName", "LastName", "Age", "Wage" }
	 *  
	 * @param list e.g. { "1", "Dan", "Peters", "17", "93.65" }
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
	private void init(double wage) {
		this.wage = wage;		
	}
	
	@Override
	public double getWage() {
		return this.wage;
	}

	@Override
	public void setWage(double wage) {
		this.wage = wage;
	}
	
	@Override
	public double getDoubleKey() {
		return this.wage;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(super.toString());
		sb.append(", hourly wage of $").append(wage);
		
		return sb.toString();
	}

	public static void demo() {
		System.out.println("\n\t" + Worker.class.getName() + ".demo()...");
		List<AbstractPersonAPI> list = new ArrayList<>();
		
		PersonFactoryAPI factory = new WorkerFactory();
		list.add(factory.getObject("46,Dan,Peters,17,93.75"));
		list.add(factory.getObject("2,John,Adams,90,12.00"));
		list.add(factory.getObject("1,George,Washington,67,9.75"));
		list.add(factory.getObject("3,Thomas,Jefferson,83,22.35"));
		list.add(factory.getObject("4,James,Madison,85,19.50"));
		list.add(factory.getObject("5,James,Monroe,73,15.35"));
		
		System.out.println(list.size() + " persons in list.");
		list.forEach(System.out::println);
		System.out.println("Sort by ID:");
		list.sort(Comparator.comparing(AbstractPersonAPI::getId));
		list.forEach(System.out::println);
		System.out.println("Sort by WAGE:");
		list.sort((p1,p2) -> Double.compare(p1.getDoubleKey(),p2.getDoubleKey()));
		list.forEach(System.out::println);
		System.out.println("Sort by LAST NAME:");
		list.sort(null);
		list.forEach(System.out::println);
		System.out.println("Sort by Age:");
		list.sort(Comparator.comparing(AbstractPersonAPI::getAge));
		list.forEach(System.out::println);
		
		System.out.println("\n\t" + Worker.class.getName() + ".demo()...");
	}
}
