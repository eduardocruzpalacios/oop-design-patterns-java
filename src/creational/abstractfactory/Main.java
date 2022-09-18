package creational.abstractfactory;

import creational.abstractfactory.abstractfactory.FurnitureFactory;
import creational.abstractfactory.concretefactory.LivingRoomFurnitureFactory;
import creational.abstractfactory.concretefactory.OfficeFurnitureFactory;
import creational.abstractfactory.concretefactorysingleton.LivingRoomFurnitureFactorySingleton;
import creational.abstractfactory.concretefactorysingleton.OfficeFurnitureFactorySingleton;
import creational.abstractfactory.productfamily1.LivingRoomTable;
import creational.abstractfactory.productfamily1.OfficeTable;
import creational.abstractfactory.productfamily1.Table;
import creational.abstractfactory.productfamily2.Chair;
import creational.abstractfactory.productfamily2.LivingRoomChair;
import creational.abstractfactory.productfamily2.OfficeChair;

public class Main {

	public static void main(String[] args) {

		// instantiation by means of the concrete factory singleton
		FurnitureFactory furnitureFactory1 = LivingRoomFurnitureFactorySingleton.getInstance();
		FurnitureFactory furnitureFactory2 = OfficeFurnitureFactorySingleton.getInstance();

		// each concrete factory is an instance of their superclass
		System.out.println("are concrete factories instances of their superclass?");
		System.out.println(furnitureFactory1 instanceof FurnitureFactory);
		System.out.println(furnitureFactory2 instanceof FurnitureFactory);

		// each instance refers to the concrete factory returned
		System.out.println(
				"is OfficeFurnitureFactory an instance of OfficeFurnitureFactory & LivingRoomFurnitureFactory");
		System.out.println(furnitureFactory1 instanceof OfficeFurnitureFactory);
		System.out.println(furnitureFactory1 instanceof LivingRoomFurnitureFactory);
		System.out.println(
				"is LivingRoomFurnitureFactory an instance of OfficeFurnitureFactory & LivingRoomFurnitureFactory");
		System.out.println(furnitureFactory2 instanceof OfficeFurnitureFactory);
		System.out.println(furnitureFactory2 instanceof LivingRoomFurnitureFactory);

		/*
		 * same logic is applied with concrete objects
		 *
		 * a concrete product created by a concrete factory instance is an instance of
		 * their family product
		 */
		Chair chair1 = furnitureFactory1.createChair();
		System.out.println(
				"is a Chair instance created by OfficeFurnitureFactory an instance of Chair, OfficeChair & LivingRoomChair?");
		System.out.println(chair1 instanceof Chair);
		System.out.println(chair1 instanceof OfficeChair);
		System.out.println(chair1 instanceof LivingRoomChair);

		Table table1 = furnitureFactory1.createTable();
		System.out.println(
				"is a Table instance created by OfficeFurnitureFactory an instance of Table, OfficeTable & LivingRoomTable?");
		System.out.println(table1 instanceof Table);
		System.out.println(table1 instanceof OfficeTable);
		System.out.println(table1 instanceof LivingRoomTable);

		Chair chair2 = furnitureFactory2.createChair();
		System.out.println(
				"is a Chair instance created by LivingRoomFurnitureFactory an instance of Chair, OfficeChair & LivingRoomChair?");
		System.out.println(chair2 instanceof Chair);
		System.out.println(chair2 instanceof OfficeChair);
		System.out.println(chair2 instanceof LivingRoomChair);

		Table table2 = furnitureFactory2.createTable();
		System.out.println(
				"is a Table instance created by LivingRoomFurnitureFactory an instance of Table, OfficeTable & LivingRoomTable?");
		System.out.println(table2 instanceof Table);
		System.out.println(table2 instanceof OfficeTable);
		System.out.println(table2 instanceof LivingRoomTable);

		/*
		 * The client creates a concrete factory
		 *
		 * As the AbstractFactory has methods to return both Chair and Table products,
		 * and as concrete factories override concrete products returned (e.g. the
		 * office factory always creates an office chair), when calling createTable of
		 * the abstract factory method, it is returned the a concrete product of the
		 * appropriate product family
		 */

	}

}
