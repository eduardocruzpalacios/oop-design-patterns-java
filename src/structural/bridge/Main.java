package structural.bridge;

import structural.bridge.abstraction.DomoticsSystem;
import structural.bridge.concreteimplementor.FrontDoor;
import structural.bridge.concreteimplementor.InnerDoor;
import structural.bridge.implementor.Door;
import structural.bridge.refinedabstraction.RectoryDomoticsSystem;
import structural.bridge.refinedabstraction.SportsCenterDomoticsSystem;

public class Main {

	public static void main(String[] args) {

		// initialize refined abstractions of a university domotics system
		DomoticsSystem rectoryDomoticsSystem = new RectoryDomoticsSystem();
		DomoticsSystem sportsCenterDomoticsSystem = new SportsCenterDomoticsSystem();

		// initialize concrete implementors
		Door frontDoor = new FrontDoor();
		Door innerDoor = new InnerDoor();

		// make refined abstraction have the references to the concrete implementors and test methods
		rectoryDomoticsSystem.setDoor(innerDoor);
		rectoryDomoticsSystem.openDoor();
		rectoryDomoticsSystem.setDoor(frontDoor);
		rectoryDomoticsSystem.openDoor();

		sportsCenterDomoticsSystem.setDoor(innerDoor);
		sportsCenterDomoticsSystem.openDoor();
		sportsCenterDomoticsSystem.setDoor(frontDoor);
		sportsCenterDomoticsSystem.openDoor();

	}

}
