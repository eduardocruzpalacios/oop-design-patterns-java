package creational.factorymethod.parameterizedcreatorvariant;

import creational.factorymethod.parameterizedcreatorvariant.concreteproduct.SuvCar;
import creational.factorymethod.parameterizedcreatorvariant.concreteproduct.TourismCar;
import creational.factorymethod.parameterizedcreatorvariant.creator.CarCreator;
import creational.factorymethod.parameterizedcreatorvariant.creator.CarType;
import creational.factorymethod.parameterizedcreatorvariant.product.Car;

public class Main {

	public static void main(String[] args) {

		// instantiation by Factory method without specifying the exact class to create
		// the factory does not know which subclass to create, it is told by parameter
		Car car1 = CarCreator.createCar(CarType.SUV);
		Car car2 = CarCreator.createCar(CarType.TOURISM);

		// parent classes instances are instances of subclasses
		System.out.println(car1 instanceof SuvCar);
		System.out.println(car2 instanceof TourismCar);

		// different implementation of the same method in each subclass
		System.out.println(car1.getFinalPrice());
		System.out.println(car2.getFinalPrice());

		// null test
		Car car3 = CarCreator.createCar(null);
		System.out.println(car3);

		/*
		 * in case new concrete products are needed the maintainer would have to create
		 * a new concrete product class extending and implementing Car class and modify
		 * createCar method of CarCreator to be able to return this new concrete product
		 */

	}

}
