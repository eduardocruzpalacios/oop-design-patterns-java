package behavioral.visitor.concreteelement;

import behavioral.visitor.element.Product;
import behavioral.visitor.visitor.Visitor;

public class Tuna implements Product {

	private int tins;

	public Tuna() {
	}

	public Tuna(int tins) {
		this.tins = tins;
	}

	public int getTins() {
		return tins;
	}

	public void setTins(int tins) {
		this.tins = tins;
	}

	@Override
	public String toString() {
		return "Tuna [tins=" + tins + "]";
	}

	@Override
	public float accept(Visitor visitor) {
		return visitor.visit(this);
	}

}
