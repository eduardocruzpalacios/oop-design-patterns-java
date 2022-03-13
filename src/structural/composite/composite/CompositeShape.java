package structural.composite.composite;

import java.util.ArrayList;
import java.util.List;

import structural.composite.component.Shape;

public class CompositeShape implements Shape {

	private List<Shape> children = new ArrayList<Shape>();

	public void add(Shape shape) {
		this.children.add(shape);
	}

	@Override
	public void draw() {
		this.children.forEach(e -> e.draw());
	}

}
