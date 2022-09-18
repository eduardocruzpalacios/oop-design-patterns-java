package creational.builder.builder;

import creational.builder.product.Order;

public interface OrderBuilder {

	public void buildOrder();

	public void buildMain(String main);

	public void buildDrink(String drink);

	public void buildCompanion(String companion);

	public void buildDessert(String dessert);

	public Order getOrder();

}
