package creational.builder;

import creational.builder.director.Cashier;

public class Main {

	public static void main(String[] args) {

		// we have the director class for the theoretical burger restaurant
		Cashier cashier = new Cashier();

		// something happens in the client => the director calls its methods
		// client data is director input
		String input;

		// one client ask for 1 cheese burger, 2 cokes, onion rings and 1 ice cream
		cashier.start();
		input = "cheese burger";
		cashier.makeBurger(input);

		input = "coke";
		cashier.makeDrink(input);
		cashier.makeDrink(input);

		input = "onion rings";
		cashier.makeCompanion(input);

		input = "ice cream";
		cashier.makeDessert(input);

		// print order
		cashier.printOrder();

		// print cost
		System.out.println(cashier.getCost());

		// reset order
		cashier.start();
		System.out.println("new order below should not print anything");
		cashier.printOrder();

		/*
		 * there is no way to delete items from outside of Order class, it causes the
		 * Cashier would have to reset the Order to correct any mistake. It must be
		 * implemented in Order and Cashier classes
		 */

	}

}
