package org.dgp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Person extends AbstractPersonAPI implements Comparable<Person> {
	private int id;
	private String firstName;
	private String lastName;
	private int age;

	public Person() {
		super();
		this.init(0, "John", "Doe", 1);
	}
	public Person(int id, String firstName, String lastName, int age) {
		super();
		this.init(id, firstName, lastName, age);
	}
	/**
	 * parse CSV string "ID,FirstName,LastName,Age"
	 * and create object,
	 * 
	 * @param csvData e.g. "1,Dan,Peters,17"
	 */
	public Person(String csvData) {
		super();
		String tokens[] = csvData.split(",");
		this.init(tokens);
	}
	/**
	 * parse list of string tokens
	 * 
	 *  { "ID", "FirstName", "LastName", "Age" }
	 * 
	 * and create object,
	 * 
	 * @param stateList e.g. { "1", "Dan", "Peters", "17" }
	 */
	public Person(List<String> stateList) {
		super();
		this.init(stateList);
	}
	/**
	 * Initialize the object state from a list of string tokens
	 * 
	 *  { "ID", "FirstName", "LastName", "Age" }
	 *  
	 * @param list e.g. { "1", "Dan", "Peters", "17" }
	 */
	private void init(List<String>list) {
		String[] tokens = list.toArray(new String[list.size()]);
		this.init(tokens);
		
	}
	/**
	 * Initialize the object state from an array of string tokens
	 * 
	 *  { "ID", "FirstName", "LastName", "Age" }
	 *  
	 * @param list e.g. { "1", "Dan", "Peters", "17" }
	 */
	private void init(String[] tokens) {
		int id = 0;
		try {
			id = Integer.parseInt(tokens[0]);
		} catch (NumberFormatException e) {
			System.out.println("Person: Integer.parseint: ERROR: '" + tokens[0] + "' is NOT a number.");
			e.printStackTrace();
		}
		int age = 0;
		try {
			age = Integer.parseInt(tokens[3]);
		} catch (NumberFormatException e) {
			System.out.println("Person: Integer.parseint: ERROR: '" + tokens[3] + "' is NOT a number.");
			e.printStackTrace();
		}
		this.init(id, tokens[1], tokens[2], age);
		
	}
	private void init(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIntegerKey() {
		return age;
	}
	public double getDoubleKey() {
		return id;
	}
	@Override
	public int compareTo(Person o) {
		return this.getLastName().compareTo(o.getLastName());
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("#").append(id);
		sb.append(" ").append(firstName);
		sb.append(" ").append(lastName);
		sb.append(", age ").append(age);
		
		return sb.toString();
	}
	public static void demo() {
		System.out.println("\n\t" + Person.class.getName() + ".demo()...");
		List<AbstractPersonAPI> list = new ArrayList<>();
		
		PersonFactoryAPI factory = new PersonFactory();
		list.add(factory.getObject("46,Dan,Peters,17"));
		list.add(factory.getObject("2,John,Adams,90"));
		list.add(factory.getObject("1,George,Washington,67"));
		list.add(factory.getObject("3,Thomas,Jefferson,83"));
		list.add(factory.getObject("4,James,Madison,85"));
		list.add(factory.getObject("5,James,Monroe,73"));
//		list.add(new Person("46,Dan,Peters,17"));
//		list.add(new Person(2,"John", "Adams", 90));
//		list.add(new Person(1,"George", "Washington", 67));
//		list.add(new Person(3,"Thomas", "Jefferson", 83));
//		list.add(new Person(4,"James", "Madison", 85));
//		list.add(new Person(5,"James", "Monroe", 73));
		
		System.out.println(list.size() + " persons in list.");
		list.forEach(System.out::println);
		System.out.println("Sort by ID:");
		list.sort((p1,p2) -> Double.compare(p1.getDoubleKey(),p2.getDoubleKey()));
		list.forEach(System.out::println);
		System.out.println("Sort by LAST NAME:");
		list.sort(null);
		list.forEach(System.out::println);
		System.out.println("Sort by Age:");
		list.sort(Comparator.comparing(AbstractPersonAPI::getAge));
		list.forEach(System.out::println);
		
		System.out.println("\n\t" + Person.class.getName() + ".demo()...");
	}
	/*
	 * CONSOLE OUTPUT
Project Lectures Driver executing main()...

	org.dgp.Person.demo()...
6 persons in list.
#46 Dan Peters, age 17
#2 John Adams, age 90
#1 George Washington, age 67
#3 Thomas Jefferson, age 83
#4 James Madison, age 85
#5 James Monroe, age 73
Sort by ID:
#1 George Washington, age 67
#2 John Adams, age 90
#3 Thomas Jefferson, age 83
#4 James Madison, age 85
#5 James Monroe, age 73
#46 Dan Peters, age 17
Sort by LAST NAME:
#2 John Adams, age 90
#3 Thomas Jefferson, age 83
#4 James Madison, age 85
#5 James Monroe, age 73
#46 Dan Peters, age 17
#1 George Washington, age 67
Sort by Age:
#46 Dan Peters, age 17
#1 George Washington, age 67
#5 James Monroe, age 73
#3 Thomas Jefferson, age 83
#4 James Madison, age 85
#2 John Adams, age 90

	org.dgp.Person.demo()...

	org.dgp.Worker.demo()...
6 persons in list.
#46 Dan Peters, age 17, hourly wage of $93.75
#2 John Adams, age 90, hourly wage of $12.0
#1 George Washington, age 67, hourly wage of $9.75
#3 Thomas Jefferson, age 83, hourly wage of $22.35
#4 James Madison, age 85, hourly wage of $19.5
#5 James Monroe, age 73, hourly wage of $15.35
Sort by ID:
#1 George Washington, age 67, hourly wage of $9.75
#2 John Adams, age 90, hourly wage of $12.0
#3 Thomas Jefferson, age 83, hourly wage of $22.35
#4 James Madison, age 85, hourly wage of $19.5
#5 James Monroe, age 73, hourly wage of $15.35
#46 Dan Peters, age 17, hourly wage of $93.75
Sort by WAGE:
#1 George Washington, age 67, hourly wage of $9.75
#2 John Adams, age 90, hourly wage of $12.0
#5 James Monroe, age 73, hourly wage of $15.35
#4 James Madison, age 85, hourly wage of $19.5
#3 Thomas Jefferson, age 83, hourly wage of $22.35
#46 Dan Peters, age 17, hourly wage of $93.75
Sort by LAST NAME:
#2 John Adams, age 90, hourly wage of $12.0
#3 Thomas Jefferson, age 83, hourly wage of $22.35
#4 James Madison, age 85, hourly wage of $19.5
#5 James Monroe, age 73, hourly wage of $15.35
#46 Dan Peters, age 17, hourly wage of $93.75
#1 George Washington, age 67, hourly wage of $9.75
Sort by Age:
#46 Dan Peters, age 17, hourly wage of $93.75
#1 George Washington, age 67, hourly wage of $9.75
#5 James Monroe, age 73, hourly wage of $15.35
#3 Thomas Jefferson, age 83, hourly wage of $22.35
#4 James Madison, age 85, hourly wage of $19.5
#2 John Adams, age 90, hourly wage of $12.0

	org.dgp.Worker.demo()...

	org.dgp.Student.demo()...
6 persons in list.
#46 Dan Peters, age 17, having a GPA of 3.95
#2 John Adams, age 90, having a GPA of 4.0
#1 George Washington, age 67, having a GPA of 3.75
#3 Thomas Jefferson, age 83, having a GPA of 2.35
#4 James Madison, age 85, having a GPA of 2.5
#5 James Monroe, age 73, having a GPA of 3.55
Sort by ID:
#1 George Washington, age 67, having a GPA of 3.75
#2 John Adams, age 90, having a GPA of 4.0
#3 Thomas Jefferson, age 83, having a GPA of 2.35
#4 James Madison, age 85, having a GPA of 2.5
#5 James Monroe, age 73, having a GPA of 3.55
#46 Dan Peters, age 17, having a GPA of 3.95
Sort by GPA:
#3 Thomas Jefferson, age 83, having a GPA of 2.35
#4 James Madison, age 85, having a GPA of 2.5
#5 James Monroe, age 73, having a GPA of 3.55
#1 George Washington, age 67, having a GPA of 3.75
#46 Dan Peters, age 17, having a GPA of 3.95
#2 John Adams, age 90, having a GPA of 4.0
Sort by LAST NAME:
#2 John Adams, age 90, having a GPA of 4.0
#3 Thomas Jefferson, age 83, having a GPA of 2.35
#4 James Madison, age 85, having a GPA of 2.5
#5 James Monroe, age 73, having a GPA of 3.55
#46 Dan Peters, age 17, having a GPA of 3.95
#1 George Washington, age 67, having a GPA of 3.75
Sort by Age:
#46 Dan Peters, age 17, having a GPA of 3.95
#1 George Washington, age 67, having a GPA of 3.75
#5 James Monroe, age 73, having a GPA of 3.55
#3 Thomas Jefferson, age 83, having a GPA of 2.35
#4 James Madison, age 85, having a GPA of 2.5
#2 John Adams, age 90, having a GPA of 4.0

	org.dgp.Student.demo()...

 Project Lectures Driver executing main()... done!

	 */
}
