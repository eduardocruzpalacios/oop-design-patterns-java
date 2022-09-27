package structural.decorator;

import structural.decorator.component.CleaningMachine;
import structural.decorator.concretecomponent.BikeCleaningMachine;
import structural.decorator.concretecomponent.CarCleaningMachine;
import structural.decorator.concretedecorator.HotWaterCleaning;
import structural.decorator.concretedecorator.HotWaterWithSoapCleaning;
import structural.decorator.decorator.Cleaning;

public class Main {

	public static void main(String[] args) {

		// initialize concrete components

		CleaningMachine carCleaningMachine = new CarCleaningMachine();
		CleaningMachine bikeCleaningMachine = new BikeCleaningMachine();

		// initialize decorators which could be used it dynamically

		Cleaning hotWaterCleaning = new HotWaterCleaning(carCleaningMachine);
		System.out.println("hot water on car: " + hotWaterCleaning.getCost());

		hotWaterCleaning = new HotWaterCleaning(bikeCleaningMachine);
		System.out.println("hot water on bike: " + hotWaterCleaning.getCost());

		Cleaning hotWaterWithSoapCleaning = new HotWaterWithSoapCleaning(carCleaningMachine);
		System.out.println("hot water with soap on car: " + hotWaterWithSoapCleaning.getCost());

		hotWaterWithSoapCleaning = new HotWaterWithSoapCleaning(bikeCleaningMachine);
		System.out.println("hot water with soap on bike: " + hotWaterWithSoapCleaning.getCost());

	}

}
