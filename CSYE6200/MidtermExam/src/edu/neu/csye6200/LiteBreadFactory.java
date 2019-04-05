package edu.neu.csye6200;

import java.util.List;

import edu.neu.csye6200.Item;
import edu.neu.csye6200.LiteBread;
import edu.neu.csye6200.AbstractItemFactoryAPI;

public class LiteBreadFactory extends AbstractItemFactoryAPI {

	@Override
	public Item getObject() {
		return new LiteBread();
	}

	@Override
	public Item getObject(int price, int ItemNumber, int Calories) {
		return new LiteBread(price, ItemNumber, Calories);
	}

	@Override
	public Item getObject(int id, String name, int price) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
