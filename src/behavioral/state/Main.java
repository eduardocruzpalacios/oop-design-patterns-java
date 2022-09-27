package behavioral.state;

import behavioral.state.concretestate.Off;
import behavioral.state.concretestate.On;
import behavioral.state.context.Car;
import behavioral.state.state.State;

public class Main {

	public static void main(String[] args) {

		// initialize context
		Car car = new Car();

		// initialize, set and use concrete states
		State state = new Off();

		car.setState(state);

		car.init();
		car.stop();

		state = new On();

		car.setState(state);

		car.init();
		car.stop();

	}

}
