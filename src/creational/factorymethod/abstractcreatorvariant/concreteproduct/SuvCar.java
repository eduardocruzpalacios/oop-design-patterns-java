package creational.factorymethod.abstractcreatorvariant.concreteproduct;

import creational.factorymethod.abstractcreatorvariant.product.Car;

public class SuvCar extends Car {

	@Override
	protected double getBasePrice() {
		return 15000;
	}

}
