package creational.builder.model.drink;

public class Water extends Drink {

	@Override
	public float getPrice() {
		return 1f;
	}

	@Override
	public String toString() {
		return "Water [getPrice()=" + getPrice() + "]";
	}

}
