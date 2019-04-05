package edu.neu.csye6200;

import java.util.ArrayList;

public class LiteBread  extends Bread implements Comparable<Item>{
	public LiteBread(int price, int itemNumber, int Calories) {
		super(price, itemNumber, Calories);
		// TODO Auto-generated constructor stub
	}
	public LiteBread() {
		super(2,1,0);
	}
	public Bread getObject(int price,int itemNumber,int calories ) {
		// TODO Auto-generated method stub
		return new Bread(price,itemNumber,calories);
	}
	public int compareTo(Item o) {
		return Integer.compare(this.getCalories(),o.getCalories());
	}
	
	public static void demo3() {
		
		
		
	}
	@Override
	public Item getObject() {
	
		return null;
	}
}