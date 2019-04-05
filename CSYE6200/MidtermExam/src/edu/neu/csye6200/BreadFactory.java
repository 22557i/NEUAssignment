package edu.neu.csye6200;

import java.util.List;

import edu.neu.csye6200.Bread;
import edu.neu.csye6200.Electronics;
import edu.neu.csye6200.Item;
import edu.neu.csye6200.AbstractItemFactoryAPI;

public class BreadFactory extends AbstractItemFactoryAPI {

	@Override
	public Item getObject() {
		return new Bread();
	}

	@Override
	public Item getObject(int price,int ItemNumber,int Calories) {
		return new Bread(price,ItemNumber,Calories);
	}

	@Override
	public Item getObject(int id, String name, int price) {
		// TODO Auto-generated method stub
		return null;
	}



}
