package edu.neu.csye6200;

import java.util.List;

import edu.neu.csye6200.Item;

public abstract class AbstractItemFactoryAPI {
	public abstract Item getObject();

	public abstract Item getObject(int id, String name, int price);

	public Item getObject(int price, int ItemNumber, int Calories) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
