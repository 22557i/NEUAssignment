package org.dgp;

public class MassSalesTax extends SalesTax {
	private int id = 2;
	private double tax = 0.08;
	public String description = "Massachusettes " + tax*100 + " % SalesTax Implementation";
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
