package structural.bridge.abstraction;

import structural.bridge.implementor.Door;

public abstract class DomoticsSystem {

	protected Door door;

	public void setDoor(Door door) {
		this.door = door;
	}

	public abstract void openDoor();

}
