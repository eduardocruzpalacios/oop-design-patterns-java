package creational.builder.model.drinks;

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
