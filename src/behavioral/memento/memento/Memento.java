package behavioral.memento.memento;

public class Memento {

	private Integer state;

	public Memento() {
	}

	public Memento(Integer state) {
		this.state = state;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

}
