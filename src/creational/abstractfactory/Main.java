package creational.abstractfactory;

import creational.abstractfactory.factories.AbstractFactory;
import creational.abstractfactory.factories.FactoryCreator;
import creational.abstractfactory.factories.FactoryType;
import creational.abstractfactory.factories.LivingRoomFurnitureFactory;
import creational.abstractfactory.factories.OfficeFurnitureFactory;
import creational.abstractfactory.productfamily1.LivingRoomTable;
import creational.abstractfactory.productfamily1.OfficeTable;
import creational.abstractfactory.productfamily1.Table;
import creational.abstractfactory.productfamily2.Chair;
import creational.abstractfactory.productfamily2.LivingRoomChair;
import creational.abstractfactory.productfamily2.OfficeChair;

public class Main {

	public static void main(String[] args) {

		// instantiation without specifying the exact factory to create
		// factory creator don't know but is told by parameter which factory to create
		AbstractFactory abstractFactory1 = FactoryCreator.getFactory(FactoryType.OFFICE);
		AbstractFactory abstractFactory2 = FactoryCreator.getFactory(FactoryType.LIVING_ROOM);

		// each concrete factory is an instance of their superclass
		System.out.println("are concrete factories instances of their superclass?");
		System.out.println(abstractFactory1 instanceof AbstractFactory);
		System.out.println(abstractFactory2 instanceof AbstractFactory);

		// each instance refers to the concrete factory returned
		System.out.println(
				"is OfficeFurnitureFactory an instance of OfficeFurnitureFactory & LivingRoomFurnitureFactory");
		System.out.println(abstractFactory1 instanceof OfficeFurnitureFactory);
		System.out.println(abstractFactory1 instanceof LivingRoomFurnitureFactory);
		System.out.println(
				"is LivingRoomFurnitureFactory an instance of OfficeFurnitureFactory & LivingRoomFurnitureFactory");
		System.out.println(abstractFactory2 instanceof OfficeFurnitureFactory);
		System.out.println(abstractFactory2 instanceof LivingRoomFurnitureFactory);

		/*
		 * same logic is applied with concrete objects
		 * 
		 * a concrete product created by a concrete factory instance is an instance of
		 * their family product
		 */
		Chair chair1 = abstractFactory1.createChair();
		System.out.println(
				"is a Chair instance created by OfficeFurnitureFactory an instance of Chair, OfficeChair & LivingRoomChair?");
		System.out.println(chair1 instanceof Chair);
		System.out.println(chair1 instanceof OfficeChair);
		System.out.println(chair1 instanceof LivingRoomChair);

		Table table1 = abstractFactory1.createTable();
		System.out.println(
				"is a Table instance created by OfficeFurnitureFactory an instance of Table, OfficeTable & LivingRoomTable?");
		System.out.println(table1 instanceof Table);
		System.out.println(table1 instanceof OfficeTable);
		System.out.println(table1 instanceof LivingRoomTable);

		Chair chair2 = abstractFactory2.createChair();
		System.out.println(
				"is a Chair instance created by LivingRoomFurnitureFactory an instance of Chair, OfficeChair & LivingRoomChair?");
		System.out.println(chair2 instanceof Chair);
		System.out.println(chair2 instanceof OfficeChair);
		System.out.println(chair2 instanceof LivingRoomChair);

		Table table2 = abstractFactory2.createTable();
		System.out.println(
				"is a Table instance created by LivingRoomFurnitureFactory an instance of Table, OfficeTable & LivingRoomTable?");
		System.out.println(table2 instanceof Table);
		System.out.println(table2 instanceof OfficeTable);
		System.out.println(table2 instanceof LivingRoomTable);

		/*
		 * to sum up,
		 * 
		 * The client must have an AbstractFactory instance created by
		 * FactoryCreator.getFactory(...), which does not know which factory to create,
		 * but it is told by parameter
		 * 
		 * Once parameter is received, AbstractFactory instance is an instance of a
		 * concrete factory, as well.
		 * 
		 * As the AbstractFactory has methods to return both Chair and Table products,
		 * and as concrete factories override concrete products returned (e.g. the
		 * office factory always creates an office chair), when calling createTable of
		 * the abstract factory method, it is returned the concrete product instance
		 * supposed to be according to the concrete factory.
		 * 
		 * And as the abstract factory depends on the client to create a concrete
		 * factory, the system would be independent of how its object are created,
		 * composed, and represented.
		 */

	}

}
