package structural.decorator.concretedecorator;

import structural.decorator.component.CleaningMachine;
import structural.decorator.decorator.Cleaning;

public class HotWaterWithSoapCleaning extends Cleaning {

	public HotWaterWithSoapCleaning(CleaningMachine cleaningMachine) {
		super(cleaningMachine);
	}

	@Override
	public double getCost() {
		return super.getCost() + hotWaterWithSoapSupplement();
	}

	private double hotWaterWithSoapSupplement() {
		return 5;
	}

}
