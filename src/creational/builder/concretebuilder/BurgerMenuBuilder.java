package creational.builder.concretebuilder;

import creational.builder.builder.OrderBuilder;
import creational.builder.model.Item;
import creational.builder.model.burger.CheeseBurger;
import creational.builder.model.burger.Veggie;
import creational.builder.model.companion.OnionRings;
import creational.builder.model.dessert.IceCream;
import creational.builder.model.drink.Coke;
import creational.builder.model.drink.Water;
import creational.builder.product.Order;

public class BurgerMenuBuilder implements OrderBuilder {

	private Order order;

	@Override
	public void buildOrder() {
		this.order = new Order();
	}

	@Override
	public void buildMain(String main) {
		Item item = null;
		switch (main) {
		case "cheese burger":
			item = new CheeseBurger();
			break;
		case "veggie":
			item = new Veggie();
			break;
		default:
			break;
		}
		this.order.add(item);
	}

	@Override
	public void buildDrink(String drink) {
		Item item = null;
		switch (drink) {
		case "coke":
			item = new Coke();
			break;
		case "water":
			item = new Water();
			break;
		default:
			break;
		}
		this.order.add(item);
	}

	@Override
	public void buildCompanion(String companion) {
		Item item = null;
		switch (companion) {
		case "onion rings":
			item = new OnionRings();
			break;
		default:
			break;
		}
		this.order.add(item);
	}

	@Override
	public void buildDessert(String dessert) {
		Item item = null;
		switch (dessert) {
		case "ice cream":
			item = new IceCream();
			break;
		default:
			break;
		}
		this.order.add(item);
	}

	@Override
	public Order getOrder() {
		return this.order;
	}

}
