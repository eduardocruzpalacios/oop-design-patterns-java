package creational.factorymethod.parameterizedcreatorvariant.creator;

import creational.factorymethod.parameterizedcreatorvariant.concreteproduct.SuvCar;
import creational.factorymethod.parameterizedcreatorvariant.concreteproduct.TourismCar;
import creational.factorymethod.parameterizedcreatorvariant.product.Car;

public class CarCreator {

	static public Car createCar(CarType carType) {
		if (carType == null) {
			return null;
		}
		switch (carType) {
		case SUV:
			return new SuvCar();
		case TOURISM:
			return new TourismCar();
		default:
			return null;
		}
	}

}
