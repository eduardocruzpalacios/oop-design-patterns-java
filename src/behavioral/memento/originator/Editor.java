package behavioral.memento.originator;

import behavioral.memento.caretaker.Memento;
import behavioral.memento.caretaker.Snapshot;

public class Editor implements Originator {

	private int state;

	public void setState(int state) {
		this.state = state;
	}

	public int getState() {
		return this.state;
	}

	@Override
	public Memento save() {
		return new Snapshot(this.state);
	}

	@Override
	public void restore(Memento snapshot) {
		this.state = snapshot.getState();
	}

}
