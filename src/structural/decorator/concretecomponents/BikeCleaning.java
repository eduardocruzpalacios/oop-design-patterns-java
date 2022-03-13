package structural.decorator.concretecomponents;

import structural.decorator.component.Cleaning;

public class BikeCleaning implements Cleaning {

	@Override
	public double getCost() {
		return .75;
	}

}
