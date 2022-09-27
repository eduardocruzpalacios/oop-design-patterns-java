package creational.builder;

import creational.builder.builder.OrderBuilder;
import creational.builder.concretebuilder.BurgerMenuBuilder;
import creational.builder.director.Cashier;
import creational.builder.product.Order;

public class Main {

	public static void main(String[] args) {

		// client initializes a concrete builder
		OrderBuilder orderBuilder = new BurgerMenuBuilder();

		// the director receives the builder
		Cashier cashier = new Cashier(orderBuilder);

		// the director constructs the product
		String main = "cheese burger";
		String drink = "coke";
		String companion = "onion rings";
		String dessert = "ice cream";

		Order order = cashier.construct(main, drink, companion, dessert);

		// the client can use the product
		order.printOrder();
		order.printCost();

	}

}
