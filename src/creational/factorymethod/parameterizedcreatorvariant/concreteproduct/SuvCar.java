package creational.factorymethod.parameterizedcreatorvariant.concreteproduct;

import creational.factorymethod.parameterizedcreatorvariant.product.Car;

public class SuvCar extends Car {

	@Override
	protected double getBasePrice() {
		return 15000;
	}

}
