package structural.flyweight.context;

public class Square {

	private int id;
	private boolean full;

	public Square() {
	}

	public Square(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isFull() {
		return full;
	}

	public void setFull(boolean full) {
		this.full = full;
	}

}
