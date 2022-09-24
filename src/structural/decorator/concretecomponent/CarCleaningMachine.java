package structural.decorator.concretecomponent;

import structural.decorator.component.CleaningMachine;

public class CarCleaningMachine extends CleaningMachine {

	@Override
	public double getCost() {
		return 4;
	}

}
