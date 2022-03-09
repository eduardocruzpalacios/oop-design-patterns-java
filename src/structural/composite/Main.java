package structural.composite;

import structural.composite.component.Shape;
import structural.composite.composite.CompositeShape;
import structural.composite.leafs.Circle;
import structural.composite.leafs.Square;

public class Main {

	public static void main(String[] args) {

		// initialize leafs
		Shape shape1 = new Circle();
		Shape shape2 = new Square();

		// initialize composite
		CompositeShape compositeShape = new CompositeShape();

		// make leafs to be children of composite
		compositeShape.add(shape1);
		compositeShape.add(shape2);

		/*
		 * call composite method implemented from component-intended class, which loop
		 * all its children calling from each one the method implemented from
		 * component-intended class
		 */
		compositeShape.draw();

	}

}
