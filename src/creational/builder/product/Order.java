package creational.builder.product;

import java.util.ArrayList;
import java.util.List;

import creational.builder.model.Item;

public class Order {

	private List<Item> items = new ArrayList<Item>();

	private float cost;

	public void add(Item item) {
		this.items.add(item);
	}

	private void calculateCost() {
		this.cost = 0f;
		for (Item item : this.items) {
			cost += item.getPrice();
		}
	}

	public void printOrder() {
		System.out.println("ORDER:");
		for (Item item : this.items) {
			System.out.println(item);
		}
	}

	public void printCost() {
		calculateCost();
		System.out.println("Cost of order: " + this.cost);
	}

}
