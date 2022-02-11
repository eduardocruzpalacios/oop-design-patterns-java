package creational.prototype;

public class AnyObject implements Prototype {

	private int quantity;

	public AnyObject() {
	}

	public AnyObject(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "AnyObject [quantity=" + quantity + "]";
	}

	// prototype constructor
	public AnyObject(AnyObject anyObject) {
		this.quantity = anyObject.getQuantity();
	}

	// call prototype constructor passing itself as parameter
	@Override
	public Prototype getClone() {
		return new AnyObject(this);
	}

}
