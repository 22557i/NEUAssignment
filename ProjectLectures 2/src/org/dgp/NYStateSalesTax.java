package org.dgp;

public class NYStateSalesTax extends SalesTax {
	private int id = 3;
	private double tax = 0.09;
	public String description = "New York State " + tax*100 + " % SalesTax Implementation";
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
