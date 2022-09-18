package creational.prototype.client.model;

public class Representation {

	private String string;

	public Representation() {
	}

	public Representation(String string) {
		this.string = string;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	@Override
	public String toString() {
		return "Representation [string=" + string + "]";
	}

}
