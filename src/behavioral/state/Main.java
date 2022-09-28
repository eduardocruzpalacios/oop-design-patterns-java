package behavioral.state;

import behavioral.state.concretestate.Off;
import behavioral.state.concretestate.On;
import behavioral.state.context.Car;
import behavioral.state.state.State;

public class Main {

	public static void main(String[] args) {

		// Context
		Car car = new Car();

		// instantiate, set and use State
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
