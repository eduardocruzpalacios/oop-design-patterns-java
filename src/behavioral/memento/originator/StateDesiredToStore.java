package behavioral.memento.originator;

import behavioral.memento.memento.Memento;

public class StateDesiredToStore {

	private Integer state;

	public StateDesiredToStore() {
	}

	public StateDesiredToStore(Integer state) {
		this.state = state;
	}

	public void setMemento(Memento memento) {
		this.state = memento.getState();
	}

	public Memento createMemento() {
		return new Memento(this.state);
	}

}
