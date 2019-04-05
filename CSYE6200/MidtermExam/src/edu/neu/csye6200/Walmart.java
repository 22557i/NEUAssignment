package edu.neu.csye6200;

import java.awt.List;
import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Walmart extends Store {
	
	public ArrayList<Item> Iteminventory;
	public Walmart(int num, String Name,ArrayList<Item> itemsinventory) {
		super(num, Name);
		this.Iteminventory=itemsinventory;
		
	}
	@Override
	public void addItem(Item item) {
		this.Iteminventory.add(item);
	}
		// TODO Auto-generated constructor stub

	public ArrayList<Item> getIteminventory() {
		return Iteminventory;
	}


	public void setIteminventory(ArrayList<Item> iteminventory) {
		Iteminventory = iteminventory;
	}


	public static void demo1() {

		AbstractItemFactoryAPI electronicFactory= new ElectronicsFactory();
		ArrayList<Item> Iteminventory= new ArrayList<Item>();
		Walmart walmart = new Walmart(77, "N",Iteminventory);
		Item aItem =new Electronics(4,"22",333);
		walmart.addItem(new Electronics(1,"22",333));
		walmart.addItem(electronicFactory.getObject(2,"33",444));
		walmart.addItem(electronicFactory.getObject(3,"44",111));
		walmart.getIteminventory().add(aItem);
		walmart.sortInventory();
		for(Item a:walmart.getIteminventory()) {
			if(a==null)System.out.println("nullnull");
			else System.out.println(a.toString());
		}
	}
	public static void demo2() {
	
		AbstractItemFactoryAPI breadFactory= new BreadFactory();
		ArrayList<Item> Iteminventory= new ArrayList<Item>();
		Walmart walmart = new Walmart(77, "N",Iteminventory);
		walmart.addItem(breadFactory.getObject(1,22,333));
		walmart.addItem(breadFactory.getObject(2,33,444));
		walmart.addItem(breadFactory.getObject(3,44,111));
		walmart.addItem(breadFactory.getObject(4,11,222));
		walmart.sortInventory();
		walmart.getIteminventory().sort(null);
		for (Item s : walmart.getIteminventory()) {
			System.out.println(s.toString());
	}
	}
	public static void demo3() {
		AbstractItemFactoryAPI litebreadFactory= new LiteBreadFactory();
		ArrayList<Item> Iteminventory= new ArrayList<Item>();
		Walmart walmart = new Walmart(77, "N",Iteminventory);	
		walmart.addItem(litebreadFactory.getObject(1,22,333));
		walmart.addItem(litebreadFactory.getObject(2,33,444));
		walmart.addItem(litebreadFactory.getObject(3,44,111));
		walmart.addItem(litebreadFactory.getObject());
		walmart.getIteminventory().sort(null);
		for (Item s : walmart.getIteminventory()) {
			System.out.println(s.toString());
	}
	}
}

