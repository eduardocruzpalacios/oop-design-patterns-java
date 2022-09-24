package structural.composite.client.component;

import java.util.List;

import structural.composite.client.composite.Grouping;

public abstract class Node {

	public void add(Node node) {
		Grouping grouping = this.getGrouping();
		if (grouping instanceof Grouping) {
			grouping.add(node);
		}
	}

	public void remove(Node node) {
		Grouping grouping = this.getGrouping();
		if (grouping instanceof Grouping) {
			grouping.remove(node);
		}
	}

	public List<Node> getChildren() {
		Grouping grouping = this.getGrouping();
		if (grouping instanceof Grouping) {
			return grouping.getChildren();
		}
		return null;
	}

	public abstract void render();

	public Grouping getGrouping() {
		return null;
	}

}
