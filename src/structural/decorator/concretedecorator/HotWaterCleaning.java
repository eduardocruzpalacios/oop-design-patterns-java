package structural.decorator.concretedecorator;

import structural.decorator.component.CleaningMachine;
import structural.decorator.decorator.Cleaning;

public class HotWaterCleaning extends Cleaning {

	public HotWaterCleaning(CleaningMachine cleaningMachine) {
		super(cleaningMachine);
	}

	@Override
	public double getCost() {
		return super.getCost() + hotWaterSupplement();
	}

	private double hotWaterSupplement() {
		return 1.5;
	}

}
