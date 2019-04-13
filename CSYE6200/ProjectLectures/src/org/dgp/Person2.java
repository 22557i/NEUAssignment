package org.dgp;

public class Person2 {
	public String name;	// object data
	
	public static void demo() {
		System.out.println("\n\t" + Person2.class.getName() + ".demo()...");
		Person2 objectDan = new Person2();
		objectDan.name = "Dan";
		System.out.println(objectDan.name);
		Person2 objectJim = new Person2();
		objectJim.name = "Jim";
		System.out.println(objectJim.name);
		System.out.println("\n\t" + Person2.class.getName() + ".demo()... done!\n");
	}
}
