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

		/*
		 * in case new states states are needed, the maintainer must do:
		 * 
		 * - create the concrete state class in states packages
		 * 
		 * - the concrete state class implements the State interface
		 * 
		 * - the StateController have the new State as property, and a method that
		 * receives the context and changes its state to the new one
		 */

	}

}
