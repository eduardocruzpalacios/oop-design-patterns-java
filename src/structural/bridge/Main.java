package structural.bridge;

import structural.bridge.abstraction.DomoticHouseControl;
import structural.bridge.implementations.Device;
import structural.bridge.implementations.Door;
import structural.bridge.implementations.Fridge;
import structural.bridge.refinedabstractions.SecurityFeature;

public class Main {

	public static void main(String[] args) {

		// initialize refined abstraction
		DomoticHouseControl domoticHouseControl = new SecurityFeature();

		// initialize concrete implementations
		Device door = new Door(false);
		Device fridge = new Fridge(18);

		// make refined abstraction have the references to the concrete implementations
		domoticHouseControl.addDevice("door", door);
		domoticHouseControl.addDevice("fridge", fridge);

		// test implementations logic
		System.out.println(door);
		door.execute("open");
		System.out.println(door);
		door.execute("close");
		System.out.println(door);
		door.execute("fake command");

		System.out.println(fridge);
		fridge.execute("increase");
		System.out.println(fridge);
		fridge.execute("decrease");
		System.out.println(fridge);
		fridge.execute("fake command");

		/*
		 * test high-level control logic of the refined abstraction over their
		 * implementations
		 */
		domoticHouseControl.execute("open", "door");
		System.out.println(door);

		domoticHouseControl.execute("decrease", "fridge");
		System.out.println(fridge);

		((SecurityFeature) domoticHouseControl).executeSafed("close", "door", "wrong code");
		System.out.println(door);

		((SecurityFeature) domoticHouseControl).executeSafed("close", "door", "2022");
		System.out.println(door);

	}

}
