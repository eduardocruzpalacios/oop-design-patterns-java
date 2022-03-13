package structural.flyweight.dao;

import java.util.HashMap;
import java.util.Map;

import structural.flyweight.flyweight.ObjectType;

public class ObjectTypeDao {

	private static Map<String, ObjectType> objects;

	private static void loadObject() {
		objects = new HashMap<String, ObjectType>();
		ObjectType objectType = new ObjectType("Cheap chair", "cheap_chair.gif", 45);
		objects.put(objectType.getName(), objectType);
		objectType = new ObjectType("Regular shower", "regular_shower.gif", 100);
		objects.put(objectType.getName(), objectType);
	}

	public static Map<String, ObjectType> getObjects() {
		loadObject();
		return objects;
	}

}
