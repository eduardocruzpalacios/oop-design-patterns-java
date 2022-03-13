package creational.abstractfactory.factories;

public class FactoryCreator {

	static public AbstractFactory getFactory(FactoryType factoryType) {

		if (factoryType == null) {
			return null;
		}

		switch (factoryType) {
		case OFFICE:
			return new OfficeFurnitureFactory();
		case LIVING_ROOM:
			return new LivingRoomFurnitureFactory();
		default:
			return null;
		}

	}

}
