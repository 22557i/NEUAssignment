package org.dgp;

public class SalesTax extends SalesTaxAPI {
	private int id = 1;
	private double tax = 0.01;
	public String description = "A Default " + tax*100 + " % SalesTax Implementation";
	@Override
	public String getDescription() {
		return "Tax Code #" + id + ": " + this.description;
	}

	@Override
	public double computeSalesTax(double sales) {
		// TODO Auto-generated method stub
		return sales * tax;	// 1% tax
	}
}
