package creational.factorymethod.abstractcreatorvariant.product;

public abstract class Car {

	private String model;

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}

	protected abstract double getBasePrice();

	public double getFinalPrice() {
		return this.getBasePrice() * 2;
	}

}
