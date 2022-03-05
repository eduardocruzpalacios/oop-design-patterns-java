package behavioral.memento.mementos;

public class Snapshot implements Memento<Integer> {

	private Integer state;

	public Snapshot(Integer state) {
		this.state = state;
	}

	@Override
	public Integer getState() {
		return this.state;
	}

	@Override
	public String toString() {
		return "Snapshot [state=" + state + "]";
	}

}
