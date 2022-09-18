package creational.abstractfactory.concretefactorysingleton;

import creational.abstractfactory.concretefactory.OfficeFurnitureFactory;

public class OfficeFurnitureFactorySingleton {

	private static OfficeFurnitureFactory instance = new OfficeFurnitureFactory();

	public static OfficeFurnitureFactory getInstance() {
		return instance;
	}

}
