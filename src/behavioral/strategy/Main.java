package behavioral.strategy;

import behavioral.strategy.concretestrategy.ByCar;
import behavioral.strategy.concretestrategy.ByWalk;
import behavioral.strategy.context.GPS;
import behavioral.strategy.model.Coordinate;

public class Main {

	public static void main(String[] args) {

		Coordinate coordinate1 = new Coordinate(8, 9);
		Coordinate coordinate2 = new Coordinate(2, 3);

		GPS gps = new GPS(new ByCar());
		double timeByCar = gps.getTime(coordinate1, coordinate2);
		System.out.println("By car you'll get there in " + timeByCar + " minutes.");

		gps = new GPS(new ByWalk());
		double timeByWalkCar = gps.getTime(coordinate1, coordinate2);
		System.out.println("By walk you'll get there in " + timeByWalkCar + " minutes.");

	}

}
