package org.dgp;

public class DemoString {

	/**
	 * use String.split() to parse String tokens from from a Comma Separated Value (CSV) string
	 */
	public void splitString() {
		System.out.println("\n\t" + DemoString.class.getName() + ".SplitString()...");
		String csvData = "dan,peters,17,4.0";
		String[] fields;
		int age = 0;
		double gpa = 0.0;
		
		System.out.println();
		fields = csvData.split(",");
		String firstName = fields[0];
		String lastName = fields[1];
		try {
			age = Integer.parseInt(fields[2]);
		} catch (NumberFormatException e) {
			System.out.println("DemoString.SplitString() ParseInt ERROR" + fields[2] + " is not a number!");
			e.printStackTrace();
		}
		System.out.println(fields[2] + " is Age: " + age);
		try {
			gpa = Double.parseDouble(fields[3]);
		} catch (NumberFormatException e) {
			System.out.println("DemoString.SplitString() ParseDouble ERROR" + fields[3] + " is not a number!");
			e.printStackTrace();
		}
		System.out.println(fields[3] + " is GPA: " + gpa);
		
		System.out.println(firstName + " " + lastName + ", age " + age + " GPA: " + gpa);
		
		System.out.println("\n\t" + DemoString.class.getName() + ".SplitString()... done!\n");
	}
	
	/**
	 * use String.toUpperCase and String.toLowerCase to convert string to ALL CAPS and ALL LOWERCASE
	 */
	public void changeCase() {
		System.out.println("\n\t" + DemoString.class.getName() + ".changeCase()...");
		String strData = "I am a Java String!";
		System.out.println("Original: " + strData + "'");
		System.out.println("String.toLowercase(): " + strData.toUpperCase() + "'");
		System.out.println("String.toUppercase(): " + strData.toLowerCase() + "'");
		System.out.println("\n\t" + DemoString.class.getName() + ".changeCase()... done!\n");
	}
	/**
	 * demonstrate how an application would use this class.
	 */
	public static void demo() {
		System.out.println("\n\t" + DemoString.class.getName() + ".demo()...");
		
		DemoString obj = new DemoString();
		
		obj.splitString();
		obj.changeCase();
		
		System.out.println("\n\t" + DemoString.class.getName() + ".demo()... done!\n");
	}

}
