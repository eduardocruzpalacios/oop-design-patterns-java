package creational.builder.builders;

import creational.builder.model.Product;
import creational.builder.model.desserts.Dessert;
import creational.builder.model.desserts.IceCream;

public class DessertBuilder implements ProductBuilder {

	private Dessert dessert;

	@Override
	public void select(String type) {

		switch (type) {
		case "ice cream":
			dessert = new IceCream();
			break;
		default:
			break;
		}

	}

	@Override
	public void prepare() {
		System.out.println("your dessert will be served after your meal!");
	}

	@Override
	public Product get() {
		return dessert;
	}

}
