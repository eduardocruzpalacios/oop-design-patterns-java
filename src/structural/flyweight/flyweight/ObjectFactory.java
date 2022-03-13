package structural.flyweight.flyweight;

import java.util.Map;

public class ObjectFactory {

	private static Map<String, ObjectType> objectTypes;

	public static void setObjectTypes(Map<String, ObjectType> objectTypes) {
		ObjectFactory.objectTypes = objectTypes;
	}

	public static ObjectType getObjectType(String name) {
		return objectTypes.get(name);
	}

}
