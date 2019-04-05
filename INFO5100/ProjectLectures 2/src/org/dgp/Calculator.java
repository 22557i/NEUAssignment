package org.dgp;

public class Calculator {

	private int a = 0;
	private int b = 0;
	private int result = 0;
	
	public int add(int a, int b) {
		this.a = a;
		this.b = b;
		this.result = a + b;
		
		return this.result;
	}
	
	public static void demo() {
		System.out.println("\n\t" + Calculator.class.getName() + ".demo()...");
		
		Calculator obj = new Calculator();
		int x = 9;
		int y = 3;
		System.out.println("Calculator: " + x + " + " + y + " = " + obj.add(x, y));
		System.out.println("\n\t" + Calculator.class.getName() + ".demo()...");
	}
}
