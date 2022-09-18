package creational.factorymethod.parameterizedcreatorvariant.concreteproduct;

import creational.factorymethod.parameterizedcreatorvariant.product.Car;

public class TourismCar extends Car {

	@Override
	protected double getBasePrice() {
		return 9000;
	}

}
