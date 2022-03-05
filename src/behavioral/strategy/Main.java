package behavioral.strategy;

import behavioral.strategy.context.GPS;
import behavioral.strategy.model.Coordinate;
import behavioral.strategy.strategies.ByCar;
import behavioral.strategy.strategies.ByWalk;

public class Main {

	public static void main(String[] args) {

		// starting point & destination
		Coordinate coordinate1 = new Coordinate(8, 9);
		Coordinate coordinate2 = new Coordinate(2, 3);

		// navigator
		GPS gps;

		// select concrete strategy, execute algorithm & print result
		gps = new GPS(new ByCar());
		double timeByCar = gps.getTime(coordinate1, coordinate2);
		System.out.println("By car you'll get there in " + timeByCar + " minutes.");

		// select concrete strategy, execute algorithm & print result
		gps = new GPS(new ByWalk());
		double timeByWalkCar = gps.getTime(coordinate1, coordinate2);
		System.out.println("By walk you'll get there in " + timeByWalkCar + " minutes.");

		/*
		 * in case a new concrete strategy is needed, the maintainer must:
		 * 
		 * - create concrete strategy in strategies package, implementing GoStrategy
		 * interface
		 */

	}

}
