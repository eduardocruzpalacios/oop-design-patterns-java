package structural.decorator.decorator;

import structural.decorator.component.CleaningMachine;

public class Cleaning extends CleaningMachine {

	private CleaningMachine cleaningMachine;

	public Cleaning(CleaningMachine cleaningMachine) {
		this.cleaningMachine = cleaningMachine;
	}

	@Override
	public double getCost() {
		return this.cleaningMachine.getCost();
	}

}
