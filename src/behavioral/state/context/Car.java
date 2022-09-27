package behavioral.state.context;

import behavioral.state.state.State;

public class Car {

	private State state;

	public void setState(State state) {
		this.state = state;
	}

	public void init() {
		state.init();
	}

	public void stop() {
		state.stop();
	}

}
