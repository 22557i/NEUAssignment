package edu.neu.csye6200;

import java.util.ArrayList;

public class Bread extends Item implements Comparable<Item>{
	public Bread(int price, int itemNumber, int Calories) {
		super(price, itemNumber, Calories);
		
	}
	public Bread() {
		super(2,1,0);
		// TODO Auto-generated constructor stub
	}
	public int compareTo(Item o) {
		return Double.compare(this.getItemNumber(),o.getItemNumber());
	}
	
	public Bread getObject(int price,int itemNumber,int calories) {
		// TODO Auto-generated method stub
		return new Bread(price,itemNumber,calories);
	}

@Override
public Item getObject() {
	// TODO Auto-generated method stub
	return new Bread(0, 0, 0);
}
}
