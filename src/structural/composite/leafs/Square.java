package structural.composite.leafs;

import structural.composite.component.Shape;

public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square");
	}

}
