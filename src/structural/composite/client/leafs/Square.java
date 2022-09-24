package structural.composite.client.leafs;

import structural.composite.client.component.Node;

public class Square extends Node {

	private float width;

	public Square() {
	}

	public Square(float width) {
		this.width = width;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Square [width=" + width + "]";
	}

	@Override
	public void render() {
		System.out.println(width*4);
	}

}
