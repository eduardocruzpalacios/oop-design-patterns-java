package creational.builder.builders;

import creational.builder.model.Product;
import creational.builder.model.burgers.Burger;
import creational.builder.model.burgers.CheeseBurger;
import creational.builder.model.burgers.Veggie;

public class BurgerBuilder implements ProductBuilder {

	private Burger burger;

	@Override
	public void select(String type) {

		switch (type) {
		case "cheese burger":
			burger = new CheeseBurger();
			break;
		case "veggie":
			burger = new Veggie();
			break;
		default:
			break;
		}

	}

	@Override
	public void prepare() {
		System.out.println("your burger is being cooked!");
	}

	@Override
	public Product get() {
		return burger;
	}

}
