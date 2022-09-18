package creational.abstractfactory.abstractfactory;

import creational.abstractfactory.productfamily1.Table;
import creational.abstractfactory.productfamily2.Chair;

public interface FurnitureFactory {

	public Table createTable();

	public Chair createChair();

}
