package behavioral.state.states;

public class Off implements State {

	@Override
	public void init() {
		System.out.println("Put the key in and turn it, press down the brake, release the hand brake");
	}

	@Override
	public void stop() {
		System.out.println("Press the hand brake down, release the brake, turn and remove the key");
	}

}
