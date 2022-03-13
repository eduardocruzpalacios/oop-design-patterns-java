package structural.flyweight.context;

import structural.flyweight.flyweight.ObjectType;
import structural.flyweight.model.ObjectStatus;

public class Object {

	private int id;
	private ObjectStatus objectStatus;
	private ObjectType objectType;

	public Object() {
	}

	public Object(int id, ObjectStatus objectStatus, ObjectType objectType) {
		this.id = id;
		this.objectStatus = objectStatus;
		this.objectType = objectType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ObjectStatus getObjectStatus() {
		return objectStatus;
	}

	public void setObjectStatus(ObjectStatus objectStatus) {
		this.objectStatus = objectStatus;
	}

	public ObjectType getObjectType() {
		return objectType;
	}

	public void setObjectType(ObjectType objectType) {
		this.objectType = objectType;
	}

	@Override
	public String toString() {
		return "Object [id=" + id + ", objectStatus=" + objectStatus + ", objectType=" + objectType + "]";
	}

}
