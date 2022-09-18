package creational.builder.director;

import creational.builder.builder.OrderBuilder;
import creational.builder.product.Order;

public class Cashier {

	private OrderBuilder orderBuilder;

	public Cashier(OrderBuilder orderBuilder) {
		this.orderBuilder = orderBuilder;
	}

	public Order construct(String main, String drink, String companion, String dessert) {
		orderBuilder.buildOrder();
		orderBuilder.buildMain(main);
		orderBuilder.buildDrink(drink);
		orderBuilder.buildCompanion(companion);
		orderBuilder.buildDessert(dessert);
		return orderBuilder.getOrder();
	}

}
