package behavioral.state;

import behavioral.state.context.Car;
import behavioral.state.states.StateController;

public class Main {

	public static void main(String[] args) {

		// initialize an object
		Car car = new Car("Opel Corsa");

		/*
		 * use the state controller to change the state of our context
		 * 
		 * the context calls the same methods while being in different states
		 */

		StateController.turnOffCar(car);
		car.init();

		StateController.turnOnCar(car);
		car.init();
		car.stop();

		StateController.turnOffCar(car);
		car.stop();

	}

}
