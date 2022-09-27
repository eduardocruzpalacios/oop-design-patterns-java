package behavioral.visitor.concreteelement;

import behavioral.visitor.element.Product;
import behavioral.visitor.visitor.Visitor;

public class Coffee implements Product {

	private int grams;

	public Coffee() {
	}

	public Coffee(int grams) {
		this.grams = grams;
	}

	public int getGrams() {
		return grams;
	}

	public void setGrams(int grams) {
		this.grams = grams;
	}

	@Override
	public String toString() {
		return "Coffee [grams=" + grams + "]";
	}

	@Override
	public float accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
