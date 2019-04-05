package edu.neu.csye6200;

import java.util.List;

import edu.neu.csye6200.Electronics;
import edu.neu.csye6200.Item;
import edu.neu.csye6200.AbstractItemFactoryAPI;

public class ElectronicsFactory extends AbstractItemFactoryAPI {

	@Override
	public Electronics getObject() {
		return new Electronics();
	}

	public Electronics getObject(int id, String name, int price) {
		return new Electronics(id, name, price);
	}

}
