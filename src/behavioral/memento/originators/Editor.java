package behavioral.memento.originators;

import behavioral.memento.mementos.Memento;
import behavioral.memento.mementos.Snapshot;

public class Editor implements Originator<Integer> {

	private Integer state;

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return this.state;
	}

	@Override
	public Memento<Integer> save() {
		return new Snapshot(this.state);
	}

	@Override
	public void restore(Memento<Integer> snapshot) {
		this.state = snapshot.getState();
	}

}
