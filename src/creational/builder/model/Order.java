package creational.builder.model;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private List<Product> order = new ArrayList<Product>();

	public void add(Product product) {
		order.add(product);
	}

	public float getCost() {
		float cost = 0f;
		for (Product product : order) {
			cost += product.getPrice();
		}
		return cost;
	}

	public void printOrder() {
		for (Product product : order) {
			System.out.println(product);
		}
	}

}
