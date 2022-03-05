package behavioral.strategy.strategies;

import behavioral.strategy.model.Coordinate;

public class ByWalk implements GoStrategy {

	@Override
	public double getMinutes(Coordinate a, Coordinate b) {
		return Math.abs(a.getLatitude() - b.getLatitude()) * Math.abs(a.getLongitude() - b.getLongitude());
	}

}
