package structural.decorator.decorator;

import structural.decorator.component.Cleaning;

public abstract class CleaningDecorator implements Cleaning {

	private Cleaning cleaning;

	public CleaningDecorator() {
	}

	public CleaningDecorator(Cleaning cleaning) {
		this.cleaning = cleaning;
	}

	@Override
	public double getCost() {
		return cleaning.getCost();
	}

}
