package structural.decorator.concretecomponent;

import structural.decorator.component.CleaningMachine;

public class BikeCleaningMachine extends CleaningMachine {

	@Override
	public double getCost() {
		return 1;
	}

}
