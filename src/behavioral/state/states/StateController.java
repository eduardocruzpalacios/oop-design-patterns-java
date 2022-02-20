package behavioral.state.states;

import behavioral.state.context.Car;

public class StateController {

	public static Off off = new Off();

	public static void turnOffCar(Car car) {
		car.setState(off);
	}

	private static On on = new On();

	public static void turnOnCar(Car car) {
		car.setState(on);
	}

}
