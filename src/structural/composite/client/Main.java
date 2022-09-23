package structural.composite.client;

import structural.composite.client.component.Node;
import structural.composite.client.composite.Grouping;
import structural.composite.client.leafs.Circle;
import structural.composite.client.leafs.Square;

public class Main {

	public static void main(String[] args) {

		// initialize composites
		Node composite1 = new Grouping();
		Node composite2 = new Grouping();

		// initialize leafs
		Node leaf1 = new Circle(4);
		Node leaf2 = new Square(3);

		// compound
		composite1.add(composite2);
		composite1.add(leaf1);
		composite2.add(leaf2);

		// call composite operation
		composite1.render();

		// in case a new leaf is needed, the maintainer must create the class in leaf
		// package making it to implement abstract methods

	}

}
