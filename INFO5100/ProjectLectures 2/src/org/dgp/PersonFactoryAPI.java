package org.dgp;

import java.util.List;

public abstract class PersonFactoryAPI {
	public abstract AbstractPersonAPI getObject();
	public abstract AbstractPersonAPI getObject(String csvData);
	public abstract AbstractPersonAPI getObject(List<String> stateList);

}
