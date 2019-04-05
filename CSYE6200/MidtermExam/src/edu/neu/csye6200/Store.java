package edu.neu.csye6200;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import edu.neu.csye6200.Item;
import edu.neu.csye6200.AbstractItemAPI;
import edu.neu.csye6200.AbstractStoreAPI;

public class Store extends AbstractStoreAPI {
	int id;
	String name;
	
	private ArrayList <Item>inventory;
	
	private void init(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Store() {
		super();
		init(1, "Default Store");
		this.inventory = new ArrayList<Item>();
	}

	public Store(int id, String name) {
		super();
		init(id, name);
		this.inventory = new ArrayList<Item>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public void addItem(Item item) {
		this.inventory.add(item);
	}
	

	@Override
	public String getInventoryInfo() {
		String res = "";
		for (Item item: this.getInventory()) {
			res += item.toString();
			res += "\n";
		}
		return res;
	
	
	}
	
	public ArrayList<Item> getInventory() {
		return inventory;
	}

	public void setInventory(ArrayList<Item> inventory) {
		this.inventory = inventory;
	}

	public void clearInventory() {
		this.inventory.clear();
	}
	
	public void sortInventory() {
		this.inventory.sort(null);
	}
	
	public void showInventory() {
		System.out.println(this.getInventoryInfo());
	}


	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("[" + this.getId() +"] " + this.getName() + " \n");

		info.append(this.getInventoryInfo());
		return info.toString();
	}
	
	@Override
	public void show() {
		System.out.println(toString());
	}

	public static void demo() {
		
	}
}
