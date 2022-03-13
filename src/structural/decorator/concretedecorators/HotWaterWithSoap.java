package structural.decorator.concretedecorators;

import structural.decorator.component.Cleaning;
import structural.decorator.decorator.CleaningDecorator;

public class HotWaterWithSoap extends CleaningDecorator {

	public HotWaterWithSoap(Cleaning cleaning) {
		super(cleaning);
	}

	@Override
	public double getCost() {
		return super.getCost() + 1.5;
	}

}
