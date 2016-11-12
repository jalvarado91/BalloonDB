package balloondb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Schema {

	private HashMap<String, Class<? extends DataObject>> types;
	private boolean absoluteEntityIntegerity;
	
	public Schema() {
		types = new HashMap<String, Class<? extends DataObject>>();
		absoluteEntityIntegerity = false; 
	}
	
	public boolean typeInSchema(DataObject obj) {
		return types.containsKey(obj.getClass().getName());
	}
	
	public void insert(Class<? extends DataObject> type) {
		if(!types.containsKey(type.getName()))
			types.put(type.getName(), type);
	}

	public HashMap<String, Class<? extends DataObject>> getTypes() {
		return types;
	}
	
	
	public boolean entityIntegerity() {
		return absoluteEntityIntegerity;
	}
	

}