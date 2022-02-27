package behavioral.memento.caretaker;

public class Snapshot implements Memento {

	private int state;

	public Snapshot(int state) {
		this.state = state;
	}

	@Override
	public int getState() {
		return this.state;
	}

	@Override
	public String toString() {
		return "Snapshot [state=" + state + "]";
	}

}
