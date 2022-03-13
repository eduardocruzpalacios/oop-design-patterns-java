package creational.builder.builders;

import creational.builder.model.Product;
import creational.builder.model.drinks.Coke;
import creational.builder.model.drinks.Drink;
import creational.builder.model.drinks.Water;

public class DrinkBuilder implements ProductBuilder {

	private Drink drink;

	@Override
	public void select(String type) {

		switch (type) {
		case "coke":
			drink = new Coke();
			break;
		case "water":
			drink = new Water();
			break;
		default:
			break;
		}

	}

	@Override
	public void prepare() {
		System.out.println("your drink is being prepared!");
	}

	@Override
	public Product get() {
		return drink;
	}

}
