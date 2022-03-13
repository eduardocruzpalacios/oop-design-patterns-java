package structural.decorator.concretedecorators;

import structural.decorator.component.Cleaning;
import structural.decorator.decorator.CleaningDecorator;

public class HotWater extends CleaningDecorator {

	public HotWater(Cleaning cleaning) {
		super(cleaning);
	}

	@Override
	public double getCost() {
		return super.getCost() + 1;
	}

}
