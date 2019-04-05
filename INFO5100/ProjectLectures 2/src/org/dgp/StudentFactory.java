package org.dgp;

import java.util.List;

public class StudentFactory extends PersonFactoryAPI {

	@Override
	public AbstractPersonAPI getObject() {
		return new Student();
	}

	@Override
	public AbstractPersonAPI getObject(String csvData) {
		return new Student(csvData);
	}

	@Override
	public AbstractPersonAPI getObject(List<String> stateList) {
		return new Student(stateList);
	}

}
