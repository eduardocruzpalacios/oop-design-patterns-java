package behavioral.state.concretestate;

import behavioral.state.state.State;

public class On implements State {

	@Override
	public void init() {
		System.out.println("Release the brake, accelarate");
	}

	@Override
	public void stop() {
		System.out.println("Slow down to 0 km/h, press down the brake, shift to neutral");
	}

}
