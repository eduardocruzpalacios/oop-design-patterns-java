package structural.bridge.concreteimplementor;

import structural.bridge.implementor.Door;

public class InnerDoor implements Door {

	@Override
	public void open() {
		System.out.println("InnerDoor is open");
	}

}
