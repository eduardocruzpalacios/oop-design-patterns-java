package structural.composite.client.leafs;

import structural.composite.client.component.Node;

public class Circle extends Node {

	private float radius;

	public Circle() {
	}

	public Circle(float radius) {
		this.radius = radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

	@Override
	public void render() {
		System.out.println(2 * Math.PI * this.radius);
	}

}
