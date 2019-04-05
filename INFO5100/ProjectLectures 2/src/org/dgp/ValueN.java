package org.dgp;

public class ValueN {
	public int n = 0;

	public ValueN() {
		super();
	}

	public ValueN(int n) {
		super();
		this.n = n;
	}
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public static void sillySwap(ValueN o1, ValueN o2) {
		ValueN temp = o1;	// save for later
		
		System.out.println("sillySwap object references:");
		o1 = o2;
		o2 = temp;		// original o1
	}
	
	public static void smartSwap(ValueN o1, ValueN o2) {
		ValueN temp = new ValueN();

		temp.setN(o1.getN());
		
		System.out.println("smartSwap object state:");
		o1.setN(o2.getN()); 
		o2.setN(temp.getN());
	}

	public static void showObjects(ValueN o1, ValueN o2) {
		System.out.println("Objects 1 & 2 now contain: " + o1.n + " " + o2.n);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return "n = " + n + " ";
	}
	
	/**
	 * demonstrate how an application would use this class.
	 */
	public static void demo() {
		System.out.println("\n\t" + ValueN.class.getName() + ".demo()...");
		
		ValueN o1 = new ValueN(1);
		ValueN o2 = new ValueN(2);
		
		ValueN.showObjects(o1, o2);

		ValueN.sillySwap(o1, o2);
		ValueN.showObjects(o1, o2);
		
		ValueN.smartSwap(o1, o2);
		ValueN.showObjects(o1, o2);		
		
		System.out.println("\n\t" + ValueN.class.getName() + ".demo()... done!\n");
	}

}
