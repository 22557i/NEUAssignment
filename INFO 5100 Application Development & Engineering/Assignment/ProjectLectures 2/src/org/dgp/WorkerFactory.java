package org.dgp;

import java.util.List;

public class WorkerFactory extends PersonFactoryAPI {

	@Override
	public AbstractPersonAPI getObject() {
		return new Worker();
	}

	@Override
	public AbstractPersonAPI getObject(String csvData) {
		return new Worker(csvData);
	}

	@Override
	public AbstractPersonAPI getObject(List<String> stateList) {
		return new Worker(stateList);
	}

}
