package structural.composite.leafs;

import structural.composite.component.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle");
	}

}
