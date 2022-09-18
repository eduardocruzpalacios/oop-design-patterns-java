package creational.builder.model.dessert;

public class IceCream extends Dessert {

	@Override
	public String toString() {
		return "IceCream [getPrice()=" + getPrice() + "]";
	}

	@Override
	public float getPrice() {
		return 2f;
	}

}
