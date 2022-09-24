package structural.bridge.concreteimplementor;

import structural.bridge.implementor.Door;

public class FrontDoor implements Door {

	@Override
	public void open() {
		System.out.println("FrontDoor is open");
	}

}
