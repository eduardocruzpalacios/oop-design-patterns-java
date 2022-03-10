package structural.decorator;

import structural.decorator.component.Cleaning;
import structural.decorator.concretecomponents.BikeCleaning;
import structural.decorator.concretecomponents.CarCleaning;
import structural.decorator.concretedecorators.HotWater;
import structural.decorator.concretedecorators.HotWaterWithSoap;
import structural.decorator.decorator.CleaningDecorator;

public class Main {

	public static void main(String[] args) {

		// initialize components

		Cleaning carCleaning = new CarCleaning();
		System.out.println("cost of cleaning a car: " + carCleaning.getCost());

		Cleaning bikeCleaning = new BikeCleaning();
		System.out.println("cost of cleaning a bike: " + bikeCleaning.getCost());

		// initialize concrete decorators and call method implemented from the component

		CleaningDecorator carCleaningDecorator = new HotWater(carCleaning);
		System.out.println("cost of cleaning a car with hot water: " + carCleaningDecorator.getCost());

		CleaningDecorator bikeCleaningDecorator = new HotWater(bikeCleaning);
		System.out.println("cost of cleaning a bike with hot water: " + bikeCleaningDecorator.getCost());

		carCleaningDecorator = new HotWaterWithSoap(carCleaning);
		System.out.println("cost of cleaning a car with hot water and soap: " + carCleaningDecorator.getCost());

		bikeCleaningDecorator = new HotWaterWithSoap(bikeCleaning);
		System.out.println("cost of cleaning a bike with hot water and soap: " + bikeCleaningDecorator.getCost());

		/*
		 * in case a new concrete decorator is needed, the maintainer must:
		 * 
		 * - create it in concretedecorators package with a constructor using the field
		 * of its superclass, and overriding its superclass method, which is the method
		 * implemented from the component
		 * 
		 * in case a new concrete component is needed, the maintainer must:
		 * 
		 * - create it in concretecomponents package implementing the method from the
		 * component
		 */

	}

}
