package creational.singleton;

public class AnyObject {

	private String name;

	public AnyObject() {
	}

	public AnyObject(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "State [name=" + name + "]";
	}

}
