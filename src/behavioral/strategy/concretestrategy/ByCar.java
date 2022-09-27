package behavioral.strategy.concretestrategy;

import behavioral.strategy.model.Coordinate;
import behavioral.strategy.strategy.GoStrategy;

public class ByCar implements GoStrategy {

	@Override
	public double getMinutes(Coordinate a, Coordinate b) {
		return Math.abs(a.getLatitude() - b.getLatitude()) + Math.abs(a.getLongitude() - b.getLongitude());
	}

}
