package creational.builder;

import creational.builder.builder.OrderBuilder;
import creational.builder.concretebuilder.BurgerMenuBuilder;
import creational.builder.director.Cashier;
import creational.builder.product.Order;

public class Main {

	public static void main(String[] args) {

		// client initializes a concrete builder
		OrderBuilder orderBuilder = new BurgerMenuBuilder();

		// director receives builder
		Cashier cashier = new Cashier(orderBuilder);

		// director constructs product
		String main = "cheese burger";
		String drink = "coke";
		String companion = "onion rings";
		String dessert = "ice cream";

		Order order = cashier.construct(main, drink, companion, dessert);

		// client can use product
		order.printOrder();
		order.printCost();

	}

}
