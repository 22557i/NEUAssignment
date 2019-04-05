package org.dgp;

public class Person4 {
	private String name; // object data

	public Person4() {
		super();
		this.name = "Joe";
	}

	public Person4(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	public static void demo() {
		System.out.println("\n\t" + Person4.class.getName() + ".demo()...");
		Person4 object	 = new Person4();
		System.out.println(object);
		Person4 objectDan = new Person4();
		objectDan.setName("Dan");
		System.out.println(objectDan.getName());
		Person4 objectJim = new Person4();
		objectJim.setName("Jim");
		System.out.println(objectJim.getName());
		System.out.println("\n\t" + Person4.class.getName() + ".demo()... done!\n");
	}

}
