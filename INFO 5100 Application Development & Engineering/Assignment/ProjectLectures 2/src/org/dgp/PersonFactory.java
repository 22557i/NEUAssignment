package org.dgp;

import java.util.List;

public class PersonFactory extends PersonFactoryAPI {
	public AbstractPersonAPI getObject() {
		return new Person();
	}
	public AbstractPersonAPI getObject(String csvData) {
		return new Person(csvData);
	}
	public AbstractPersonAPI getObject(List<String> stateList) {
		return new Person(stateList);
	}
}
