package org.dgp;

public class NYCSalesTax extends SalesTax {
	private int id = 4;
	private double tax = 0.10;
	public String description = "New York City " + tax*100 + " % SalesTax Implementation";
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
