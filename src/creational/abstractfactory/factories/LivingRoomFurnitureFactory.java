package creational.abstractfactory.factories;

import creational.abstractfactory.productfamily1.LivingRoomTable;
import creational.abstractfactory.productfamily1.Table;
import creational.abstractfactory.productfamily2.Chair;
import creational.abstractfactory.productfamily2.LivingRoomChair;

public class LivingRoomFurnitureFactory implements AbstractFactory {

	@Override
	public Table createTable() {
		return new LivingRoomTable();
	}

	@Override
	public Chair createChair() {
		return new LivingRoomChair();
	}

}
