package creational.factorymethod.abstractcreatorvariant;

import creational.factorymethod.abstractcreatorvariant.concretecreator.SuvCarCreator;
import creational.factorymethod.abstractcreatorvariant.concreteproduct.SuvCar;
import creational.factorymethod.abstractcreatorvariant.creator.CarCreator;
import creational.factorymethod.abstractcreatorvariant.product.Car;

public class Main {

	public static void main(String[] args) {

		// client instantiates concrete creator
		CarCreator carCreator = new SuvCarCreator();

		// concrete creator instantiates product
		Car car = carCreator.createCar();

		// product instance is instance of subclass and superclass
		System.out.println(car instanceof Car);
		System.out.println(car instanceof SuvCar);

		// client can use product
		System.out.println(car.getFinalPrice());

	}

}
