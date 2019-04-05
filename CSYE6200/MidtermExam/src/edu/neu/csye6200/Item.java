package edu.neu.csye6200;

import edu.neu.csye6200.AbstractItemAPI;

public class Item extends AbstractItemAPI implements Comparable<Item> {
	private int price;
	private int itemNumber;
	private int Calories;
	public Item(int price,int itemNumber,int Calories){
		this.price =price;
		this.Calories=Calories;
		this.itemNumber = itemNumber;
	}
	public Item() {
		super();
	}
	public  Item getObject() {
		return new Item();
	};
	public int getPrice() {
		return price;
	}


	@Override
	public String toString() {
		return "Item [price=" + price + ", itemNumber=" + itemNumber + ", Calories=" + Calories + "]";
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public int getItemNumber() {
		return itemNumber;
	}


	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}


	public int getCalories() {
		return Calories;
	}


	public void setCalories(int calories) {
		Calories = calories;
	}
	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Integer getIntegerKey() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Double getDoubleKey() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getStringKey() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return null;
	}


}
