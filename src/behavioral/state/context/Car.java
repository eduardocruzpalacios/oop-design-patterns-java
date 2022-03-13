package behavioral.state.context;

import behavioral.state.states.State;

public class Car {

	private String model;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

	// related to State pattern

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
