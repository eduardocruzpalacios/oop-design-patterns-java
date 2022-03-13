package structural.decorator.concretecomponents;

import structural.decorator.component.Cleaning;

public class CarCleaning implements Cleaning {

	@Override
	public double getCost() {
		return 1;
	}

}
