package creational.abstractfactory.factories;

import creational.abstractfactory.productfamily1.Table;
import creational.abstractfactory.productfamily2.Chair;

public interface AbstractFactory {

	public Table createTable();

	public Chair createChair();

}
