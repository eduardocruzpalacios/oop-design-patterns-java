package creational.abstractfactory.factories;

import creational.abstractfactory.productfamily1.OfficeTable;
import creational.abstractfactory.productfamily1.Table;
import creational.abstractfactory.productfamily2.Chair;
import creational.abstractfactory.productfamily2.OfficeChair;

public class OfficeFurnitureFactory implements AbstractFactory {

	@Override
	public Table createTable() {
		return new OfficeTable();
	}

	@Override
	public Chair createChair() {
		return new OfficeChair();
	}

}
