package creational.abstractfactory.concretefactorysingleton;

import creational.abstractfactory.concretefactory.LivingRoomFurnitureFactory;

public class LivingRoomFurnitureFactorySingleton {

	private static LivingRoomFurnitureFactory instance = new LivingRoomFurnitureFactory();

	public static LivingRoomFurnitureFactory getInstance() {
		return instance;
	}

}
