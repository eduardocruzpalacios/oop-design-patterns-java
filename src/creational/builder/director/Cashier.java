package creational.builder.director;

import creational.builder.builders.BurgerBuilder;
import creational.builder.builders.CompanionBuilder;
import creational.builder.builders.DessertBuilder;
import creational.builder.builders.DrinkBuilder;
import creational.builder.model.Order;

public class Cashier {

	private Order order;

	private BurgerBuilder burgerBuilder = new BurgerBuilder();
	private DrinkBuilder drinkBuilder = new DrinkBuilder();
	private CompanionBuilder companionBuilder = new CompanionBuilder();
	private DessertBuilder dessertBuilder = new DessertBuilder();

	public void start() {
		order = new Order();
	}

	public void makeBurger(String type) {
		burgerBuilder.select(type);
		burgerBuilder.prepare();
		order.add(burgerBuilder.get());
	}

	public void makeDrink(String type) {
		drinkBuilder.select(type);
		drinkBuilder.prepare();
		order.add(drinkBuilder.get());
	}

	public void makeCompanion(String type) {
		companionBuilder.select(type);
		companionBuilder.prepare();
		order.add(companionBuilder.get());
	}

	public void makeDessert(String type) {
		dessertBuilder.select(type);
		dessertBuilder.prepare();
		order.add(dessertBuilder.get());
	}

	public void printOrder() {
		order.printOrder();
	}

	public float getCost() {
		return order.getCost();
	}

}
