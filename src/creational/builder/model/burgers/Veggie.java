package creational.builder.model.burgers;

public class Veggie extends Burger {

	@Override
	public float getPrice() {
		return 4.5f;
	}

	@Override
	public String toString() {
		return "Veggie [getPrice()=" + getPrice() + "]";
	}

}
