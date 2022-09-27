package behavioral.visitor.objectstructure;

import java.util.ArrayList;
import java.util.List;

import behavioral.visitor.element.Product;
import behavioral.visitor.visitor.Visitor;

public class ProductComposite {

	private List<Product> children = new ArrayList<Product>();

	public void add(Product product) {
		this.children.add(product);
	}

	public float accept(Visitor visitor) {
		float total = 0f;
		for (int i = 0; i < this.children.size(); i++) {
			total += this.children.get(i).accept(visitor);
		}
		return total;
	}

}
