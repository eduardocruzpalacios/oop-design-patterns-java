package behavioral.interpreter.context;

public class AnyString {

	private String state;

	public AnyString() {
		this.state = "";
	}

	public AnyString(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "AnyString [state=" + state + "]";
	}

	public void addAll(AnyString anyString) {
		String finalState = this.getState();
		String stateToAdd = anyString.getState();
		finalState += stateToAdd;
		this.state = finalState;
	}

	public void remove(AnyString anyString) {
		String oldState = this.state;
		String stringToRemove = anyString.getState();
		int indexOfFirstOcurrence = oldState.indexOf(stringToRemove);
		int indexToStartNewState = indexOfFirstOcurrence + stringToRemove.length();
		String newState = oldState.substring(indexToStartNewState, oldState.length());
		this.state = newState;
	}

}
