package creational.builder.model.drinks;

public class Coke extends Drink {

	@Override
	public float getPrice() {
		return 1.5f;
	}

	@Override
	public String toString() {
		return "Coke [getPrice()=" + getPrice() + "]";
	}

}
