package behavioral.visitor.visitableconcrete;

import behavioral.visitor.visitable.Product;
import behavioral.visitor.visitor.Cashier;

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
	public float accept(Cashier cashier) {
		return cashier.visit(this);
	}

}
