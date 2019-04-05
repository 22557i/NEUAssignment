package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;



public class Electronics extends Item implements Comparable<Item>{
	public  String Name;
	public Electronics(int id, String Name,int price) {
		super(id,price,0 );
		this.Name = Name;
		// TODO Auto-generated constructor stub
	}
	public Electronics() {
		super();
	}
public Electronics getObject(int id,String Name,int price) {
	return new Electronics(id,Name,price);
}
	public int compareTo(Item o) {
		return Double.compare(this.getPrice(),o.getPrice());
	}
	
	
	
@Override
	public String toString() {
		return  "Electronics:[ Name=" + Name +" ,ID="+getItemNumber()+ " ,price="+getPrice()+ "]";
	}
	/*	public static void demo1() {
		
		Electronics E1 = new Electronics(1,"22",333);
		Electronics E2 = new Electronics(2,"33",444);
		Electronics E3 = new Electronics(3,"44",111);
		Electronics E4 = new Electronics(4,"11",222);
		ArrayList<Item> inventoryList= new ArrayList<Item>();
		Walmart walmart = new Walmart(77, "N");
		
		walmart.inventory.add(E1);
		walmart.inventory.add(E2);
		walmart.inventory.add(E3);
		walmart.inventory.add(E4);
	
		walmart.getInventory().sort(null);
		for (Item s : walmart.getInventory()) {
			System.out.println(s.toString());
		}
	}
*/
	@Override
	public Item getObject() {
		// TODO Auto-generated method stub
		return new Electronics();
	}
}
	

