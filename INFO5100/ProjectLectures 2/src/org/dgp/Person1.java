package org.dgp;

public class Person1 {
	public static String name;	// class data
	
	public static void demo() {
		System.out.println("\n\t" + Person1.class.getName() + ".demo()...");
		Person1.name = "Dan";
		System.out.println(Person1.name);
		Person1.name = "Jim";
		System.out.println(Person1.name);		
		System.out.println("\n\t" + Person1.class.getName() + ".demo()... done!\n");
	}
}
