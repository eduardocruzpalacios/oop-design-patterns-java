package creational.factorymethod;

import creational.factorymethod.factory.CarFactory;
import creational.factorymethod.factory.CarType;
import creational.factorymethod.model.Car;
import creational.factorymethod.model.SuvCar;
import creational.factorymethod.model.TourismCar;

public class Main {

	public static void main(String[] args) {

		// instantiation by Factory method without specifying the exact class to create
		// the factory does not know which subclass to create, it is told by parameter
		Car car1 = CarFactory.getCar(CarType.SUV);
		Car car2 = CarFactory.getCar(CarType.TOURISM);

		// parent classes instances are instances of subclasses
		System.out.println(car1 instanceof SuvCar);
		System.out.println(car2 instanceof TourismCar);

		// different implementation of the same method in each subclass
		System.out.println(car1.getFinalPrice());
		System.out.println(car2.getFinalPrice());

		// null test
		Car car3 = CarFactory.getCar(null);
		System.out.println(car3);

	}

}
