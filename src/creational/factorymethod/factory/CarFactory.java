package creational.factorymethod.factory;

import creational.factorymethod.model.Car;
import creational.factorymethod.model.SuvCar;
import creational.factorymethod.model.TourismCar;

public class CarFactory {

	static public Car getCar(CarType carType) {

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
