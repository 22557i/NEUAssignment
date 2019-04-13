package org.dgp;

import java.util.ArrayList;
import java.util.List;

public class HomeDepot {
	private String name = "Home Depot";
	private List<SalesTaxAPI> list = new ArrayList<SalesTaxAPI>();
	
	public void add(SalesTaxAPI m) {
		list.add(m);
	}
	
	public void computeSalesTax(double sales) {
		System.out.println("Show how " 
				+ name 
				+ " stores across the country use " 
				+ list.size() 
				+ " different tax codes to compute correct sales tax complient with local tax statutes.");
		for (SalesTaxAPI m : list) {
			/*
			 * Use specific tax module for location of store
			 */
			String taxDescription = m.getDescription();
			double computedTax = m.computeSalesTax(sales);
			/*
			 * Display computed sales tax
			 */
			System.out.println(taxDescription 
					+ ", on $" + sales 
					+ " = $" + computedTax + " sales tax");
		}
	}
	
	public static void demo() {
		System.out.println("\n\t" + HomeDepot.class.getName() + ".demo()...");
		HomeDepot obj = new HomeDepot();
		
		obj.add(new SalesTax());
		obj.add(new MassSalesTax());
		obj.add(new NYCSalesTax());
		obj.add(new NYStateSalesTax());
		
		obj.computeSalesTax(100);
		
		System.out.println("\n\t" + HomeDepot.class.getName() + ".demo()... done!");
	}
}
