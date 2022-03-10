package structural.decorator;

import structural.decorator.component.Cleaning;
import structural.decorator.concretecomponents.CarCleaning;
import structural.decorator.concretedecorators.HotWater;
import structural.decorator.concretedecorators.HotWaterWithSoap;
import structural.decorator.decorator.CleaningDecorator;

public class Main {

	public static void main(String[] args) {

		// initialize component
		Cleaning cleaning = new CarCleaning();
		System.out.println("cost of cleaning: " + cleaning.getCost());

		// initialize concrete decorators and call method implemented from the component
		CleaningDecorator cleaningDecorator = new HotWater(cleaning);
		System.out.println("cost of cleaning with hot water: " + cleaningDecorator.getCost());

		cleaningDecorator = new HotWaterWithSoap(cleaning);
		System.out.println("cost of cleaning with hot water and soap: " + cleaningDecorator.getCost());

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
