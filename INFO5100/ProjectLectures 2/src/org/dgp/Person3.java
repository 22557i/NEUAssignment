package org.dgp;

public class Person3 {
	private String name;	// object data
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void demo() {
		System.out.println("\n\t" + Person3.class.getName() + ".demo()...");
		Person3 objectDan = new Person3();
		objectDan.setName("Dan");
		System.out.println(objectDan.getName());
		Person3 objectJim = new Person3();
		objectJim.setName("Jim");
		System.out.println(objectJim.getName());
		System.out.println("\n\t" + Person3.class.getName() + ".demo()... done!\n");
	}
}
