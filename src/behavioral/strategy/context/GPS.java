package behavioral.strategy.context;

import behavioral.strategy.model.Coordinate;
import behavioral.strategy.strategies.GoStrategy;

public class GPS {

	private GoStrategy goStrategy;

	public GPS(GoStrategy goStrategy) {
		this.goStrategy = goStrategy;
	}

	public double getTime(Coordinate a, Coordinate b) {
		return this.goStrategy.getMinutes(a, b);
	}

}
