package creational.factorymethod.model;

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

	abstract double getBasePrice();

	// super class method that uses the subclass implementation of the method above
	public double getFinalPrice() {
		return this.getBasePrice() * 2;
	}

}
