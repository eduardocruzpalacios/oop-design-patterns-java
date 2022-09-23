package structural.composite.client.composite;

import java.util.ArrayList;
import java.util.List;

import structural.composite.client.component.Node;

public class Grouping extends Node {

	private List<Node> children = new ArrayList<Node>();

	@Override
	public void add(Node node) {
		this.children.add(node);
	}

	@Override
	public void remove(Node node) {
		this.children.remove(node);
	}

	@Override
	public List<Node> getChildren() {
		return this.children;
	}

	@Override
	public void render() {
		this.children.forEach(e -> {
			e.render();
		});
	}

	@Override
	public Grouping getGrouping() {
		return this;
	}

}
