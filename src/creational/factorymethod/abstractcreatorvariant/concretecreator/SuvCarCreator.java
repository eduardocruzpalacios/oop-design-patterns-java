package creational.factorymethod.abstractcreatorvariant.concretecreator;

import creational.factorymethod.abstractcreatorvariant.concreteproduct.SuvCar;
import creational.factorymethod.abstractcreatorvariant.creator.CarCreator;
import creational.factorymethod.abstractcreatorvariant.product.Car;

public class SuvCarCreator extends CarCreator {

	@Override
	public Car createCar() {
		return new SuvCar();
	}

}
