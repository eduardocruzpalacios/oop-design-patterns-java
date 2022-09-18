package creational.builder.model.burger;

public class CheeseBurger extends Burger {

	@Override
	public float getPrice() {
		return 5f;
	}

	@Override
	public String toString() {
		return "CheeseBurger [getPrice()=" + getPrice() + "]";
	}

}
